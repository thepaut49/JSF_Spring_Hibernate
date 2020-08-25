package com.thepolo.managedbeans;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.thepolo.daos.IDaoVocabulary;
import com.thepolo.model.Names;
import com.thepolo.model.Vocabulary;


@Controller(value = "vocabularyMb")
@SessionScoped
public class VocabularyMb {

	@Autowired
	private IDaoVocabulary service;

	private Vocabulary newVocabulary;
	
	private Vocabulary selectedVocabulary;
	
	/****** Getter - Setter ******/

	public Vocabulary getNewVocabulary() {
		return newVocabulary;
	}

	public void setNewVocabulary(Vocabulary newVocabulary) {
		this.newVocabulary = newVocabulary;
	}
	
	public Vocabulary getSelectedVocabulary() {
		return selectedVocabulary;
	}

	public void setSelectedVocabulary(Vocabulary selectedVocabulary) {
		this.selectedVocabulary = selectedVocabulary;
	}
	
	public IDaoVocabulary getService() {
		return service;
	}

	public void setService(IDaoVocabulary service) {
		this.service = service;
	}

	/****** Constructeur ******/
	public VocabularyMb() {
		super();
	}

	@PostConstruct
	public void init() {
		newVocabulary = new Vocabulary();
		selectedVocabulary = new Vocabulary();
	}

	/****** Methode Vocabulary ******/
	
	public boolean vocabularyAlreadyExist(){
		List<Vocabulary> vocabularies = service.selectAll();
		for (Vocabulary vocabulary : vocabularies){
			if (vocabulary.equals(newVocabulary)){
				return true;
			}
		}
		return false;
	}

	public void ajouterVocabulary() {
		if (!vocabularyAlreadyExist()){
			newVocabulary.setSearchCount(1);
			service.create(newVocabulary);
			newVocabulary = new Vocabulary();
		}	
	}
	
	public void modifierVocabulary(){
		selectedVocabulary.setSearchCount(selectedVocabulary.getSearchCount() + 1);
		service.update(selectedVocabulary);
		selectedVocabulary = new Vocabulary();
	}
	
	public void supprimerVocabulary(){
		service.delete(selectedVocabulary);
		selectedVocabulary = new Vocabulary();
	}
	
	public void selectionnerVocabulary(){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheVocabulary').show();");
	}
	
	public void showSelectedVocabulary(SelectEvent event){
		selectedVocabulary.setSearchCount(selectedVocabulary.getSearchCount() + 1);
		service.update(selectedVocabulary);
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheVocabulary').show();");
	}
	
	public void closePopUpVocabulary(){
		selectedVocabulary = new Vocabulary();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheVocabulary').hide();");
	}
	
	

}
