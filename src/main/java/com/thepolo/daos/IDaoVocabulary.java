package com.thepolo.daos;

import java.util.List;

import com.thepolo.model.Kanji;
import com.thepolo.model.Vocabulary;



public interface IDaoVocabulary {
	public  void create(Vocabulary mot);

	public  void update(Vocabulary mot);

	public  void delete(Vocabulary mot);

	public  List<Vocabulary> selectAll();

	public  Vocabulary findCaractereById(Integer id);
	
	public List<Vocabulary> findMotByKanji(String kanji); 
	
	public List<Vocabulary> findMotByKanjiAndKana(String kanji); 
	
	public List<Vocabulary> findMotByKana(String kana); 
	
	public List<Vocabulary> findMotBySens(String sens); 
	
	public List<Vocabulary> popularVoc();
}
