package com.example.model.hibernate;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(name ="last_name")
	private String lastName;
	@Column(name ="date_of_birth")
	private Date dateOfBirth;
	private String adress;
	
	
	
	
	public Alumno() {
	}


	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public Date getDateOfBirth() {
		return dateOfBirth;
	}




	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}




	public String getAdress() {
		return adress;
	}




	public void setAdress(String adress) {
		this.adress = adress;
	}




	public Alumno(Long id, String name, String lastName, Date dateOfBirth, String adress) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.adress = adress;
	}
	
	

}
