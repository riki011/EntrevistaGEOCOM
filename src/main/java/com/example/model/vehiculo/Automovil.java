package com.example.model.vehiculo;

import java.util.Date;

public class Automovil extends Vehiculo {
	


	private String type;
	
	private int numberOfDoors;
	
	private String typeOfEngine;
	
	
	public Automovil() {
		
	}

	public Automovil(Integer yearOfProduction, Integer yearOfAcquisition, String registrationNumber,
			Date insuranceExpirationDate, String brand, String model) {
		super(yearOfProduction, yearOfAcquisition, registrationNumber, insuranceExpirationDate, brand, "A " +model);
	}
	


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	
	
	
	

}
