package com.thepolo.model;



import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="kanji")
public class Kanji{
	
	private Integer id;
	
	
	private String caractere;
	
		
	private String pronunciation;
	
	
	private String meaning;
	
	
	private Integer strokes;
	
	
	private String radicals;
	
	
	private Integer searchCount;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="caractere")
	public String getCaractere() {
		return caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	
	@Column(name="pronunciation")
	public String getPronunciation() {
		return pronunciation;
	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}

	@Column(name="meaning")
	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	@Column(name="strokes")
	public Integer getStrokes() {
		return strokes;
	}

	public void setStrokes(Integer strokes) {
		this.strokes = strokes;
	}

	@Column(name="radicals")
	public String getRadicals() {
		return radicals;
	}

	public void setRadicals(String radicals) {
		this.radicals = radicals;
	}
	
	
	@Column(name="searchCount")
	public Integer getSearchCount() {
		return searchCount;
	}

	public void setSearchCount(Integer searchCount) {
		this.searchCount = searchCount;
	}

	/**********Constructeurs***********/
	
	public Kanji() {
		super();
	}
	
	public Kanji(String caractere, String pronunciation, String meaning, Integer strokes) {
		super();
		this.caractere = caractere;
		this.pronunciation = pronunciation;
		this.meaning = meaning;
		this.strokes = strokes;
	}
	
	public Kanji(String caractere, String pronunciation, String meaning, Integer strokes, String radicals) {
		super();
		this.caractere = caractere;
		this.pronunciation = pronunciation;
		this.meaning = meaning;
		this.strokes = strokes;
		this.radicals = radicals;
	}
	
	public Kanji(Integer id, String caractere, String pronunciation, String meaning, Integer strokes, String radicals) {
        super();
        this.id = id;
        this.caractere = caractere;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
        this.strokes = strokes;
        this.radicals = radicals;
    }

	public Kanji(Integer id, String caractere, String pronunciation, String meaning, Integer strokes, String radicals, Integer searchCount) {
        super();
        this.id = id;
        this.caractere = caractere;
        this.pronunciation = pronunciation;
        this.meaning = meaning;
        this.strokes = strokes;
        this.radicals = radicals;
        this.searchCount = searchCount;
    }

	/**********Methodes***********/

	
	@Override
    public boolean equals(Object obj) {
        Kanji other = (Kanji) obj;
        if (caractere.equals(other.caractere)){
            return true;
        }else {
            return false;
        }
    }
	
	@Override
	public String toString() {
		return "Kanji [id=" + id + ", caractere=" + caractere
				+ ", pronunciation=" + pronunciation + ", meaning=" + meaning
				+ ", strokes=" + strokes + ", radicals=" + radicals + "]";
	}
}
