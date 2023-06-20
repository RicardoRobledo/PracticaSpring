package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.service.implementations.*;
import com.example.demo.repository.*;

import com.example.demo.service.AlumnoService;
@Service
public class AlumnoImplementacion implements AlumnoService{
	
	private AlumnoRepository alumnoRepository;
	
	

	public AlumnoImplementacion(AlumnoRepository alumnoRepository) {
		super();
		this.alumnoRepository = alumnoRepository;
	}
	
	

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public boolean aliminarAlumno(String id) {
		try {
			alumnoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			System.err.println("Error en la eliminaciòn");
			return false;
		}
	}

	@Override
	public Alumno modificarAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public List<Alumno> obtenerTodos() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno obtenerAlumnoPorID(String id) {
		return alumnoRepository.findById(id).get();
	}

}
