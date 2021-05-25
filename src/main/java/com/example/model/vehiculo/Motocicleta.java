package com.example.model.vehiculo;

import java.util.Date;

public class Motocicleta extends Vehiculo{

	private String cilindrada;

	
	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Motocicleta() {
	}
	
	

	public Motocicleta(Integer yearOfProduction, Integer yearOfAcquisition, String registrationNumber,
			Date insuranceExpirationDate, String brand, String model) {
		super(yearOfProduction, yearOfAcquisition, registrationNumber, insuranceExpirationDate, brand, "M "+model);
	}
	
	
	
}
