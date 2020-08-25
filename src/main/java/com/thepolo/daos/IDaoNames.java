package com.thepolo.daos;

import java.util.List;

import com.thepolo.model.Names;



public interface IDaoNames {
	public  void create(Names name);

	public  void update(Names name);

	public  void delete(Names name);

	public  List<Names> selectAll();

	public  Names findCaractereById(Integer id);
	
	public List<Names> findMotByKanji(String kanji); 
	
	public List<Names> findMotByKana(String kana); 
	 
}
