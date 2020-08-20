package com.thepolo.service;

import java.util.List;

import com.thepolo.model.Hiragana;

public interface IServiceHiragana {
	
	public  void create(Hiragana caractere);

	public  void update(Hiragana caractere);

	public  void delete(Hiragana caractere);

	public  List<Hiragana> selectAll();

	public  Hiragana findCaractereById(Integer id);

}
