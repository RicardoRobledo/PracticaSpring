package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
