package com.thepolo.dao;

import java.util.List;

import com.thepolo.model.Katakana;

public interface IDaoKatakana {
	
	public  void create(Katakana caractere);

	public  void update(Katakana caractere);

	public  void delete(Katakana caractere);

	public  List<Katakana> selectAll();

	public  Katakana findCaractereById(Integer id);

}
