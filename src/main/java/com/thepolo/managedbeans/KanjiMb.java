package com.thepolo.managedbeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;
import com.thepolo.model.Vocabulaire;
import com.thepolo.service.IServiceKanji;
import com.thepolo.service.IServiceRadical;

@Controller(value = "kanjiMb")
@SessionScoped
public class KanjiMb {

	@Autowired
	private IServiceKanji service;

	@Autowired
	private IServiceRadical serviceRadical;

	private Kanji newKanji;

	private Kanji selectedKanji;

	private List<Kanji> listeKanji;

	private List<Kanji> listeSelectedKanji;

	private String radicauxString;

	private Radical selectedRadical;

	private Radical newRadical;

	private List<Radical> selectedRadicaux;

	private List<Radical> listeRadicaux;

	private String kanji;

	private String kana;

	private String sens;

	private Integer nbreTraitExacte;

	private Integer nbreTraitMin;

	private Integer nbreTraitMax;
	
	private List<Kanji> listeResultats;
	

	

	/****** Getter - Setter ******/

	public Kanji getNewKanji() {
		return newKanji;
	}

	public void setNewKanji(Kanji newKanji) {
		this.newKanji = newKanji;
	}

	public Kanji getSelectedKanji() {
		return selectedKanji;
	}

	public void setSelectedKanji(Kanji selectedKanji) {
		this.selectedKanji = selectedKanji;
	}

	public List<Kanji> getListeSelectedKanji() {
		return listeSelectedKanji;
	}

	public void setListeSelectedKanji(List<Kanji> listeSelectedKanji) {
		this.listeSelectedKanji = listeSelectedKanji;
	}

	public IServiceKanji getService() {
		return service;
	}

	public void setService(IServiceKanji service) {
		this.service = service;
	}

	public List<Radical> getSelectedRadicaux() {
		return selectedRadicaux;
	}

	public void setSelectedRadicaux(List<Radical> selectedRadicaux) {
		this.selectedRadicaux = selectedRadicaux;
	}

	public String getRadicauxString() {
		return radicauxString;
	}

	public void setRadicauxString(String radicauxString) {
		this.radicauxString = radicauxString;
	}

	public List<Kanji> getListeKanji() {
		return service.selectAll();
	}

	public void setListeKanji(List<Kanji> listeKanji) {
		this.listeKanji = listeKanji;
	}

	public Radical getSelectedRadical() {
		return selectedRadical;
	}

	public void setSelectedRadical(Radical selectedRadical) {
		Radical radical = new Radical(selectedRadical.getCaractere(),
				selectedRadical.getNbreTrait(), selectedRadical.getSens());
		radical.setId(selectedRadical.getId());
		radical.setKanjis(selectedRadical.getKanjis());
		this.selectedRadical = radical;
	}

	public Radical getNewRadical() {
		return newRadical;
	}

	public void setNewRadical(Radical newRadical) {
		this.newRadical = newRadical;
	}

	public List<Radical> getListeRadicaux() {
		return serviceRadical.selectAll();
	}

	public void setListeRadicaux(List<Radical> listeRadicaux) {
		this.listeRadicaux = listeRadicaux;
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

	public Integer getNbreTraitExacte() {
		return nbreTraitExacte;
	}

	public void setNbreTraitExacte(Integer nbreTraitExacte) {
		this.nbreTraitExacte = nbreTraitExacte;
	}

	public Integer getNbreTraitMin() {
		return nbreTraitMin;
	}

	public void setNbreTraitMin(Integer nbreTraitMin) {
		this.nbreTraitMin = nbreTraitMin;
	}

	public Integer getNbreTraitMax() {
		return nbreTraitMax;
	}

	public void setNbreTraitMax(Integer nbreTraitMax) {
		this.nbreTraitMax = nbreTraitMax;
	}
	
	public List<Kanji> getListeResultats() {
		return listeResultats;
	}

	public void setListeResultats(List<Kanji> listeResultats) {
		this.listeResultats = listeResultats;
	}

	/****** Constructeur ******/
	public KanjiMb() {
		super();

	}

	@PostConstruct
	public void init() {
		newKanji = new Kanji();
		selectedKanji = new Kanji();
		newRadical = new Radical();
		selectedRadical = new Radical();
		selectedRadicaux = serviceRadical.selectAll();
		listeSelectedKanji = service.selectAll();
		nbreTraitExacte = null;
		nbreTraitMin = 0;
		nbreTraitMax = 30;
		listeResultats = service.selectAll();
	}

	/****** Methode Kanji ******/

	public void ajouterKanji() {
		service.create(newKanji);
		newKanji = new Kanji();
		selectedRadicaux = serviceRadical.selectAll();
	}

	public void modifierKanji(ActionEvent event) {
		selectedKanji = (Kanji) event.getComponent().getAttributes().get("kanjiModifier");
		selectedKanji.setRadicaux(null);
		service.update(selectedKanji);
		selectedKanji = new Kanji();
	}

	public void supprimerKanji() {
		service.delete(selectedKanji);
		selectedKanji = new Kanji();
	}

	public boolean correspondanceListe(List<Radical> listeRadicauxKanji,
			List<Radical> selectedRadicaux) {
		for (Radical radicalSelectionne : selectedRadicaux) {
			if (!listeRadicauxKanji.contains(radicalSelectionne)) {
				return false;
			}
		}
		return true;
	}

	public List<Kanji> findKanjiByListRadical() {
		List<Kanji> listeResultats = service
				.findKanjiByIdRadical(selectedRadicaux.get(0).getId());
		for (Kanji kanji : listeResultats) {
			if (correspondanceListe(kanji.getRadicaux(), selectedRadicaux) == false) {
				listeResultats.remove(kanji);
			}
		}
		return listeResultats;
	}

	public void removeKanjiFromSelection() {
		newRadical.getKanjis().remove(selectedKanji);
	}

	public void addKanjiToSelection() {
		System.out.println("addToSelection : !!!! "
				+ selectedKanji.getCaractere());
		System.out.println("addToSelection : !!!! " + newRadical);
		List<Kanji> listeRetour = newRadical.getKanjis();
		listeRetour.add(selectedKanji);
		newRadical.setKanjis(listeRetour);

	}

	public void dontAddKanjiToSelection() {
		System.out.println("DontAddToSelection : !!!! "
				+ selectedKanji.getCaractere());
		selectedKanji = new Kanji();
	}

	public void findMotBynbreTraitExacte() {
		listeSelectedKanji = service.findMotBynbreTraitExacte(nbreTraitExacte);
	}

	public void findMotBynbreTraitMinMax() {
		listeSelectedKanji = service.findMotBynbreTraitMinMax(nbreTraitMin,nbreTraitMax);
	}

	public void reinitialiserRecherche() {
		listeSelectedKanji = service.selectAll();
		nbreTraitExacte = null;
		nbreTraitMin = 0;
		nbreTraitMax = 30;
	}

	public void TriParNbreTrait() {
		for (int i = 0; i <= listeSelectedKanji.size() - 2; i++) {
			for (int j = listeSelectedKanji.size() - 1; i < j; j--) {
				if (listeSelectedKanji.get(j).getNbreTrait() < listeSelectedKanji
						.get(j - 1).getNbreTrait()) {
					Kanji kanjiTemp = listeSelectedKanji.get(j - 1);
					listeSelectedKanji.set(j - 1, listeSelectedKanji.get(j));
					listeSelectedKanji.set(j, kanjiTemp);
				}
			}
		}
	}
	
	public void selectionnerKanji(){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').show();");

	}

	/****** Methode Radical ******/
	public void ajouterRadical() {
		serviceRadical.create(newRadical);
		newRadical = new Radical();
		selectedRadicaux = serviceRadical.selectAll();
	}

	public void modifierRadical() {
		serviceRadical.update(selectedRadical);
		selectedRadical = new Radical();
		selectedRadicaux = serviceRadical.selectAll();
	}

	public void supprimerRadical() {
		serviceRadical.delete(selectedRadical);
		selectedRadical = new Radical();
	}

	public void reinitialiserSelectionKanji() {
		listeSelectedKanji = service.selectAll();
	}

	public void removeRadicalFromSelection() {
		newKanji.getRadicaux().remove(selectedRadical);
	}

	public void addRadicalToSelection() {
		newKanji.getRadicaux().add(selectedRadical);
	}
	
	public void ajouterSelectedRadical(ActionEvent event){
		System.out.println("ajouter selected Radical");
		selectedRadical = (Radical) event.getComponent().getAttributes().get("radicalSelected");
		System.out.println("selected radical :::::: "+selectedRadical);
		selectedRadicaux.remove(selectedRadical);
		List<Radical> listeResultats = newKanji.getRadicaux();
		for(Radical radical : listeResultats){
			System.out.println("liste Resuslat avnt :::::: "+radical);
		}

		listeResultats.add(selectedRadical);
		for(Radical radical : listeResultats){
			System.out.println("liste Resuslat apres :::::: "+radical);
		}
		newKanji.setRadicaux(listeResultats);
		for(Radical radical : newKanji.getRadicaux()){
			System.out.println("newKanji apres :::::: "+radical);
		}
	}
	
	public void enleverSelectedRadical(ActionEvent event){
		System.out.println("enlever selected Radical");
		selectedRadical = (Radical) event.getComponent().getAttributes().get("radicalSelected");
		
		System.out.println("selected radical :::::: "+selectedRadical);
		selectedRadicaux.add(selectedRadical);
		List<Radical> listeResultats = newKanji.getRadicaux();
		listeResultats.remove(selectedRadical);
		newKanji.setRadicaux(listeResultats);
	}
	
	
	/******* Autre type de recherche************/
	public void reinitialiserAutreRecherche(){
		listeResultats = service.selectAll();
		kanji = "";
		kana = "";
		sens = "";
	}
	
	public void rechercherByKanji(){
		listeResultats = service.findMotByKanji(kanji);
		System.out.println("Recherche par kanji !!!!!!"+kanji);

		
	}
	
	public void rechercherByKana(){
		listeResultats = service.findMotByKana(kana);
		System.out.println("Recherche par kana !!!!!!"+kana);
		
	}
	
	public void rechercherBySens(){
		listeResultats = service.findMotBySens(sens);
		System.out.println("Recherche par sens !!!!!!"+sens);
		
	}
	
	public void showSelectedKanji(SelectEvent event){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').show();");
	}
	
	public void showSelectedRadical(SelectEvent event){
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheRadical').show();");
	}
	
	public void closePopUpKanji(){
		selectedKanji = new Kanji();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheKanji').hide();");
		System.out.println("selectedKanji hide!!!!!!!"+selectedKanji.getCaractere());
	}
	
	public void closePopUpRadical(){
		selectedRadical = new Radical();
		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('ficheRadical').hide();");	
	}
}
