package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.*;

public interface AlumnoService {
	//ALTAS
	Alumno guardarAlumno(Alumno alumno);
	
	//BAJAS
	boolean aliminarAlumno(String id);
	
	//CAMBIOS
	Alumno modificarAlumno(Alumno alumno);
	
	//CONSULTAS
	List<Alumno> obtenerTodos(); // gretAll()
	Alumno obtenerAlumnoPorID(String id);
	
	
	
	
	

}
