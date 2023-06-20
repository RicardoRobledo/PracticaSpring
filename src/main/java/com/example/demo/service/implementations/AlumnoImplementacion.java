package com.example.demo.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Alumno;
import com.example.demo.respository.AlumnoRepository;
import com.example.demo.services.AlumnoService;


@Service  // CAMBIO (FALTO)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class AlumnoImplementacion implements AlumnoService{

	
	private AlumnoRepository alumnoRepository;
	
	public AlumnoImplementacion(AlumnoRepository alumnoRepository) {
		this.alumnoRepository = alumnoRepository;
	}
	
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public boolean eliminarAlumno(String id) {
		boolean res = false;
		try {
			alumnoRepository.deleteById(id);
			res = true;
		} catch (Exception e) {
			System.out.println("Error en la eliminacion");
		}
		return res;
	}

	@Override
	public Alumno modificarAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	public List<Alumno> obtenerTodos() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno obtenerAlumnoPorID(String id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id).get();
	}
	
	
	

}
