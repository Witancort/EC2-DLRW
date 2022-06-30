package com.idat.EC2DiandraRimabaquePizzeria.dto;

public class PizzaDTOResponse {
	private Integer id;
	private String nombrePizza;
	private String descripcionPizza;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombrePizza() {
		return nombrePizza;
	}
	public void setNombrePizza(String nombrePizza) {
		this.nombrePizza = nombrePizza;
	}
	public String getDescripcionPizza() {
		return descripcionPizza;
	}
	public void setDescripcionPizza(String descripcionPizza) {
		this.descripcionPizza = descripcionPizza;
	}
	

}
