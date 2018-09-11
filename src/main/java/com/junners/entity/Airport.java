package com.junners.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Airport")
public class Airport {
	
	@Id
	@Column(nullable = false)
	private String code;
	
	@Column(nullable = false, length = 300)
	private String name;
	
	//JPA needs blank constructor should only be created in-class
	private Airport() {}
	
	public Airport( String code, String name ) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
