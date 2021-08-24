package com.josealbertodelval.soapVul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josealbertodelval.beans.film.Film;
import com.josealbertodelval.soapVul.dao.FilmDao;

@Service
public class FilmService {

	@Autowired
	private FilmDao filmDao;

	public List<Film> getFilmByDirector(String director) {
		return filmDao.findByDirector(director);
	}

	public List<Film> getFilmByParams(List<String> paramsArray) {
		return filmDao.findByParams(paramsArray);
	}

	public List<Film> getFilmByDirector2(String director) {
		return filmDao.findByDirector2(director);

	}
	
	
}
