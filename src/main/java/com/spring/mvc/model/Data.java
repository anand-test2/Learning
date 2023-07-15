package com.spring.mvc.model;

public class Data {
	
	private int id;
	
	private String name;
	
	private String experience;
	
	private String specialization;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", experience=" + experience + ", specialization=" + specialization
				+ "]";
	}
	
	

}
