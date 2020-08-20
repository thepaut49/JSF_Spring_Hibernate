package com.thepolo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepolo.dao.IDaoKanji;
import com.thepolo.dao.IDaoRadical;
import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;

@Service
public class ServiceRadicalImpl implements IServiceRadical {

	@Autowired
	private IDaoRadical daoRadical;
	
	
	
	public ServiceRadicalImpl() {
		super();
	}

	@Override
	public void create(Radical caractere) {
		daoRadical.create(caractere);
	}

	@Override
	public void update(Radical caractere) {
		daoRadical.update(caractere);
	}

	@Override
	public void delete(Radical caractere) {
		daoRadical.delete(caractere);
	}

	@Override
	public List<Radical> selectAll() {
		
		return daoRadical.selectAll();
	}

	@Override
	public Radical findCaractereById(Integer id) {
		return daoRadical.findCaractereById(id);
	}

	
	public List<Radical> findRadicalByIdKanji(Integer id) {
		return daoRadical.findRadicalByIdKanji(id);
	}
	

}
