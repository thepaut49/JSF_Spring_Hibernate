package com.thepolo.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thepolo.model.Hiragana;
import com.thepolo.service.IServiceHiragana;

@Controller(value="hiraganaMb")
@SessionScoped
public class HiraganaMb{


	@Autowired
	private IServiceHiragana service;

	private Hiragana newHiragana;
	
	/******Getter - Setter ******/
	
	public Hiragana getNewHiragana() {
		return newHiragana;
	}
			
	public void setNewHiragana(Hiragana newHiragana) {
		this.newHiragana = newHiragana;
	}


	public IServiceHiragana getService() {
		return service;
	}


	public void setService(IServiceHiragana service) {
		this.service = service;
	}

	/******Constructeur ******/
	public HiraganaMb() {
		super();
	}


	@PostConstruct
    public void init() {
		newHiragana = new Hiragana();
    }
	
	/******Methode ******/
	
	public void ajouterHiragana(){
		service.create(newHiragana);
	}
	
}
