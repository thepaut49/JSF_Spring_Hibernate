package com.thepolo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepolo.daos.IDaoKanji;
import com.thepolo.model.Kanji;

@Service
public class ServiceKanjiImpl implements IServiceKanji {

	@Autowired
	private IDaoKanji daoKanji;

	public ServiceKanjiImpl() {
		super();
	}

	@Override
	public void create(Kanji kanji) {
		System.out.println("serviceKanji :::: " + kanji.toString());
		daoKanji.create(kanji);
	}

	@Override
	public void update(Kanji kanji) {
		daoKanji.update(kanji);
	}

	@Override
	public void delete(Kanji kanji) {
		daoKanji.delete(kanji);
	}

	@Override
	public List<Kanji> selectAll() {

		return daoKanji.selectAll();
	}

	@Override
	public Kanji findCaractereById(Integer id) {
		return daoKanji.findCaractereById(id);
	}

	public List<Kanji> findKanjiByRadicals(String radicals) {
		return daoKanji.findKanjiByRadicals(radicals);
	}

	@Override
	public List<Kanji> findMotByKanji(String kanji) {
		return daoKanji.findMotByKanji(kanji);
	}

	@Override
	public List<Kanji> findMotByKana(String kana) {
		return daoKanji.findMotByKana(kana);
	}

	@Override
	public List<Kanji> findMotBySens(String meaning) {
		return daoKanji.findMotBySens(meaning);
	}

	@Override
	public List<Kanji> findMotBynbreTraitExacte(Integer strokes) {
		return daoKanji.findMotBynbreTraitExacte(strokes);
	}

	@Override
	public List<Kanji> findMotBynbreTraitMinMax(Integer min, Integer max) {
		return daoKanji.findMotBynbreTraitMinMax(min, max);
	}

	@Override
	public List<Kanji> popularKanji() {
		return daoKanji.popularKanji();
	}
	
	

}
