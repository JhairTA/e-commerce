package com.hackaton.ecommerce.model;

public class Usuario {
	private Integer usuarioId;
	private String nombre;
	private String contraseña;
	private String correo;
	
	public Usuario() {
	}

	public Usuario(Integer usuarioId, String nombre, String contraseña, String correo) {
		super();
		this.usuarioId = usuarioId;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.correo = correo;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
