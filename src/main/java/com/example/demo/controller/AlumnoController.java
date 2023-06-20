package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.*;
import com.example.demo.service.AlumnoService;

@Controller
public class AlumnoController {
	
	private AlumnoService alumnoService;

	public AlumnoController(AlumnoService alumnoService) {
		super();
		this.alumnoService = alumnoService;
	}
	
	//Metodo que gestione la lista de estudioantes/alumnos y la retorne a la vista
	@GetMapping("/alumnos")
	public String listaAlumnos(Model model) {
		model.addAttribute("alumnos",alumnoService.obtenerTodos());
		return "alumnos";
	}
	
	//Altas
	@GetMapping("/alumnos/crear")
	public  String crearAlumnoFormulario(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("alumno",alumno);
		return "crear_alumno";
	}
	@PostMapping("/alumnos")
	public String guardarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		alumnoService.guardarAlumno(alumno);
		return "redirect:/alumnos";
	}
	
	// Bajas
	@GetMapping("/alumnos/{id}")
	public String eliminarAlumno(@PathVariable String id) {
		alumnoService.aliminarAlumno(id);
		return "redirect:/alumnos";
	}
	//Cambios
	@GetMapping("/alumnos/editar/{id}")
	public String editarAlumnoFormulario(@PathVariable String id, Model model) {
		//System.out.println(id);
		model.addAttribute("alumno",alumnoService.obtenerAlumnoPorID(id));
		return "editar_alumno";
	}
	@PostMapping("/alumnos/{id}")
	public String actualizarAlumno(@PathVariable String id, @ModelAttribute("alumno") Alumno alumno, Model mode) {
		Alumno alumnoExistente=alumnoService.obtenerAlumnoPorID(id);
		alumnoExistente.setNombre(alumno.getNombre());
		alumnoExistente.setPrimer_ap(alumno.getPrimer_ap());
		alumnoExistente.setSegundo_ap(alumno.getSegundo_ap());
		alumnoExistente.setEdad(alumno.getEdad());
		alumnoExistente.setSemestre(alumno.getSemestre());
		alumnoExistente.setCarrera(alumno.getCarrera());
		alumnoService.modificarAlumno(alumnoExistente);
		return "redirect:/alumnos";
	}
	
	
}
