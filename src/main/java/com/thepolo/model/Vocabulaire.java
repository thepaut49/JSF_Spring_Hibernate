package com.thepolo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="vocabulaire")
public class Vocabulaire implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vocabulaire_id")
	private Integer id;
	
	@Column(name="caractere")
	private String caractere;
	
	@Column(name="prononciationKana")
	private String prononciationKana;
	
	@Column(name="sens")
	private String sens;
		
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


	public String getPrononciationKana() {
		return prononciationKana;
	}

	public void setPrononciationKana(String prononciationKana) {
		this.prononciationKana = prononciationKana;
	}

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}
	

	/**********Constructeurs***********/
	
	public Vocabulaire() {
		super();
	}
	
	public Vocabulaire(String caractere, String prononciationKana, String sens) {
		super();
		this.caractere = caractere;
		this.prononciationKana = prononciationKana;
		this.sens = sens;
	}

	/**********Methodes***********/

	@Override
	public String toString() {
		return "Vocabulaire [id=" + id + ", caractere=" + caractere
				+ ", prononciationKana=" + prononciationKana + ", sens=" + sens
				+ "]";
	}

	
	
	

	
	
	
	
	
	
	
	
}
