package com.thepolo.dao;

import java.util.List;

import com.thepolo.model.Kanji;


public interface IDaoKanji {
	public  void create(Kanji caractere);

	public  void update(Kanji caractere);

	public  void delete(Kanji caractere);

	public  List<Kanji> selectAll();

	public  Kanji findCaractereById(Integer id);
	
	public List<Kanji> findKanjiByIdRadical(Integer id); 
	
	public List<Kanji> findMotByKanji(String kanji); 
	
	public List<Kanji> findMotByKana(String kana); 
	
	public List<Kanji> findMotBySens(String sens);
	
	public List<Kanji> findMotBynbreTraitExacte(Integer nbreTrait); 
	
	public List<Kanji> findMotBynbreTraitMinMax(Integer min,Integer max); 
	
}
