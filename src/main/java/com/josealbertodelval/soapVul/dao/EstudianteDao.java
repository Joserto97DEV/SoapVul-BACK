package com.josealbertodelval.soapVul.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.josealbertodelval.beans.student.Student;


@Repository
public class EstudianteDao {

	@Autowired		
	private JdbcTemplate jdbcTemplate;
	
	public EstudianteDao(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional
	public Student create(Student studentNew) {
		jdbcTemplate.update("insert into Students values (?,?,?,?)", studentNew.getId(), studentNew.getName(),
				studentNew.getAddress(), studentNew.getPhone());
		
		/*return  jdbcTemplate.queryForObject("select * from Students where nombre=?",
				new PersonaMapper(),studentNew.getId());*/
		
		return new Student();
		
	}
	/*
	 * 
	 *  public List<Persona> buscarTodos() {
    return plantilla.query("select * from Personas",new PersonaMapper());
  }
  
  public Persona buscarUno(String nombre) {
    return plantilla.queryForObject("select * from Personas where nombre=?",new PersonaMapper(),nombre);
  }
  @Transactional
  public void borrar(Persona persona) {
    
     plantilla.update("delete from Personas where nombre=?",persona.getNombre());
        
  }
	 */
	
	
}
