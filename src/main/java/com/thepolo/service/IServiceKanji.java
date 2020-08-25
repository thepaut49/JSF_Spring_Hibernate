package com.thepolo.service;

import java.util.List;

import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;

public interface IServiceKanji {

	public void create(Kanji kanji);

	public void update(Kanji kanji);

	public void delete(Kanji kanji);

	public List<Kanji> selectAll();

	public Kanji findCaractereById(Integer id);

	public List<Kanji> findKanjiByRadicals(String radicals);

	public List<Kanji> findMotByKanji(String kanji);

	public List<Kanji> findMotByKana(String kana);

	public List<Kanji> findMotBySens(String meaning);

	public List<Kanji> findMotBynbreTraitExacte(Integer strokes);

	public List<Kanji> findMotBynbreTraitMinMax(Integer min, Integer max);
	
	public List<Kanji> popularKanji();

}
