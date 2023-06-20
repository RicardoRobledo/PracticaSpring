package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Alumno;
import com.example.demo.entity.Usuario;
import com.example.demo.services.AlumnoService;
import com.example.demo.services.UsuarioService;

@Controller
public class UsuarioController {
	
	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	//--------------------------- ALTAS --------------------------------
	@GetMapping("/login")
	public String crearUsuarioFormulario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "crear_usuario";
	}
	
	@PostMapping("/usuarios")
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
		return "redirect:/login";
	}


}
