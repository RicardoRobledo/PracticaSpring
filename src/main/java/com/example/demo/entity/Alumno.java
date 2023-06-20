package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Alumnos")
public class Alumno {
	
	@Id
	private String id;//numControl
	
	@Column(name="Nombre", nullable=false)
	private String nombre;
	
	@Column(name="Primer_Ap", nullable=false)
	private String primerAp;
	
	@Column(name="Segundo_Ap", nullable=false)
	private String segundoAp;
	
	@Column(name="Edad", nullable=false)
	private byte edad;
	
	@Column(name="Semestre", nullable=false)
	private byte semestre;
	
	@Column(name="Carrera", nullable=false)
	private String carrera;

	public Alumno() {}
	public Alumno(String id, String nombre, String primerAp, String segundoAp, byte edad, byte semestre,
			String carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerAp = primerAp;
		this.segundoAp = segundoAp;
		this.edad = edad;
		this.semestre = semestre;
		this.carrera = carrera;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerAp() {
		return primerAp;
	}
	public void setPrimerAp(String primerAp) {
		this.primerAp = primerAp;
	}
	public String getSegundoAp() {
		return segundoAp;
	}
	public void setSegundoAp(String segundoAp) {
		this.segundoAp = segundoAp;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public byte getSemestre() {
		return semestre;
	}
	public void setSemestre(byte semestre) {
		this.semestre = semestre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	

	
	
	
}
