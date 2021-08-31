package com.josealbertodelval.soapVul.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.josealbertodelval.beans.film.Film;
import java.util.Optional;

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
		
		StringBuilder query = new StringBuilder();
		query.append("SELECT * FROM FILMS");
		List<Object> params = new ArrayList<>();
		List<String> where = new ArrayList<>();
		
		for (String txt : Optional.ofNullable(paramsArray).orElse(new ArrayList<>())) {
			if (!txt.isEmpty()) {
				where.add(" ( UPPER(director) LIKE UPPER('%' || ? || '%') OR UPPER(title) LIKE UPPER('%' || ? || '%') OR UPPER(year) " +
						" LIKE UPPER('%' || ? || '%') ");
				params.addAll(Arrays.asList(txt, txt, txt));
			}
		}
		
		if (where.size() > 0) {
        	query.append(" WHERE ").append(String.join(" AND ", where));
		}


		List<Film> toReturn = jdbcTemplate.query(query.toString(),(rs, rowNum) ->{
        	Film film = new Film();
    		film.setId(rs.getInt("id"));
    		film.setDirector(rs.getString("director"));
    		film.setTitle(rs.getString("title"));
    		film.setYear(rs.getString("year"));
    		return film;
        },params);
		
		return toReturn;
	}

	

	
}
