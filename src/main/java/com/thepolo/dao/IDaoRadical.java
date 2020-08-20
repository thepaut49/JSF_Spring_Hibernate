package com.thepolo.dao;

import java.util.List;

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;



public interface IDaoRadical {
	public  void create(Radical caractere);

	public  void update(Radical caractere);

	public  void delete(Radical caractere);

	public  List<Radical> selectAll();

	public  Radical findCaractereById(Integer id);
	
	public List<Radical> findRadicalByIdKanji(Integer id); 
}
