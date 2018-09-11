package com.junners.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.junners.entity.Airport;


@Repository
public interface AirportDAO extends CrudRepository<Airport, String>{
	public List<Airport> findAll();
	public Airport findByCode(String code);
}
