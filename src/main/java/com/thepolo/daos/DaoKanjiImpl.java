package com.thepolo.daos;


import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Kanji;

@Repository
@Transactional
public class DaoKanjiImpl implements IDaoKanji {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Kanji kanji) {
		getSession().save(kanji);

	}

	@Override
	public void  update(Kanji kanji) {
		getSession().update(kanji);
	}

	@Override
	public void delete(Kanji kanji) {
		getSession().delete(kanji);
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
	public List<Kanji> findMotByKanji(String kanji) {
		return getSession().createQuery("FROM Kanji k WHERE k.caractere LIKE :kanji").setParameter("kanji", kanji).list();
	}

	@Override
	public List<Kanji> findMotByKana(String kana) {
		kana="%"+kana+"%";
		return getSession().createQuery("FROM Kanji k WHERE k.pronunciation LIKE :kana").setParameter("kana", kana).list();
	}

	@Override
	public List<Kanji> findMotBySens(String sens) {
		sens="%"+sens+"%";
		return getSession().createQuery("FROM Kanji k WHERE k.meaning LIKE :sens").setParameter("sens", sens).list();
	}
	
	@Override
	public List<Kanji> findKanjiByRadicals(String radicals) {
		radicals="%"+radicals+"%";
		return getSession().createQuery("FROM Kanji k WHERE k.radicals LIKE :radicals").setParameter("radicals", radicals).list();
	}

	@Override
	public List<Kanji> findMotBynbreTraitExacte(Integer nbreTrait) {
		return getSession().createQuery("FROM Kanji k WHERE k.strokes = :nbreTrait").setParameter("nbreTrait", nbreTrait).list();
	}

	@Override
	public List<Kanji> findMotBynbreTraitMinMax(Integer min ,Integer max) {
		return getSession().createQuery("FROM Kanji k WHERE k.strokes BETWEEN :min AND :max").setParameter("min", min).setParameter("max", max).list();
	}

	@Override
	public List<Kanji> popularKanji() {
		return getSession().createQuery("FROM Kanji k ORDER BY k.searchCount DESC ").setMaxResults(1000).list();
	}
	

}
