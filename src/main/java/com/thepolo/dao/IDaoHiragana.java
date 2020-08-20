package com.thepolo.dao;

import java.util.List;

import com.thepolo.model.Hiragana;

public interface IDaoHiragana {
	
	public  void create(Hiragana caractere);

	public  void update(Hiragana caractere);

	public  void delete(Hiragana caractere);

	public  List<Hiragana> selectAll();

	public  Hiragana findCaractereById(Integer id);

}
