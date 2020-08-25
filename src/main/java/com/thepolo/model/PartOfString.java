package com.thepolo.model;
/**
 * Created by Antoine on 25/11/2017.
 */

public class PartOfString {

    //attributes
    private Integer positionInTheString;
    private Vocabulary wordAssociated;
    private Boolean writtenInKanji;
    private Integer longueur;
    private Boolean partieInconnu;


    //getter and setter
    public Vocabulary getWordAssociated() {
        return wordAssociated;
    }

    public void setWordAssociated(Vocabulary wordAssociated) {
        this.wordAssociated = wordAssociated;
    }

    public Integer getPositionInTheString() {
        return positionInTheString;
    }

    public void setPositionInTheString(Integer positionInTheString) {
        this.positionInTheString = positionInTheString;
    }

    public Boolean getWrittenInKanji() {
        return writtenInKanji;
    }

    public void setWrittenInKanji(Boolean writtenInKanji) {
        this.writtenInKanji = writtenInKanji;
    }

    public Integer getLongueur() {
        return longueur;
    }

    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }

    public Boolean getPartieInconnu() {
        return partieInconnu;
    }

    public void setPartieInconnu(Boolean partieInconnu) {
        this.partieInconnu = partieInconnu;
    }

    //Constructor
    public PartOfString() {
    }

    public PartOfString(Integer positionInTheString, Vocabulary wordAssociated) {
        this.positionInTheString = positionInTheString;
        this.wordAssociated = wordAssociated;
    }

    public PartOfString(Integer positionInTheString, Vocabulary wordAssociated, Boolean writtenInKanji, Integer longueur) {
        this.positionInTheString = positionInTheString;
        this.wordAssociated = wordAssociated;
        this.writtenInKanji = writtenInKanji;
        this.longueur = longueur;
    }

    public PartOfString(Integer positionInTheString, Vocabulary wordAssociated, Boolean writtenInKanji, Integer longueur, Boolean partieInconnu) {
        this.positionInTheString = positionInTheString;
        this.wordAssociated = wordAssociated;
        this.writtenInKanji = writtenInKanji;
        this.longueur = longueur;
        this.partieInconnu = partieInconnu;
    }

    //other methods

    @Override
    public boolean equals(Object obj) {
        PartOfString otherPart = (PartOfString) obj;
        if (this.positionInTheString.equals(otherPart.getPositionInTheString()) && this.wordAssociated.equals(otherPart.getWordAssociated())){
            return true;
        }else {
            return false;
        }
    }
}
