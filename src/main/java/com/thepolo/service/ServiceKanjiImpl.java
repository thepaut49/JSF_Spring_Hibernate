package com.thepolo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepolo.dao.IDaoKanji;
import com.thepolo.model.Kanji;
import com.thepolo.model.Radical;

@Service
public class ServiceKanjiImpl implements IServiceKanji {

	@Autowired
	private IDaoKanji daoKanji;

	public ServiceKanjiImpl() {
		super();
	}

	@Override
	public void create(Kanji caractere) {
		daoKanji.create(caractere);
	}

	@Override
	public void update(Kanji caractere) {
		daoKanji.update(caractere);
	}

	@Override
	public void delete(Kanji caractere) {
		daoKanji.delete(caractere);
	}

	@Override
	public List<Kanji> selectAll() {

		return daoKanji.selectAll();
	}

	@Override
	public Kanji findCaractereById(Integer id) {
		return daoKanji.findCaractereById(id);
	}

	public List<Kanji> findKanjiByIdRadical(Integer id) {
		return daoKanji.findKanjiByIdRadical(id);
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
	public List<Kanji> findMotBySens(String sens) {
		return daoKanji.findMotBySens(sens);
	}

	@Override
	public List<Kanji> findMotBynbreTraitExacte(Integer nbreTrait) {
		return daoKanji.findMotBynbreTraitExacte(nbreTrait);
	}

	@Override
	public List<Kanji> findMotBynbreTraitMinMax(Integer min, Integer max) {
		return daoKanji.findMotBynbreTraitMinMax(min, max);
	}

}
