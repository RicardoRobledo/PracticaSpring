package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Usuario;


public interface UsuarioService {
	
	Usuario guardarUsuario(Usuario usuario);
		
	Usuario obtenerUsuarioPorID(String id);

}
