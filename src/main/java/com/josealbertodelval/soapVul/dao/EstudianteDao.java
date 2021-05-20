package com.josealbertodelval.soapVul.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteDao {

	@Autowired		
	private JdbcTemplate jdbcTemplate;
	
	
}
