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
@Table(name="names")
public class Names {

    /*************************** Attributs ***************************/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private Integer id;
	
	@Column(name="word")
    private String word;
	
	@Column(name="pronunciation")
    private String pronunciation;


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

    /*************************** Constructeurs ***************************/

    public Names() {
        super();
    }

    public Names(String word, String pronunciation) {
        super();
        this.word = word;
        this.pronunciation = pronunciation;
    }

    public Names(Integer id, String word, String pronunciation) {
        super();
        this.id = id;
        this.word = word;
        this.pronunciation = pronunciation;
    }

    /****************************** Methodes *****************************/

    @Override
    public boolean equals(Object obj) {
        Names other = (Names) obj;
        if (word.equals(other.word) && pronunciation.equals(other.pronunciation)){
            return true;
        }else {
            return false;
        }
    }
    
    @Override
	public String toString() {
		return "Name [id=" + id + ", word=" + word
				+ ", pronunciation=" + pronunciation + "]";
	}
}
