package com.thepolo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thepolo.model.Hiragana;


@Repository
@Transactional
public class DaoHiraganaImpl implements IDaoHiragana {

	@Autowired
	private SessionFactory sessionFactory;
	

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	public void create(Hiragana caractere) {
		getSession().save(caractere);

	}

	public void  update(Hiragana caractere) {
		getSession().update(caractere);
	}



	public void delete(Hiragana caractere) {
		getSession().delete(caractere);
	}

	public List<Hiragana> selectAll() {
		return getSession().createQuery("from Hiragana").list();

	}

	public Hiragana findCaractereById(Integer id) {
		Hiragana caractere =(Hiragana) getSession().get(Hiragana.class, id);
		return  caractere;
	}

	
	

}
