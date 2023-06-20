package com.example.demo.service.implementations;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.respository.UsuarioRepository;
import com.example.demo.services.UsuarioService;

@Service
public class UsuarioImplementacion implements UsuarioService{

	private UsuarioRepository usuarioRepository;
	
	public UsuarioImplementacion(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	
	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}


	@Override
	public Usuario obtenerUsuarioPorID(String id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).get();
	}
	
}
