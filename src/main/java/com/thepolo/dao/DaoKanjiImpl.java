package com.thepolo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Kanji;
import com.thepolo.model.Vocabulaire;

@Repository
@Transactional
public class DaoKanjiImpl implements IDaoKanji {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Kanji caractere) {
		getSession().save(caractere);

	}

	@Override
	public void  update(Kanji caractere) {
		getSession().update(caractere);
	}

	@Override
	public void delete(Kanji caractere) {
		getSession().delete(caractere);
	}

	@Override
	public List<Kanji> selectAll() {
		return getSession().createQuery("from Kanji").list();

	}

	@Override
	public Kanji findCaractereById(Integer id) {
		return  (Kanji) getSession().get(Kanji.class, id);
	}

	@Override
	public List<Kanji> findKanjiByIdRadical(Integer id) {
		return getSession().createQuery("FROM Kanji k WHERE k.radical_id=?").setParameter(0, id).list();
	}
	
	@Override
	public List<Kanji> findMotByKanji(String kanji) {
		return getSession().createQuery("FROM Kanji k WHERE k.caractere LIKE ?").setParameter(0, kanji).list();
	}

	@Override
	public List<Kanji> findMotByKana(String kana) {
		kana="%"+kana+"%";
		return getSession().createQuery("FROM Kanji k WHERE k.prononciationKana LIKE ?").setParameter(0, kana).list();
	}

	@Override
	public List<Kanji> findMotBySens(String sens) {
		sens="%"+sens+"%";
		return getSession().createQuery("FROM Kanji k WHERE k.sens LIKE ?").setParameter(0, sens).list();
	}

	@Override
	public List<Kanji> findMotBynbreTraitExacte(Integer nbreTrait) {
		return getSession().createQuery("FROM Kanji k WHERE k.nbreTrait = ?").setParameter(0, nbreTrait).list();
	}

	@Override
	public List<Kanji> findMotBynbreTraitMinMax(Integer min ,Integer max) {
		return getSession().createQuery("FROM Kanji k WHERE k.nbreTrait BETWEEN ? AND ?").setParameter(0, min).setParameter(1, max).list();
	}


	
	

}
