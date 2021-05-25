package com.example.model.hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AlumnoPorCurso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "id_alumno", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Alumno alumno;

	@JoinColumn(name = "id_curso", referencedColumnName = "id")
	@ManyToOne( fetch = FetchType.LAZY)
	private Curso curso;
	
	private Integer numberOfAssist;
	
	private int nota;
	
	
	
	
	

	public AlumnoPorCurso() {
	}

	public AlumnoPorCurso(Long id, Alumno alumno, Curso curso, Integer numberOfAssist, int nota) {
		this.id = id;
		this.alumno = alumno;
		this.curso = curso;
		this.numberOfAssist = numberOfAssist;
		this.nota = nota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Integer getNumberOfAssist() {
		return numberOfAssist;
	}

	public void setNumberOfAssist(Integer numberOfAssist) {
		this.numberOfAssist = numberOfAssist;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	
	

	
}
