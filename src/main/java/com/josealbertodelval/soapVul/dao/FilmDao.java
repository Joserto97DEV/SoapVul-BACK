package com.josealbertodelval.soapVul.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.josealbertodelval.beans.film.Film;

@Repository
public class FilmDao{

	@Autowired		
	private JdbcTemplate jdbcTemplate;
	
	public FilmDao(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Film> findByDirector(String director) {
		String sql = "SELECT * FROM FILMS WHERE DIRECTOR = '"+director+"'";

		List<Film> toReturn = jdbcTemplate.query(sql,(rs, rowNum) ->{
        	Film film = new Film();
    		film.setId(rs.getInt("id"));
    		film.setDirector(rs.getString("director"));
    		film.setTitle(rs.getString("title"));
    		film.setYear(rs.getString("year"));
    		return film;
        });
		
		return toReturn;
		
	}
	
	public List<Film> findByDirector2(String director) {
		String sql = "SELECT * FROM FILMS WHERE DIRECTOR = ?";

		List<Film> toReturn = jdbcTemplate.query(sql,(rs, rowNum) ->{
        	Film film = new Film();
    		film.setId(rs.getInt("id"));
    		film.setDirector(rs.getString("director"));
    		film.setTitle(rs.getString("title"));
    		film.setYear(rs.getString("year"));
    		return film;
        },director);
		
		return toReturn;
	}
	
	public List<Film> findAll(String director) {
		String sql = "SELECT * FROM FILMS";

        return jdbcTemplate.query(sql,  (rs, rowNum) ->{
        	Film film = new Film();
    		film.setId(rs.getInt("id"));
    		film.setDirector(rs.getString("director"));
    		film.setTitle(rs.getString("title"));
    		film.setYear(rs.getString("year"));
    		return film;
        });
	}

	public List<Film> findByParams(List<String> paramsArray) {
		
		//TODO: acabar derealizarcomo consultas paginadas
		String sql = "SELECT * FROM FILMS";

		List<Film> toReturn = jdbcTemplate.query(sql,(rs, rowNum) ->{
        	Film film = new Film();
    		film.setId(rs.getInt("id"));
    		film.setDirector(rs.getString("director"));
    		film.setTitle(rs.getString("title"));
    		film.setYear(rs.getString("year"));
    		return film;
        });
		
		return toReturn;
	}

	

	
}
