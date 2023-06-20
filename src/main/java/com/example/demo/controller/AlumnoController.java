package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Alumno;
import com.example.demo.services.AlumnoService;

@Controller  // CAMBIO (FALTO) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class AlumnoController {

	private AlumnoService alumnoService;

	public AlumnoController(AlumnoService alumnoService) {
		super();
		this.alumnoService = alumnoService;
	}
	
	//metodo que gestione la lista de alumnos y la retorne a la vista
	@GetMapping("/alumnos")
	public String listarAlumnos(Model model) {
		model.addAttribute("alumnos", alumnoService.obtenerTodos());
		return "alumnos";
	}
	
	//--------------------------- ALTAS --------------------------------
	@GetMapping("/alumnos/crear")
	public String crearAlumnoFormulario(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("alumno", alumno);
		return "crear_alumno";
	}
	
	@PostMapping("/alumnos")
	public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		alumnoService.guardarAlumno(alumno);
		return "redirect:/alumnos";
	}
	
	
	//--------------------------- BAJAS --------------------------------
	@GetMapping("/alumnos/{id}")
	public String eliminarAlumno(@PathVariable String id) {
		alumnoService.eliminarAlumno(id);
		return "redirect:/alumnos";
	}
	
	
	//--------------------------- CAMBIOS --------------------------------
	@GetMapping("/alumnos/editar/{id}")
	public String editarAlumnoFormulario(@PathVariable String id, Model model) {
		model.addAttribute("alumno", alumnoService.obtenerAlumnoPorID(id));
		return "editar_alumno";
	}
	
	@PostMapping("/alumnos/{id}")
	public String actualizarAlumno(@PathVariable String id, 
			@ModelAttribute("alumno") Alumno alumno, Model model) {
		
		//buscar el alumno en la BD
		Alumno alumnoExistente = alumnoService.obtenerAlumnoPorID(id);
		
		alumnoExistente.setNombre(alumno.getNombre());
		alumnoExistente.setPrimerAp(alumno.getPrimerAp());
		alumnoExistente.setSegundoAp(alumno.getSegundoAp());
		alumnoExistente.setEdad(alumno.getEdad());
		alumnoExistente.setSemestre(alumno.getSemestre());
		alumnoExistente.setCarrera(alumno.getCarrera());
		
		//guardar el alumno con los datos modificados
		alumnoService.modificarAlumno(alumnoExistente);
		
		return "redirect:/alumnos";	
	}
}//class
