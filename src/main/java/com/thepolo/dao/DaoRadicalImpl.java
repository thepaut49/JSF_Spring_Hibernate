package com.thepolo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;


@Repository
@Transactional
public class DaoRadicalImpl implements IDaoRadical {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Radical caractere) {
		getSession().save(caractere);

	}

	@Override
	public void  update(Radical caractere) {
		getSession().update(caractere);
	}

	@Override
	public void delete(Radical caractere) {
		getSession().delete(caractere);
	}

	@Override
	public List<Radical> selectAll() {
		return getSession().createQuery("from Radical").list();

	}

	@Override
	public Radical findCaractereById(Integer id) {
		Radical caractere =(Radical) getSession().get(Radical.class, id);
		return  caractere;
	}

	@Override
	public List<Radical> findRadicalByIdKanji(Integer id) {
		return getSession().createQuery("SELECT * FROM Radical WHERE Radical.kanji_id=?").setParameter(0, id).list();
	}

}
