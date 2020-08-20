package com.thepolo.model;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="hiragana")
@ManagedBean(name="hiragana")
public class Hiragana implements Serializable{
	

	private static final long serialVersionUID = 1L;

	/**********Attributs***********/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="caractere")
	private String caractere;
	
	@Column(name="prononciation")
	private String prononciation;
	
	/**********Getter-Setter***********/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaractere() {
		return caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	public String getPrononciation() {
		return prononciation;
	}

	public void setPrononciation(String prononciation) {
		this.prononciation = prononciation;
	}
	/**********Constructeurs***********/

	public Hiragana() {
		super();
	}
	
	
	
	public Hiragana(String caractere, String prononciation) {
		super();
		this.caractere = caractere;
		this.prononciation = prononciation;
	}

	/**********methodes***********/
	@Override
	public String toString() {
		return "Hiragana [id=" + id + ", caractere=" + caractere
				+ ", prononciation=" + prononciation + "]";
	}

	
	
	
	
	
	
	
	
}
