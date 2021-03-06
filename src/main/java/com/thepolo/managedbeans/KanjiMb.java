package com.thepolo.managedbeans;


import java.util.List;






import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.hibernate.sql.Select;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;
import com.thepolo.service.IServiceKanji;


@Controller(value = "kanjiMb")
@SessionScoped
public class KanjiMb {

	@Autowired
	private IServiceKanji service;

	private Kanji newKanji;
	
	private Kanji selectedKanji;
	
	private List<String> radicalsList;
	


	/****** Getter - Setter ******/

	public Kanji getNewKanji() {
		return newKanji;
	}

	public void setNewKanji(Kanji newKanji) {
		this.newKanji = newKanji;
	}
	
	public Kanji getSelectedKanji() {
		return selectedKanji;
	}

	public void setSelectedKanji(Kanji selectedKanji) {
		this.selectedKanji = selectedKanji;
	}
	
	public IServiceKanji getService() {
		return service;
	}

	public void setService(IServiceKanji service) {
		this.service = service;
	}
	
	public List<String> getRadicalsList() {
		return radicalsList;
	}

	public void setRadicalsList(List<String> radicalsList) {
		this.radicalsList = radicalsList;
	}

	/****** Constructeur ******/
	public KanjiMb() {
		super();

	}

	@PostConstruct
	public void init() {
		newKanji = new Kanji();
		selectedKanji = new Kanji();
		radicalsList = Radical.all;
	}

	/****** Methode Kanji ******/
	
	
	public boolean kanjiAlreadyExist(){
		List<Kanji> kanjiList = service.selectAll();
		for (Kanji kanji : kanjiList){
			if (kanji.equals(newKanji)){
				return true;
			}
		}
		return false;
	}

	public void ajouterKanji() {
		if (!kanjiAlreadyExist()){
			newKanji.setSearchCount(1);
			service.create(newKanji);
			newKanji = new Kanji();
		}
	}
	
	public void modifierKanji(){
		selectedKanji.setSearchCount(selectedKanji.getSearchCount() + 1);
		service.update(selectedKanji);
		selectedKanji = new Kanji();
	}
	
	public void supprimerKanji(){
		service.delete(selectedKanji);
		selectedKanji = new Kanji();
	}
	
	public void ajouterSelectedRadical(ActionEvent event){
		String radical = (String) event.getComponent().getAttributes().get("radicalSelected");
		newKanji.setRadicals(newKanji.getRadicals()+radical);
	}
	
	public void selectionnerKanji(){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').show();");
	}
	
	public void showSelectedKanji(SelectEvent event){
		selectedKanji.setSearchCount(selectedKanji.getSearchCount() + 1);
		service.update(selectedKanji);
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').show();");
	}
	
	public void closePopUpKanji(){
		selectedKanji = new Kanji();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').hide();");
	}	
	

}
