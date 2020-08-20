package com.thepolo.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.context.RequestContext;
import org.springframework.stereotype.Controller;

import com.thepolo.model.Radical;

@Controller(value = "clavierMb")
@SessionScoped
public class ClavierMb {
	
	private String stringToTranslate;
	
	private String stringSaved;
	
	@PostConstruct
	public void init(){
		stringToTranslate = new String();
		stringSaved = new String();
	}

	
	
	public ClavierMb() {
		super();
	}



	public ClavierMb(String stringToTranslate) {
		super();
		this.stringToTranslate = stringToTranslate;
	}



	public String getStringToTranslate() {
		return stringToTranslate;
	}



	public void setStringToTranslate(String stringToTranslate) {
		this.stringToTranslate = stringToTranslate;
	}
	
	
	
	
	
	public String getStringSaved() {
		return stringSaved;
	}



	public void setStringSaved(String stringSaved) {
		this.stringSaved = stringSaved;
	}



	/*** méthodes *****/
	
	public void sauverSaisie() {
		stringSaved = stringToTranslate;
		System.out.println("Save string @@@@@@@@@@" + stringSaved);
	}
	
	public void chargerSaisie(){
		stringToTranslate = stringSaved;
	}
	
	public String insertionRecherche(String param){
		String stringRecherche = param;
		stringToTranslate += stringRecherche; 
		return "JapeneseKeyBoard.xhtml";
	}

}
