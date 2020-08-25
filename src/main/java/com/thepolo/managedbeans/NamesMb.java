package com.thepolo.managedbeans;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.thepolo.daos.IDaoNames;
import com.thepolo.model.Kanji;
import com.thepolo.model.Names;


@Controller(value = "nameMb")
@SessionScoped
public class NamesMb {

	@Autowired
	private IDaoNames service;

	private Names newNames;
	
	private Names selectedNames;
	
	/****** Getter - Setter ******/

	public Names getNewNames() {
		return newNames;
	}

	public void setNewNames(Names newNames) {
		this.newNames = newNames;
	}
	
	public Names getSelectedNames() {
		return selectedNames;
	}

	public void setSelectedNames(Names selectedNames) {
		this.selectedNames = selectedNames;
	}
	
	public IDaoNames getService() {
		return service;
	}

	public void setService(IDaoNames service) {
		this.service = service;
	}

	/****** Constructeur ******/
	public NamesMb() {
		super();
	}

	@PostConstruct
	public void init() {
		newNames = new Names();
		selectedNames = new Names();
	}

	/****** Methode Names ******/
	
	public boolean nameAlreadyExist(){
		List<Names> namesList = service.selectAll();
		for (Names name : namesList){
			if (name.equals(newNames)){
				return true;
			}
		}
		return false;
	}

	public void ajouterNames() {
		if (!nameAlreadyExist()){
			service.create(newNames);
			newNames = new Names();	
		}	
	}
	
	public void modifierNames(){
		service.update(selectedNames);
		selectedNames = new Names();
	}
	
	public void supprimerNames(){
		service.delete(selectedNames);
		selectedNames = new Names();
	}
	
	public void selectionnerNames(){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheNames').show();");
	}
	
	public void showSelectedNames(SelectEvent event){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheNames').show();");
	}
	
	public void closePopUpNames(){
		selectedNames = new Names();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheNames').hide();");
	}
	
	

}
