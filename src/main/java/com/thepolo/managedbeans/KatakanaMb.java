package com.thepolo.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thepolo.model.Katakana;
import com.thepolo.service.IServiceKatakana;

@Controller(value="katakanaMb")
@SessionScoped
public class KatakanaMb{


	@Autowired
	private IServiceKatakana service;

	private Katakana newKatakana;
	
	/******Getter - Setter ******/
	
	public Katakana getNewKatakana() {
		return newKatakana;
	}
	
	public IServiceKatakana getService() {
		return service;
	}


	public void setService(IServiceKatakana service) {
		this.service = service;
	}

	/******Constructeur ******/
	public KatakanaMb() {
		super();
	}


	@PostConstruct
    public void init() {
		newKatakana = new Katakana();
    }
	
	/******Methode ******/
	
	public void ajouterKatakana(){
		service.create(newKatakana);
	}
	
}
