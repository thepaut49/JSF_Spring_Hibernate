package com.thepolo.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Names;

@Repository
@Transactional
public class DaoNamesImpl implements IDaoNames {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Names  mot) {
		getSession().save(mot);
	}

	@Override
	public void  update(Names mot) {
		getSession().update(mot);
	}

	@Override
	public void delete(Names mot) {
		getSession().delete(mot);
	}

	@Override
	public List<Names> selectAll() {
		return getSession().createQuery("from Names").list();
	}

	@Override
	public Names findCaractereById(Integer id) {
		return  (Names) getSession().get(Names.class, id);
	}

	@Override
	public List<Names> findMotByKanji(String kanji) {
		kanji="%"+kanji+"%";
		return getSession().createQuery("FROM Names v WHERE v.word LIKE ?").setParameter(0, kanji).list();
	}

	@Override
	public List<Names> findMotByKana(String kana) {
		kana="%"+kana+"%";
		return getSession().createQuery("FROM Names v WHERE v.pronunciation LIKE ?").setParameter(0, kana).list();
	}
}
