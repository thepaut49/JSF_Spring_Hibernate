package com.thepolo.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thepolo.dao.IDaoHiragana;
import com.thepolo.model.Hiragana;


@Service
public class ServiceHiraganaImpl implements IServiceHiragana {

	@Autowired
	private IDaoHiragana hiraganaDao;

	public ServiceHiraganaImpl() {
		super();
	}

	public void update(Hiragana caractere) {
		hiraganaDao.update(caractere);
	}
	
	public void delete(Hiragana caractere) {
		hiraganaDao.delete(caractere);
	}

	public List<Hiragana> selectAll() {
		return hiraganaDao.selectAll();
	}

	public Hiragana findCaractereById(Integer id) {
		return hiraganaDao.findCaractereById(id);
	}

	public void create(Hiragana caractere) {
		hiraganaDao.create(caractere);
		
	}

}
