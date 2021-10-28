package com.example.demo.Dto;

import java.util.List;

public class EmployeeDto
{
	public Integer id;
	public String name;
	public List<String> city;
	public String state;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeDto(int id, String name, List<String> city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}