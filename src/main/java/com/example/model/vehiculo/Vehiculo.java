package com.example.model.vehiculo;

import java.util.Date;

public abstract class Vehiculo {
	
	private Integer yearOfProduction;
	
	private Integer yearOfAcquisition;
	
	private String registrationNumber;
	
	private Date insuranceExpirationDate;
	
	private String brand;
	
	private String model;
	
	
	
	public Vehiculo() {
		
	}

	public Vehiculo(Integer yearOfProduction, Integer yearOfAcquisition, String registrationNumber,
			Date insuranceExpirationDate, String brand, String model) {
		this.yearOfProduction = yearOfProduction;
		this.yearOfAcquisition = yearOfAcquisition;
		this.registrationNumber = registrationNumber;
		this.insuranceExpirationDate = insuranceExpirationDate;
		this.brand = brand;
		this.model = model;
	}

	public Integer getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(Integer yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public Integer getYearOfAcquisition() {
		return yearOfAcquisition;
	}

	public void setYearOfAcquisition(Integer yearOfAcquisition) {
		this.yearOfAcquisition = yearOfAcquisition;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getInsuranceExpirationDate() {
		return insuranceExpirationDate;
	}

	public void setInsuranceExpirationDate(Date insuranceExpirationDate) {
		this.insuranceExpirationDate = insuranceExpirationDate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	
}
