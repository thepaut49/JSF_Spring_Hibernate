package com.thepolo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="radicals")
public class Radical implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**********Attributs***********/
	
	private Integer id;
		
	private String caractere;
	
	private Integer nbreTrait;

	private String sens;
	
	//@ManyToMany(fetch = FetchType.EAGER,targetEntity = Kanji.class, mappedBy = "radicaux", cascade = {CascadeType.PERSIST})
	
	private List<Kanji> kanjis =new ArrayList<Kanji>();
	
	/**********Getter-Setter***********/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="radical_id")
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
		
	@Column(name="nombre_trait")
	public Integer getNbreTrait() {
		return nbreTrait;
	}

	public void setNbreTrait(Integer nbreTrait) {
		this.nbreTrait = nbreTrait;
	}

	@Column(name="sens")
	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	@ManyToMany(mappedBy = "radicaux",cascade={CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.EAGER)
	public List<Kanji> getKanjis() {
		return kanjis;
	}

	public void setKanjis(List<Kanji> kanjis) {
		this.kanjis = kanjis;
	}

	/**********Constructeurs***********/

	public Radical() {
		super();
	}
	

	public Radical(String caractere, Integer nbreTrait, String sens) {
		super();
		this.caractere = caractere;
		this.nbreTrait = nbreTrait;
		this.sens = sens;
	}
	
	

	public Radical(String caractere, Integer nbreTrait, String sens,
			List<Kanji> kanjis) {
		super();
		this.caractere = caractere;
		this.nbreTrait = nbreTrait;
		this.sens = sens;
		this.kanjis = kanjis;
	}

	

	/**********Methodes***********/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((caractere == null) ? 0 : caractere.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kanjis == null) ? 0 : kanjis.hashCode());
		result = prime * result
				+ ((nbreTrait == null) ? 0 : nbreTrait.hashCode());
		result = prime * result + ((sens == null) ? 0 : sens.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Radical other = (Radical) obj;
		if (caractere == null) {
			if (other.caractere != null)
				return false;
		} else {
			if (caractere.equals(other.caractere)){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
