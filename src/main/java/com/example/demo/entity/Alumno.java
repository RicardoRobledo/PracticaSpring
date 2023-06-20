package com.example.demo.entity;
import  jakarta.persistence.*;
@Entity
@Table(name="Alumno")
public class Alumno {
	
	@Id
	private String id;//NUMCONTROL
	
	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@Column(name="Primer_Ap",nullable=false)
	private String primer_ap;
	
	@Column(name="Segundo_ap",nullable=false)
	private String segundo_ap;
	
	@Column(name="edad",nullable=false)
	private byte edad;
	
	@Column(name="Semestre",nullable=false)
	private byte semestre;
	
	@Column(name="Carrera",nullable=false)
	private String carrera;
	
	public Alumno(){};
	public Alumno(String numControl, String nombre, String primer_ap, String segundo_ap, byte edad, byte semestre,
			String carrera) {
		super();
		this.id = numControl;
		this.nombre = nombre;
		this.primer_ap = primer_ap;
		this.segundo_ap = segundo_ap;
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
	public String getPrimer_ap() {
		return primer_ap;
	}
	public void setPrimer_ap(String primer_ap) {
		this.primer_ap = primer_ap;
	}
	public String getSegundo_ap() {
		return segundo_ap;
	}
	public void setSegundo_ap(String segundo_ap) {
		this.segundo_ap = segundo_ap;
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
