package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hist_ventas")
public class Hist_ventas {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idventa;
	@Column
	private int idmascotacomp;
	@Column
	private int precioventa;
	@Column
	private String fechaventa;
	@Column
	private String dnicomprador;
	@Column
	private String uservendedor;
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdmascotacomp() {
		return idmascotacomp;
	}
	public void setIdmascotacomp(int idmascotacomp) {
		this.idmascotacomp = idmascotacomp;
	}
	public int getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(int precioventa) {
		this.precioventa = precioventa;
	}
	public String getFechaventa() {
		return fechaventa;
	}
	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}
	public String getDnicomprador() {
		return dnicomprador;
	}
	public void setDnicomprador(String dnicomprador) {
		this.dnicomprador = dnicomprador;
	}
	public String getUservendedor() {
		return uservendedor;
	}
	public void setUservendedor(String uservendedor) {
		this.uservendedor = uservendedor;
	}
	
}
