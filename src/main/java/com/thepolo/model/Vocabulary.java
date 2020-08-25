package com.thepolo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Antoine on 22/02/2017.
 */

@Entity
@Table(name="vocabulary")
public class Vocabulary {

    /*************************** Attributs ***************************/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private Integer id;
	
	@Column(name="word")
    private String word;
	
	@Column(name="pronunciation")
    private String pronunciation;
	
	@Column(name="meaning1")
    private String meaning1;
	
	@Column(name="meaning2")
    private String meaning2;
	
	@Column(name="meaning3")
    private String meaning3;
	
	@Column(name="searchCount")
	private Integer searchCount;

    /*************************** Getter/setter ***************************/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getMeaning1() {
        return meaning1;
    }

    public void setMeaning1(String meaning1) {
        this.meaning1 = meaning1;
    }

    public String getMeaning2() {
        return meaning2;
    }

    public void setMeaning2(String meaning2) {
        this.meaning2 = meaning2;
    }

    public String getMeaning3() {
        return meaning3;
    }

    public void setMeaning3(String meaning3) {
        this.meaning3 = meaning3;
    }
    
    public Integer getSearchCount() {
		return searchCount;
	}

	public void setSearchCount(Integer searchCount) {
		this.searchCount = searchCount;
	}

	/*************************** Constructeurs ***************************/

    public Vocabulary() {
        super();
    }

    public Vocabulary(String word, String pronunciation, String meaning1, String meaning2, String meaning3) {
        super();
        this.word = word;
        this.pronunciation = pronunciation;
        this.meaning1 = meaning1;
        this.meaning2 = meaning2;
        this.meaning3 = meaning3;
    }

    public Vocabulary(Integer id, String word, String pronunciation, String meaning1, String meaning2, String meaning3) {
        super();
        this.id = id;
        this.word = word;
        this.pronunciation = pronunciation;
        this.meaning1 = meaning1;
        this.meaning2 = meaning2;
        this.meaning3 = meaning3;
    }
    
    public Vocabulary(Integer id, String word, String pronunciation, String meaning1, String meaning2, String meaning3, Integer searchCount) {
        super();
        this.id = id;
        this.word = word;
        this.pronunciation = pronunciation;
        this.meaning1 = meaning1;
        this.meaning2 = meaning2;
        this.meaning3 = meaning3;
        this.searchCount = searchCount;
    }

    /****************************** Methodes *****************************/

    @Override
    public boolean equals(Object obj) {
        Vocabulary other = (Vocabulary) obj;
        if (word.equals(other.word)){
            return true;
        }else if (pronunciation.equals(other.pronunciation) && meaning1.equals(other.meaning1) && meaning2.equals(other.meaning2) && meaning3.equals(other.meaning3)){
        	return true;
        }
        else {
            return false;
        }
    }
    
    @Override
	public String toString() {
		return "Vocabulaire [id=" + id + ", word=" + word
				+ ", pronunciation=" + pronunciation + ", meaning1=" + meaning1
				+ ", meaning2=" + meaning2 + ", meaning3=" + meaning3 + "]";
	}
}
