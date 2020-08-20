package com.thepolo.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thepolo.dao.IDaoVocabulaire;
import com.thepolo.model.Radical;
import com.thepolo.model.Vocabulaire;

@Controller(value="vocabulaireMb")
@SessionScoped
public class VocabulaireMb {
	
	@Autowired
	private IDaoVocabulaire daoVocabulaire;
	
	private Vocabulaire newVocabulaire;
	
	private Vocabulaire selectedVocabulaire;
	
	private List<Vocabulaire> listeResultat;
	
	private String kanji;
	
	private String kana;
	
	private String sens;
	
	
	
	/******* Getter - setter ********/
	
	public Vocabulaire getNewVocabulaire() {
		return newVocabulaire;
	}

	public IDaoVocabulaire getDaoVocabulaire() {
		return daoVocabulaire;
	}

	public void setDaoVocabulaire(IDaoVocabulaire daoVocabulaire) {
		this.daoVocabulaire = daoVocabulaire;
	}

	public void setNewVocabulaire(Vocabulaire newVocabulaire) {
		this.newVocabulaire = newVocabulaire;
	}

	public Vocabulaire getSelectedVocabulaire() {
		return selectedVocabulaire;
	}

	public void setSelectedVocabulaire(Vocabulaire selectedVocabulaire) {
		this.selectedVocabulaire = selectedVocabulaire;
	}

	
	public List<Vocabulaire> getListeResultat() {
		return listeResultat;
	}

	public void setListeResultat(List<Vocabulaire> listeResultat) {
		this.listeResultat = listeResultat;
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

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	/******* Constructor ********/
	
	public VocabulaireMb() {
		super();
	}
	
	@PostConstruct
	public void init() {
		newVocabulaire = new Vocabulaire();
		selectedVocabulaire = new Vocabulaire();
		listeResultat = daoVocabulaire.selectAll();
		kanji = "";
		kana = "";
		sens = "";
	}
	
	/******* Méthodes  ********/
	
	
	public void ajouterVocabulaire(){
		daoVocabulaire.create(newVocabulaire);
		newVocabulaire = new Vocabulaire();
	}

	public void modifierVocabulaire(){
		daoVocabulaire.update(selectedVocabulaire);
		selectedVocabulaire = new Vocabulaire();
	}
	
	public void reinitialiserRecherche(){
		listeResultat = daoVocabulaire.selectAll();
		kanji = "";
		kana = "";
		sens = "";
	}
	
	public void rechercherByKanji(){
		listeResultat = daoVocabulaire.findMotByKanji(kanji);
		System.out.println("Recherche par kanji !!!!!!");
		for(Vocabulaire mot : listeResultat){
			System.out.println(mot);
		}
		
	}
	
	public void rechercherByKana(){
		listeResultat = daoVocabulaire.findMotByKana(kana);
		System.out.println("Recherche par kana !!!!!!");
		for(Vocabulaire mot : listeResultat){
			System.out.println(mot);
		}
		
	}
	
	public void rechercherBySens(){
		listeResultat = daoVocabulaire.findMotBySens(sens);
		System.out.println("Recherche par sens !!!!!!");
		for(Vocabulaire mot : listeResultat){
			System.out.println(mot);
		}
		
	}
	
	public void showSelectedVocabulaire(SelectEvent event){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheVocabulaire').show();");
	}
	
	public void closePopUpVocabulaire(){
		selectedVocabulaire = new Vocabulaire();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheVocabulaire').hide();");	
	}

}
