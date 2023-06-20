package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Alumno;


public interface AlumnoService {
	
	//Altas
	Alumno guardarAlumno(Alumno alumno);
	
	//bajas
	boolean eliminarAlumno(String id);  //id => numero control
	
	//cambios
	Alumno modificarAlumno(Alumno alumno);
	
	
	//consultas
	List<Alumno> obtenerTodos(); //getAll();
	
	Alumno obtenerAlumnoPorID(String id);
	
}
