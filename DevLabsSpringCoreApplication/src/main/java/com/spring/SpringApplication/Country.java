package com.spring.SpringApplication;

import java.util.List;
import java.util.Map;

public class Country {
	
	int id;
	String name;
	int population;
	String language;
	Capital capital;
	List<String> cultures;
	Map <String, String> types;
	
	public Map<String, String> getTypes() {
		return types;
	}
	public void setTypes(Map<String, String> types) {
		this.types = types;
	}
	public List<String> getCultures() {
		return cultures;
	}
	public void setCultures(List<String> cultures) {
		this.cultures = cultures;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
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
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	

}
