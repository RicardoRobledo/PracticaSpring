package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Usuario;


public interface UsuarioService {
	
		Usuario guardarUsuario(Usuario alumno);
		
		Usuario obtenerUsuarioPorID(String id);
}
