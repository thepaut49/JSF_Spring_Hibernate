package com.thepolo.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Kanji;
import com.thepolo.model.Vocabulary;

@Repository
@Transactional
public class DaoVocabularyImpl implements IDaoVocabulary {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Vocabulary mot) {
		getSession().save(mot);
	}

	@Override
	public void  update(Vocabulary mot) {
		getSession().update(mot);
	}

	@Override
	public void delete(Vocabulary mot) {
		getSession().delete(mot);
	}

	@Override
	public List<Vocabulary> selectAll() {
		return getSession().createQuery("from Vocabulary").list();
	}

	@Override
	public Vocabulary findCaractereById(Integer id) {
		return  (Vocabulary) getSession().get(Vocabulary.class, id);
	}

	@Override
	public List<Vocabulary> findMotByKanji(String kanji) {
		kanji="%"+kanji+"%";
		return getSession().createQuery("FROM Vocabulary v WHERE v.word LIKE :kanji").setParameter("kanji", kanji).list();
	}
	
	@Override
	public List<Vocabulary> findMotByKanjiAndKana(String kanji) {
		kanji="%"+kanji+"%";
		return getSession().createQuery("FROM Vocabulary v WHERE v.word LIKE :kanji or v.pronunciation LIKE :pronunciation").setParameter("kanji", kanji).setParameter("pronunciation", kanji).list();
	}

	@Override
	public List<Vocabulary> findMotByKana(String kana) {
		kana="%"+kana+"%";
		return getSession().createQuery("FROM Vocabulary v WHERE v.pronunciation LIKE :kana").setParameter("kana", kana).list();
	}

	@Override
	public List<Vocabulary> findMotBySens(String sens) {
		sens="%"+sens+"%";
		return getSession().createQuery("FROM Vocabulary v WHERE v.meaning1 LIKE :sens1 or v.meaning2 LIKE :sens2 or v.meaning3 LIKE :sens3").setParameter("sens1", sens).setParameter("sens2", sens).setParameter("sens3", sens).list();
	}

	@Override
	public List<Vocabulary> popularVoc() {
		return getSession().createQuery("FROM Vocabulary k ORDER BY k.searchCount DESC ").setMaxResults(1000).list();	
	}
	
	
	
}
