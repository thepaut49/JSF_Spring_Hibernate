package com.thepolo.service;

import java.util.List;

import com.thepolo.model.Katakana;

public interface IServiceKatakana {
	
	public  void create(Katakana caractere);

	public  void update(Katakana caractere);

	public  void delete(Katakana caractere);

	public  List<Katakana> selectAll();

	public  Katakana findCaractereById(Integer id);

}
