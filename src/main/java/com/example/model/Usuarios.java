package com.example.model;

import javax.persistence.*;
@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	@Column
	private String password;
	@Column
	private String tipousu;
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private int telefono;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipousu() {
		return tipousu;
	}
	public void setTipousu(String tipousu) {
		this.tipousu = tipousu;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
