package com.thepolo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name="kanji_radical")
public class KanjiRadicalAssociation {
	
//	@EmbeddedId
//	protected CompositeKey compositeKey;
//
//	@Embeddable
//	public static class CompositeKey implements Serializable {
//	@ManyToOne
//	@JoinColumn(name = "kanji_id")
//	protected Kanji kanji;
//
//	@ManyToOne()
//	@JoinColumn(name = "radical_id")
//	protected Radical radical;
//	}
}
