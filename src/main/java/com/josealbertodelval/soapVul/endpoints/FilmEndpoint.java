package com.josealbertodelval.soapVul.endpoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.josealbertodelval.beans.film.Film;
import com.josealbertodelval.beans.film.GetFilmByDirectorRequest;
import com.josealbertodelval.beans.film.GetFilmByDirectorResponse;
import com.josealbertodelval.beans.film.GetFilmByDirectorSafeRequest;
import com.josealbertodelval.beans.film.GetFilmByDirectorSafeResponse;
import com.josealbertodelval.beans.film.GetFilmByParamsRequest;
import com.josealbertodelval.beans.film.GetFilmByParamsResponse;
import com.josealbertodelval.soapVul.services.FilmService;

@Endpoint
public class FilmEndpoint {

	private static final String NAMESPACE_URI = "http://www.josealbertodelval.com/beans/film";


	@Autowired
	private FilmService filmService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetFilmByDirectorRequest")
	@ResponsePayload
	public GetFilmByDirectorResponse getFilmByDirector(@RequestPayload GetFilmByDirectorRequest request) {
		
		
		GetFilmByDirectorResponse response = new GetFilmByDirectorResponse();
		
		List<Film> films =new ArrayList<Film>();
		try{
			films = filmService.getFilmByDirector(request.getDirector());	
			films.forEach(film -> {
				response.getFilms().add(film);
			});
		}catch (Exception e) {
			// TODO: handle exception
		}

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetFilmByDirectorSafeRequest")
	@ResponsePayload
	public GetFilmByDirectorSafeResponse getFilmByDirector2(@RequestPayload GetFilmByDirectorSafeRequest request) {
		
		
		GetFilmByDirectorSafeResponse response = new GetFilmByDirectorSafeResponse();
		
		List<Film> films =new ArrayList<Film>();
		try{
			films = filmService.getFilmByDirector2(request.getDirector());	
			films.forEach(film -> {
				response.getFilms().add(film);
			});
		}catch (Exception e) {
			// TODO: handle exception
		}

		return response;
	}
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetFilmByParamsRequest")
	@ResponsePayload
	public GetFilmByParamsResponse getFilmByParams(@RequestPayload GetFilmByParamsRequest request) {
		
		
		GetFilmByParamsResponse response = new GetFilmByParamsResponse();
		
		List<Film> films =new ArrayList<Film>();
		try{
			films = filmService.getFilmByParams(request.getParamsArray());	
			films.forEach(film -> {
				response.getFilms().add(film);
			});
		}catch (Exception e) {
			// TODO: handle exception
		}

		return response;
	}
	
}
