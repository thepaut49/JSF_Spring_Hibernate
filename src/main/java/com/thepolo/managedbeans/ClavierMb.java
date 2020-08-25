package com.thepolo.managedbeans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thepolo.daos.IDaoVocabulary;
import com.thepolo.model.Kanji;
import com.thepolo.model.Names;
import com.thepolo.model.PartOfString;
import com.thepolo.model.Vocabulary;
import com.thepolo.service.IServiceKanji;

@Controller(value = "clavierMb")
@SessionScoped
public class ClavierMb {
	
	private String stringToTranslate;
	
	private String stringPronunciation;
	
	private String stringSaved;
	
	private List<Vocabulary> associatedVocabulary;
	
	private List<Kanji> associatedKanji;
	
	@Autowired
	private IServiceKanji serviceKanji;
	
	@Autowired
	private IDaoVocabulary daoVocabulary;
	
	
	@PostConstruct
	public void init(){
		stringToTranslate = new String();
		stringSaved = new String();
		associatedVocabulary = new ArrayList<Vocabulary>();
		associatedKanji = new ArrayList<Kanji>();
		stringPronunciation = "";
	}

	
	
	public ClavierMb() {
		super();
	}


	/*************************** getter/setter **********************************/

	public ClavierMb(String stringToTranslate) {
		super();
		this.stringToTranslate = stringToTranslate;
	}
	
	public List<Vocabulary> getAssociatedVocabulary() {
		return associatedVocabulary;
	}

	public void setAssociatedVocabulary(List<Vocabulary> associatedVocabulary) {
		this.associatedVocabulary = associatedVocabulary;
	}

	public List<Kanji> getAssociatedKanji() {
		return associatedKanji;
	}

	public void setAssociatedKanji(List<Kanji> associatedKanji) {
		this.associatedKanji = associatedKanji;
	}

	public IServiceKanji getServiceKanji() {
		return serviceKanji;
	}

	public void setServiceKanji(IServiceKanji serviceKanji) {
		this.serviceKanji = serviceKanji;
	}

	public IDaoVocabulary getDaoVocabulary() {
		return daoVocabulary;
	}

	public void setDaoVocabulary(IDaoVocabulary daoVocabulary) {
		this.daoVocabulary = daoVocabulary;
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
	
	
	public String getStringPronunciation() {
		return stringPronunciation;
	}


	public void setStringPronunciation(String stringPronunciation) {
		this.stringPronunciation = stringPronunciation;
	}


	/********************************** méthodes *******************************/
	
	public void sauverSaisie() {
		stringSaved = stringToTranslate;
	}
	
	public void chargerSaisie(){
		stringToTranslate = stringSaved;
	}
	
	public String insertionRecherche(Object param){
		String stringRecherche = "";
		if (param instanceof Vocabulary){
			Vocabulary vocabulary = (Vocabulary) param;
			stringRecherche = vocabulary.getWord();
			PartOfString partOfString = new PartOfString();
            partOfString.setPositionInTheString(stringToTranslate.length());
            partOfString.setWordAssociated(vocabulary);
            partOfString.setWrittenInKanji(true);
            partOfString.setLongueur(vocabulary.getWord().length());
            partOfString.setPartieInconnu(false);
            orderList.add(partOfString);		
		} else if (param instanceof Kanji){
			Kanji kanji = (Kanji) param;
			stringRecherche = kanji.getCaractere();
			orderListKanji.add(kanji);
			
		}  else if (param instanceof Names){
			Names names = (Names) param;
			stringRecherche = names.getWord();
		} 
		stringToTranslate += stringRecherche; 
		
		return "JapeneseKeyBoard.xhtml";
	}
	

    private static final ArrayList<PartOfString> orderList = new ArrayList<PartOfString>();
 
    public ArrayList<PartOfString> getOrderList() {
        return orderList;
    }
    
    private static final ArrayList<Kanji> orderListKanji = new ArrayList<Kanji>();
    
    public ArrayList<Kanji> getOrderListKanji() {
        return orderListKanji;
    }
 
    public String addAction() {
        
        sauverSaisie();	
		List<Vocabulary> vocabularyList = new ArrayList<Vocabulary>();
		
		List<Vocabulary> allVocabulary = daoVocabulary.selectAll();
        
        Integer indiceCourant = 0;
        while(indiceCourant < stringToTranslate.length()){
            for(int j = 6;j>0;j--){
                if (indiceCourant+j <=stringToTranslate.length() ){
                	for(Vocabulary voc : allVocabulary){
                        if (stringToTranslate.substring(indiceCourant, indiceCourant+j).equals(voc.getWord())){
                            PartOfString partOfString = new PartOfString();
                            partOfString.setPositionInTheString(indiceCourant);
                            partOfString.setWordAssociated(voc);
                            partOfString.setWrittenInKanji(true);
                            partOfString.setLongueur(voc.getWord().length());
                            partOfString.setPartieInconnu(false);
                            orderList.add(partOfString);
                        } else if (stringToTranslate.substring(indiceCourant, indiceCourant+j).equals(voc.getPronunciation())){
                            PartOfString partOfString = new PartOfString();
                            partOfString.setPositionInTheString(indiceCourant);
                            partOfString.setWordAssociated(voc);
                            partOfString.setWrittenInKanji(false);
                            partOfString.setLongueur(voc.getPronunciation().length());
                            partOfString.setPartieInconnu(false);
                            orderList.add(partOfString);
                        }
                    }	
                }
            }
            indiceCourant = indiceCourant + 1;      
        }	
		
		for(int i=0; i<stringToTranslate.length(); i++){
			List<Kanji> kanji = serviceKanji.findMotByKanji(stringToTranslate.substring(i, i+1)); 
			if (kanji.size() > 0 ){
				for(int j = 0;j<kanji.size();j++){
					if (!orderListKanji.contains(kanji.get(j))){
						orderListKanji.add(kanji.get(j));
					}
				}
				
			}	
		}
		
		if (orderListKanji != null && orderListKanji.size() > 1){
			Collections.sort(orderListKanji, new Comparator<Kanji>() {
			    @Override
			    public int compare(Kanji kanji1, Kanji kanji2) {			    	
			    	int testPosition = stringToTranslate.indexOf(kanji1.getCaractere())  - stringToTranslate.indexOf(kanji2.getCaractere());
			    	if (testPosition < 0){
			    		return -1;
			    	}else if (testPosition > 0){
			    		return 1;
			    	}else {
			    		return 0;
			    	}
			    }
			});
		}	
             
        return null;
    }
    
    public String clearAction() {      
        sauverSaisie();	
        orderList.clear();
        orderListKanji.clear(); 
        stringPronunciation = "";
        return null;
    }
 
    public void moveToLeft(PartOfString vocabulary){
    	Integer i = orderList.indexOf(vocabulary);
    	if (i >= 1 ){
    		Collections.swap(orderList, i, i-1);
    	}
    }
    
    public void moveToRight(PartOfString vocabulary){
    	Integer i = orderList.indexOf(vocabulary);
    	if (i <= orderList.size()-2){
    		Collections.swap(orderList, i, i+1);
    	}
    }

    public void deleteVocabulary(PartOfString vocabulary){
    	orderList.remove(vocabulary);
    }
    
    public void ajoutPartieManquante(){
        Integer indMotSuiv =null;
        String partieManquante = "";
        if (orderList == null || orderList.size() == 0 ){
            Vocabulary voc = new Vocabulary();
            voc.setId(0);
            voc.setWord(stringToTranslate);
            voc.setPronunciation(stringToTranslate);
            PartOfString partOfString = new PartOfString();
            partOfString.setPositionInTheString(0);
            partOfString.setWordAssociated(voc);
            partOfString.setWrittenInKanji(true);
            partOfString.setLongueur(voc.getWord().length());
            partOfString.setPartieInconnu(true);
            orderList.add(partOfString);
        }else {
            if (orderList.get(0).getPositionInTheString() >0 ){
                Vocabulary voc = new Vocabulary();
                voc.setId(0);
                voc.setWord(stringToTranslate.substring(0,orderList.get(0).getPositionInTheString()));
                voc.setPronunciation(stringToTranslate.substring(0,orderList.get(0).getPositionInTheString()));
                PartOfString partOfString = new PartOfString();
                partOfString.setPositionInTheString(0);
                partOfString.setWordAssociated(voc);
                partOfString.setWrittenInKanji(true);
                partOfString.setLongueur(voc.getWord().length());
                partOfString.setPartieInconnu(true);
                orderList.add(0,partOfString);
            }

            if (orderList.size() > 0 ){
                Integer indiceFinDernierMot = orderList.get(orderList.size()-1).getPositionInTheString()+ orderList.get(orderList.size()-1).getLongueur();
                if (indiceFinDernierMot < stringToTranslate.length()){
                    Vocabulary voc = new Vocabulary();
                    voc.setId(0);
                    voc.setWord(stringToTranslate.substring(indiceFinDernierMot));
                    voc.setPronunciation(stringToTranslate.substring(indiceFinDernierMot));
                    PartOfString partOfString = new PartOfString();
                    partOfString.setPositionInTheString(indiceFinDernierMot);
                    partOfString.setWordAssociated(voc);
                    partOfString.setWrittenInKanji(true);
                    partOfString.setLongueur(voc.getWord().length());
                    partOfString.setPartieInconnu(true);
                    orderList.add(orderList.size(),partOfString);
                }
            }

            List<PartOfString> wordToInsert = new ArrayList<>();
            for(int i=0; i<orderList.size()-2;i++){
                if ((orderList.get(i).getPositionInTheString() + orderList.get(i).getLongueur()) < orderList.get(i+1).getPositionInTheString()){
                    indMotSuiv =  orderList.get(i).getPositionInTheString() + orderList.get(i).getLongueur();
                    partieManquante = stringToTranslate.substring(indMotSuiv,orderList.get(i+1).getPositionInTheString());
                    Vocabulary voc = new Vocabulary();
                    voc.setId(0);
                    voc.setWord(partieManquante);
                    voc.setPronunciation(partieManquante);
                    PartOfString partOfString = new PartOfString();
                    partOfString.setPositionInTheString(indMotSuiv);
                    partOfString.setWordAssociated(voc);
                    partOfString.setWrittenInKanji(true);
                    partOfString.setLongueur(voc.getWord().length());
                    partOfString.setPartieInconnu(true);
                    wordToInsert.add(partOfString);
                }
            }

            orderList.addAll(wordToInsert);
            Collections.sort(orderList, new Comparator<PartOfString>() {
                @Override
                public int compare(PartOfString word1, PartOfString word2) {
                    int testPosition = word1.getPositionInTheString()  - word2.getPositionInTheString();
                    if (testPosition < 0){
                        return -1;
                    }else if (testPosition > 0){
                        return 1;
                    }else {
                        return 0;
                    }
                }
            }); 
            
            for(PartOfString word : orderList){
                Integer indicePremierChar = 0;
                Integer indiceDernierChar = 0;
                for(int i = 0;i<word.getWordAssociated().getPronunciation().length();i++){
                    if(!" ".equals(word.getWordAssociated().getPronunciation().substring(i,i+1))){
                        indicePremierChar = i;
                        break;
                    }
                }
                for(int i = indicePremierChar+1;i<word.getWordAssociated().getPronunciation().length();i++){
                    if(" ".equals(word.getWordAssociated().getPronunciation().substring(i,i+1))){
                        indiceDernierChar = i;
                        break;
                    }
                    if (i == word.getWordAssociated().getPronunciation().length()-1 ){
                        indiceDernierChar = word.getWordAssociated().getPronunciation().length();
                    }
                }
                if (indicePremierChar  == indiceDernierChar){
                	indiceDernierChar = indiceDernierChar +1;
                }
                String partToAdd = word.getWordAssociated().getPronunciation().substring(indicePremierChar,indiceDernierChar);
                stringPronunciation = stringPronunciation + partToAdd;
            }
        }
    }  
  
}
