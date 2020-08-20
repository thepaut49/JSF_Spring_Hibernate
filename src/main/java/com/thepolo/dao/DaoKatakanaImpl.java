package com.thepolo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Katakana;


@Repository
@Transactional
public class DaoKatakanaImpl implements IDaoKatakana {

	@Autowired
	private SessionFactory sessionFactory;
	

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	public void create(Katakana caractere) {
		getSession().save(caractere);

	}

	public void  update(Katakana caractere) {
		getSession().update(caractere);
	}



	public void delete(Katakana caractere) {
		getSession().delete(caractere);
	}

	public List<Katakana> selectAll() {
		return getSession().createQuery("from Katakana").list();

	}

	public Katakana findCaractereById(Integer id) {
		Katakana caractere =(Katakana) getSession().get(Katakana.class, id);
		return  caractere;
	}

	
	

}
