package com.junners.view;

public class AirportView {
	
	private int id;
	private String code;
	private String name;
	
	public AirportView() {}
	
	public AirportView(String code, String name, int id) {
		super();
		this.code = code;
		this.name = name;
		this.id = id;
	}
	
	
	//Dozer Mapper needs setters
	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[{code=" + code +"," +
				"name=" + name +","+
				"id=" + id +"}]";
	}
	
}
