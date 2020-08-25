package com.thepolo.managedbeans;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;









import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.hibernate.sql.Select;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;
import com.thepolo.service.IServiceKanji;


@Controller(value = "rechercheKanjiByRadicalsMb")
@SessionScoped
public class RechercheKanjiByRadicalsMb {

	@Autowired
	private IServiceKanji service;
	
	private Kanji selectedKanji;
	
	private List<String> radicalsList;
	
	private String radicals;
	
	private List<Kanji> resultList;
	
	private List<Kanji> triList;
	

	/****** Getter - Setter ******/
	
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

	
	public List<Kanji> getResultList() {
		return resultList;
	}

	public void setResultList(List<Kanji> resultList) {
		this.resultList = resultList;
	}

	public String getRadicals() {
		return radicals;
	}

	public void setRadicals(String radicals) {
		this.radicals = radicals;
	}

	/****** Constructeur ******/
	public RechercheKanjiByRadicalsMb() {
		super();
	}
	
	

	@PostConstruct
	public void init() {
		selectedKanji = new Kanji();
		radicalsList = Radical.all;
		resultList = service.popularKanji();
	}

	/****** Methodes ******/

	
	public void rechercherByRadicals(){
		resultList = service.findKanjiByRadicals(radicals);
		if (resultList != null && resultList.size() > 1){
			Collections.sort(resultList, new Comparator<Kanji>() {
			    @Override
			    public int compare(Kanji kanji1, Kanji kanji2) {
			    	int testNombreDeTrait = kanji1.getStrokes() - kanji2.getStrokes();
			    	if (testNombreDeTrait < 0){
			    		return -1;
			    	}else if (testNombreDeTrait > 0){
			    		return 1;
			    	}else {
			    		return 0;
			    	}
			    }
			});
		}		
	}
	
	public void reinitialiserRecherche(){
		radicals = "";
		resultList = new ArrayList<Kanji>();
	}
	
	public void ajouterSelectedRadical(ActionEvent event){
		String radical = (String) event.getComponent().getAttributes().get("radicalSelected2");
		radicals = radicals+radical;
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
