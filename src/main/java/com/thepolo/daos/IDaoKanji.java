package com.thepolo.daos;

import java.util.List;

import com.thepolo.model.Kanji;


public interface IDaoKanji {
	public  void create(Kanji kanji);

	public  void update(Kanji kanji);

	public  void delete(Kanji kanji);

	public  List<Kanji> selectAll();

	public  Kanji findCaractereById(Integer id);
	
	public List<Kanji> findMotByKanji(String kanji); 
	
	public List<Kanji> findMotByKana(String kana); 
	
	public List<Kanji> findMotBySens(String meaning);
	
	public List<Kanji> findKanjiByRadicals(String radicals);
	
	public List<Kanji> findMotBynbreTraitExacte(Integer nbreTrait); 
	
	public List<Kanji> findMotBynbreTraitMinMax(Integer min,Integer max); 
	
	public List<Kanji> popularKanji();
	
}
