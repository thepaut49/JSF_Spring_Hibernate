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

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;
import com.thepolo.service.IServiceKanji;


@Controller(value = "rechercheKanjiMb")
@SessionScoped
public class RechercheKanjiMb {

	@Autowired
	private IServiceKanji service;
	
	private Kanji selectedKanji;
	
	private List<String> radicalsList;
	
	private String kanji;
	
	private String kana;
	
	private String meaning;
	
	private List<Kanji> resultList;
	


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
	

	public List<Kanji> getResultList() {
		return resultList;
	}

	public void setResultList(List<Kanji> resultList) {
		this.resultList = resultList;
	}

	/****** Constructeur ******/
	public RechercheKanjiMb() {
		super();
	}
	
	

	@PostConstruct
	public void init() {
		selectedKanji = new Kanji();
		radicalsList = Radical.all;
		resultList = service.popularKanji();
	}

	/****** Methodes ******/

	
	public void rechercherBySens(){
		resultList = service.findMotBySens(meaning);	
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
	
	public void rechercherByKanji(){
		resultList = service.findMotByKanji(kanji);
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
	
	public void rechercherByKana(){
		resultList = service.findMotByKana(kana);
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
		kanji = "";
		kana = "";
		meaning = "";
		resultList = new ArrayList<Kanji>();
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
		System.out.println("selectedKanji hide!!!!!!!"+selectedKanji.getCaractere());
	}
	
	public void modifierKana(String chaine){
		kana = kana + chaine;
	}
	

}
