package com.idat.EC2DiandraRimabaquePizzeria.dto;

public class IngredientesDTOResponse {
	private Integer id;
	private String nombreIng;
	private String descripcionIng;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreIng() {
		return nombreIng;
	}
	public void setNombreIng(String nombreIng) {
		this.nombreIng = nombreIng;
	}
	public String getDescripcionIng() {
		return descripcionIng;
	}
	public void setDescripcionIng(String descripcionIng) {
		this.descripcionIng = descripcionIng;
	}

}
