package com.idat.EC2DiandraRimabaquePizzeria.dto;

public class VendedorDTOResponse {
	private Integer id;
	private String nombreVendedor;
	private Integer celularVendero;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public Integer getCelularVendero() {
		return celularVendero;
	}
	public void setCelularVendero(Integer celularVendero) {
		this.celularVendero = celularVendero;
	}


}
