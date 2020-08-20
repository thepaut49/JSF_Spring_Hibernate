package com.thepolo.managedbeans;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thepolo.model.Hiragana;
import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;
import com.thepolo.service.IServiceHiragana;
import com.thepolo.service.IServiceKanji;
import com.thepolo.service.IServiceRadical;

@Controller(value="radicalMb")
@SessionScoped
public class RadicalMb{


	@Autowired
	private IServiceRadical service;
	
	@Autowired
	private IServiceKanji serviceKanji;
	
	private Radical selectedRadical;
	
	private List<Radical> listeRadicaux;
	
	private List<Kanji> listeResultats;
	
	private List<Radical> selectedRadicaux;
	
	private Kanji selectedKanji;
	
	/******Getter - Setter ******/
	
	
	public Radical getSelectedRadical() {
		return selectedRadical;
	}

	public void setSelectedRadical(Radical selectedRadical) {
		System.out.println("setter selectedRadical");
		Radical radical = new Radical(selectedRadical.getCaractere(),
				selectedRadical.getNbreTrait(), selectedRadical.getSens());
		radical.setId(selectedRadical.getId());
		radical.setKanjis(selectedRadical.getKanjis());
		this.selectedRadical = radical;
	}

	public IServiceRadical getService() {
		return service;
	}


	public void setService(IServiceRadical service) {
		this.service = service;
	}

	public IServiceKanji getServiceKanji() {
		return serviceKanji;
	}

	public void setServiceKanji(IServiceKanji serviceKanji) {
		this.serviceKanji = serviceKanji;
	}

	public List<Kanji> getListeResultats() {
		return listeResultats;
	}

	public void setListeResultats(List<Kanji> listeResultats) {
		this.listeResultats = listeResultats;
	}

	public List<Radical> getSelectedRadicaux() {
		return selectedRadicaux;
	}

	public void setSelectedRadicaux(List<Radical> selectedRadicaux) {
		this.selectedRadicaux = selectedRadicaux;
	}

	public List<Radical> getListeRadicaux() {
		return listeRadicaux;
	}

	public void setListeRadicaux(List<Radical> listeRadicaux) {
		this.listeRadicaux = listeRadicaux;
	}

	public Kanji getSelectedKanji() {
		return selectedKanji;
	}

	public void setSelectedKanji(Kanji selectedKanji) {
		this.selectedKanji = selectedKanji;

	}

	/******Constructeur ******/
	public RadicalMb() {
		super();
	}


	@PostConstruct
    public void init() {
		selectedRadical = new Radical();
		listeResultats = serviceKanji.selectAll();
		selectedRadicaux = new ArrayList<Radical>();
		listeRadicaux = service.selectAll();
		selectedKanji = new Kanji();
    }
	
	/******Methode ******/
	
	public void ajouterRadical(ActionEvent event){
		selectedRadical = (Radical) event.getComponent().getAttributes().get("radicalSelected");
		selectedRadicaux.add(selectedRadical);
		listeRadicaux.remove(selectedRadical);
		selectedRadical = new Radical();
	}
	
	public void retirerRadical(ActionEvent event){
		selectedRadical = (Radical) event.getComponent().getAttributes().get("radicalSelected");
		selectedRadicaux.remove(selectedRadical);
		listeRadicaux.add(selectedRadical);
		selectedRadical = new Radical();
	}
	
	public void selectionnerKanji(){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').show();");
	}
	
	
	public void reinitialiserRecherche(){
		System.out.println("reinitialiser totototo");
		selectedRadical = new Radical();
		listeResultats = serviceKanji.selectAll();
		selectedRadicaux = new ArrayList<Radical>();
		listeRadicaux = service.selectAll();
		selectedKanji = new Kanji();
	}
	
	public void rechercherKanji(){
		System.out.println("rechercher tototot");
		List<Kanji> listeTemp = new ArrayList<Kanji>();
	    for(Kanji kanji : listeResultats){
	    	boolean addKanji = true;
	    	
			for(Radical radical : selectedRadicaux){	
				if (kanji.getRadicaux().size()<selectedRadicaux.size()){
		    		addKanji = false;
		    		break;
		    	}
				List<Radical> listeTempRadical = kanji.getRadicaux();
				if (!listeTempRadical.contains(radical)){
					addKanji = false;
		    		break;
				}

			}
			if (addKanji){
				listeTemp.add(kanji);
			}
		}
	    listeResultats = listeTemp;
	}
	
	public void closePopUpKanji(){
		selectedKanji = new Kanji();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').hide();");	
	}
	
	public void closePopUpRadical(){
		selectedRadical = new Radical();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheRadical').hide();");	
	}
	
}
