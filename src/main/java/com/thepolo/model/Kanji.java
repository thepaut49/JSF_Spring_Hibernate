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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table(name="kanji")
public class Kanji implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private Integer id;
	
	
	private String caractere;
	
	
	private String prononciationKana;
	
	
	private String sens;
	
	
	private Integer nbreTrait;
	
	
//	@JoinTable(name="kanji_radical",joinColumns=
//	@JoinColumn(name="kanji_id",referencedColumnName="kanji_id"),
//	inverseJoinColumns=@JoinColumn(name="radical_id",referencedColumnName="radical_id"))
//	@ManyToMany(fetch = FetchType.EAGER,targetEntity = Radical.class, cascade = {CascadeType.PERSIST})
//	@JoinTable(name = "kanji_radical", joinColumns = {
//			@JoinColumn(name = "kanji_id")
//			}, inverseJoinColumns = {
//			@JoinColumn(name = "radical_id")
//			})
//	private List<Radical> radicaux = new ArrayList<Radical>();
	
	
	private List<Radical> radicaux = new ArrayList<Radical>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="kanji_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="nbre_trait")
	public String getCaractere() {
		return caractere;
	}

	@Column(name="caractere")
	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	@Column(name="prononciationKana")
	public String getPrononciationKana() {
		return prononciationKana;
	}

	public void setPrononciationKana(String prononciationKana) {
		this.prononciationKana = prononciationKana;
	}

	@Column(name="sens")
	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}
	
	public Integer getNbreTrait() {
		return nbreTrait;
	}

	public void setNbreTrait(Integer nbreTrait) {
		this.nbreTrait = nbreTrait;
	}

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.EAGER)
	@JoinTable(name = "kanji_radical", joinColumns = {
			@JoinColumn(name = "kanji_id",referencedColumnName="kanji_id")
			}, inverseJoinColumns = {
			@JoinColumn(name = "radical_id",referencedColumnName="radical_id")
			})
	public List<Radical> getRadicaux() {
		return radicaux;
	}

	public void setRadicaux(List<Radical> radicaux) {
		this.radicaux = radicaux;
	}

	/**********Constructeurs***********/
	
	public Kanji() {
		super();
	}
	
	public Kanji(String caractere, String prononciationKana, String sens, Integer nbreTrait) {
		super();
		this.caractere = caractere;
		this.prononciationKana = prononciationKana;
		this.sens = sens;
		this.nbreTrait = nbreTrait;
	}
	

	public Kanji(String caractere, String prononciationKana, String sens,
			Integer nbreTrait, List<Radical> radicaux) {
		super();
		this.caractere = caractere;
		this.prononciationKana = prononciationKana;
		this.sens = sens;
		this.nbreTrait = nbreTrait;
		this.radicaux = radicaux;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((caractere == null) ? 0 : caractere.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nbreTrait == null) ? 0 : nbreTrait.hashCode());
		result = prime
				* result
				+ ((prononciationKana == null) ? 0 : prononciationKana
						.hashCode());
		result = prime * result
				+ ((radicaux == null) ? 0 : radicaux.hashCode());
		result = prime * result + ((sens == null) ? 0 : sens.hashCode());
		return result;
	}

	

	/**********Methodes***********/

	
	@Override
	public boolean equals(Object obj) {
		Kanji other = (Kanji) obj;
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
