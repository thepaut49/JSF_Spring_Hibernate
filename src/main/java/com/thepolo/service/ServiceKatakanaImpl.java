package com.thepolo.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.thepolo.dao.IDaoKatakana;
import com.thepolo.model.Katakana;



@Service
public class ServiceKatakanaImpl implements IServiceKatakana {


	@Autowired
	private IDaoKatakana katakanaDao;
	
	
//	public void setHiraganaDao(IDaoKatakana katakanaDao) {
//		this.katakanaDao = katakanaDao;
//	}
	
	

	public ServiceKatakanaImpl() {
		super();
	}
	
	
	
	public IDaoKatakana getKatakanaDao() {
		return katakanaDao;
	}


	public void update(Katakana caractere) {
		katakanaDao.update(caractere);
	}
	
	
	public void delete(Katakana caractere) {
		katakanaDao.delete(caractere);
	}

	
	public List<Katakana> selectAll() {
		return katakanaDao.selectAll();
	}

	
	public Katakana findCaractereById(Integer id) {
		return katakanaDao.findCaractereById(id);
	}

	
	public void create(Katakana caractere) {
		katakanaDao.create(caractere);	
	}

}
