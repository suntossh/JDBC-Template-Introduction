package com.suntossh.spring.data.repositories;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.suntossh.spring.data.entities.RentalLocation;


@Repository
public class RentalLocationRepoImpl implements RentalLocationRepo{

	private JdbcTemplate template;
	private DataSource dataSource;
	
	public static final String SELECT_QUERY = "select name from rental_location where rental_location_id = ?";
	
	@Autowired
	public RentalLocationRepoImpl(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	public String getRentalLocationById(Integer id){
		return this.template.queryForObject(SELECT_QUERY, new Object[]{id}, java.lang.String.class);
	}
	
	
	public void insert(RentalLocation rentalLocation) {
		
	}

	public void update(RentalLocation rentalLocation) {
		
	}

	public void delete(RentalLocation rentalLocation) {
		
	}

	public RentalLocation getById(RentalLocation rentalLocation) {
		return null;
	}

}
