package com.example.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4147746956307930163L;
	
	@Id
	@GeneratedValue
	Long id;
	String Code;
	String Name;
	String Continent;
	String Region;
	float SurfaceArea;
	int IndepYear;
	int Population;
	float lifeExpectancy;
	float GNP;
	float GNPOld;
	String LocalName;
	String GovernmentForm;
	String HeadOfState;
	int Capital;
	String Code2;
	
	public Country(Long id, String code, String name, String continent, String region, float surfaceArea, int indepYear,
			int population, float lifeExpectancy, float gNP, float gNPOld, String localName, String governmentForm,
			String headOfState, int capital, String code2) {
		super();
		this.id = id;
		Code = code;
		Name = name;
		Continent = continent;
		Region = region;
		SurfaceArea = surfaceArea;
		IndepYear = indepYear;
		Population = population;
		this.lifeExpectancy = lifeExpectancy;
		GNP = gNP;
		GNPOld = gNPOld;
		LocalName = localName;
		GovernmentForm = governmentForm;
		HeadOfState = headOfState;
		Capital = capital;
		Code2 = code2;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContinent() {
		return Continent;
	}
	public void setContinent(String continent) {
		Continent = continent;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public float getSurfaceArea() {
		return SurfaceArea;
	}
	public void setSurfaceArea(float surfaceArea) {
		SurfaceArea = surfaceArea;
	}
	public int getIndepYear() {
		return IndepYear;
	}
	public void setIndepYear(int indepYear) {
		IndepYear = indepYear;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	public float getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public float getGNP() {
		return GNP;
	}
	public void setGNP(float gNP) {
		GNP = gNP;
	}
	public float getGNPOld() {
		return GNPOld;
	}
	public void setGNPOld(float gNPOld) {
		GNPOld = gNPOld;
	}
	public String getLocalName() {
		return LocalName;
	}
	public void setLocalName(String localName) {
		LocalName = localName;
	}
	public String getGovernmentForm() {
		return GovernmentForm;
	}
	public void setGovernmentForm(String governmentForm) {
		GovernmentForm = governmentForm;
	}
	public String getHeadOfState() {
		return HeadOfState;
	}
	public void setHeadOfState(String headOfState) {
		HeadOfState = headOfState;
	}
	public int getCapital() {
		return Capital;
	}
	public void setCapital(int capital) {
		Capital = capital;
	}
	public String getCode2() {
		return Code2;
	}
	public void setCode2(String code2) {
		Code2 = code2;
	}

	@Override
	public String toString() {
		return "country [id=" + id + ", Code=" + Code + ", Name=" + Name + ", Continent=" + Continent + ", Region="
				+ Region + ", SurfaceArea=" + SurfaceArea + ", IndepYear=" + IndepYear + ", Population=" + Population
				+ ", lifeExpectancy=" + lifeExpectancy + ", GNP=" + GNP + ", GNPOld=" + GNPOld + ", LocalName="
				+ LocalName + ", GovernmentForm=" + GovernmentForm + ", HeadOfState=" + HeadOfState + ", Capital="
				+ Capital + ", Code2=" + Code2 + "]";
	}
}
