package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Usuarios")

public class Usuario {
	
	@Id
	private String id;//numControl
	
	@Column(name="Nombre_usuario", nullable=false)
	private String nombre_usuario;
	
	@Column(name="Contraseña", nullable=false)
	private String contraseña;
	
	public Usuario() {}
	public Usuario(String id, String nombre_usuario, String contraseña) {
		super();
		this.id = id;
		this.nombre_usuario = nombre_usuario;
		this.contraseña = contraseña;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getNombreUsuario() {
		return id;
	}
	public void setNombreUsuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
