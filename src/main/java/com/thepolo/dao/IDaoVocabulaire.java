package com.thepolo.dao;

import java.util.List;

import com.thepolo.model.Kanji;
import com.thepolo.model.Vocabulaire;



public interface IDaoVocabulaire {
	public  void create(Vocabulaire mot);

	public  void update(Vocabulaire mot);

	public  void delete(Vocabulaire mot);

	public  List<Vocabulaire> selectAll();

	public  Vocabulaire findCaractereById(Integer id);
	
	public List<Vocabulaire> findMotByKanji(String kanji); 
	
	public List<Vocabulaire> findMotByKana(String kana); 
	
	public List<Vocabulaire> findMotBySens(String sens); 
}
