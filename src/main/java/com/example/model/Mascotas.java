package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="mascotas")
public class Mascotas {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmascota;
	@Column
	private String nombre;
	@Column
	private String tipo;
	@Column
	private int precio;
	@Column
	private String estadomasc;
	public int getIdmascota() {
		return idmascota;
	}
	public void setIdmascota(int idmascota) {
		this.idmascota = idmascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getEstadomasc() {
		return estadomasc;
	}
	public void setEstadomasc(String estadomasc) {
		this.estadomasc = estadomasc;
	}
	
}
