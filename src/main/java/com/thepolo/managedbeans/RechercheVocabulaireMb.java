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

import com.thepolo.daos.IDaoVocabulary;
import com.thepolo.model.Kanji;
import com.thepolo.model.Vocabulary;
import com.thepolo.model.Radical;


@Controller(value = "rechercheVocabulaireMb")
@SessionScoped
public class RechercheVocabulaireMb {

	@Autowired
	private IDaoVocabulary service;
	
	private Vocabulary selectedVocabulary;
	
	private List<String> radicalsList;
	
	private String kanji;
	
	private String kana;
	
	private String meaning;
	
	private List<Vocabulary> resultList;
	


	/****** Getter - Setter ******/
	
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

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	

	public List<Vocabulary> getResultList() {
		return resultList;
	}

	public void setResultList(List<Vocabulary> resultList) {
		this.resultList = resultList;
	}

	/****** Constructeur ******/
	public RechercheVocabulaireMb() {
		super();
	}
	
	

	@PostConstruct
	public void init() {
		selectedVocabulary = new Vocabulary();
		radicalsList = Radical.all;
		resultList = service.popularVoc();
	}

	/****** Methodes ******/

	
	public void rechercherBySens(){
		resultList = service.findMotBySens(meaning);		
	}
	
	public void rechercherByKanji(){
		resultList = service.findMotByKanji(kanji);
		if (resultList != null && resultList.size() > 1){
			Collections.sort(resultList, new Comparator<Vocabulary>() {
			    @Override
			    public int compare(Vocabulary voca1, Vocabulary voca2) {
			    	int testLongueur = voca1.getWord().length() - voca2.getWord().length();
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
	
	public String rechercherByKanjiBis(Object param){
		kanji = (String) param;
		resultList = service.findMotByKanji(kanji);
		if (resultList != null && resultList.size() > 1){
			Collections.sort(resultList, new Comparator<Vocabulary>() {
			    @Override
			    public int compare(Vocabulary voca1, Vocabulary voca2) {
			    	int testLongueur = voca1.getWord().length() - voca2.getWord().length();
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
		return "RechercheVocabulaire.xhtml";
	}
	
	public void rechercherByKana(){
		resultList = service.findMotByKana(kana);
		if (resultList != null && resultList.size() > 1){
			Collections.sort(resultList, new Comparator<Vocabulary>() {
			    @Override
			    public int compare(Vocabulary voca1, Vocabulary voca2) {
			    	int testLongueur = voca1.getPronunciation().length() - voca2.getPronunciation().length();
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
		meaning = "";
		resultList = service.popularVoc();
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
	
	public void modifierKana(String chaine){
		kana = kana + chaine;
	}

}
