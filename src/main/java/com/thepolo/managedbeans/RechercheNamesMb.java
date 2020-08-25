package com.thepolo.managedbeans;


import java.util.ArrayList;
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

import com.thepolo.daos.IDaoNames;
import com.thepolo.model.Names;
import com.thepolo.model.Radical;
import com.thepolo.model.Vocabulary;


@Controller(value = "rechercheNamesMb")
@SessionScoped
public class RechercheNamesMb {

	@Autowired
	private IDaoNames service;
	
	private Names selectedNames;
	
	private List<String> radicalsList;
	
	private String kanji;
	
	private String kana;
	
	private List<Names> resultList;
	


	/****** Getter - Setter ******/
	
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
	
	public List<String> getRadicalsList() {
		return radicalsList;
	}

	public void setRadicalsList(List<String> radicalsList) {
		this.radicalsList = radicalsList;
	}

	public String getKanji() {
		return kanji;
	}

	public void setKanji(String kanji) {
		this.kanji = kanji;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}	

	public List<Names> getResultList() {
		return resultList;
	}

	public void setResultList(List<Names> resultList) {
		this.resultList = resultList;
	}

	/****** Constructeur ******/
	public RechercheNamesMb() {
		super();
	}
	
	

	@PostConstruct
	public void init() {
		selectedNames = new Names();
		radicalsList = Radical.all;
		resultList = new ArrayList<Names>();
	}

	/****** Methodes ******/


	public void rechercherByKanji(){
		resultList = service.findMotByKanji(kanji);	
		if (resultList != null && resultList.size() > 1){
			Collections.sort(resultList, new Comparator<Names>() {
			    @Override
			    public int compare(Names name1, Names name2) {
			    	int testLongueur = name1.getWord().length() - name2.getWord().length();
			    	if (testLongueur < 0){
			    		return -1;
			    	}else if (testLongueur > 0){
			    		return 1;
			    	}else {
			    		return 0;
			    	}
			    }
			});
		}
	}
	
	public void rechercherByKana(){
		resultList = service.findMotByKana(kana);
		if (resultList != null && resultList.size() > 1){
			Collections.sort(resultList, new Comparator<Names>() {
			    @Override
			    public int compare(Names name1, Names name2) {
			    	int testLongueur = name1.getPronunciation().length() - name2.getPronunciation().length();
			    	if (testLongueur < 0){
			    		return -1;
			    	}else if (testLongueur > 0){
			    		return 1;
			    	}else {
			    		return 0;
			    	}
			    }
			});
		}
	}
	
	public void reinitialiserRecherche(){
		kanji = "";
		kana = "";
		resultList = new ArrayList<Names>();
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
	
	public void modifierKana(String chaine){
		kana = kana + chaine;
	}

}
