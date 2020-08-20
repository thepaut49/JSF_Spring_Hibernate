package com.thepolo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Vocabulaire;

@Repository
@Transactional
public class daoVocabulaireImpl implements IDaoVocabulaire {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Vocabulaire mot) {
		getSession().save(mot);

	}

	@Override
	public void  update(Vocabulaire mot) {
		getSession().update(mot);
	}

	@Override
	public void delete(Vocabulaire mot) {
		getSession().delete(mot);
	}

	@Override
	public List<Vocabulaire> selectAll() {
		return getSession().createQuery("from Vocabulaire").list();

	}

	@Override
	public Vocabulaire findCaractereById(Integer id) {
		return  (Vocabulaire) getSession().get(Vocabulaire.class, id);
	}

	@Override
	public List<Vocabulaire> findMotByKanji(String kanji) {
		kanji="%"+kanji+"%";
		return getSession().createQuery("FROM Vocabulaire v WHERE v.caractere LIKE ?").setParameter(0, kanji).list();
	}

	@Override
	public List<Vocabulaire> findMotByKana(String kana) {
		kana="%"+kana+"%";
		return getSession().createQuery("FROM Vocabulaire v WHERE v.prononciationKana LIKE ?").setParameter(0, kana).list();
	}

	@Override
	public List<Vocabulaire> findMotBySens(String sens) {
		sens="%"+sens+"%";
		return getSession().createQuery("FROM Vocabulaire v WHERE v.sens LIKE ?").setParameter(0, sens).list();
	}



}
