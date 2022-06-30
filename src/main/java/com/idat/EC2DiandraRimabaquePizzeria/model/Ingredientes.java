package com.idat.EC2DiandraRimabaquePizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Ingredientes")
public class Ingredientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idIngrediente;
	private String nombre;
	private String descripcion;
	
	
	public Integer getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(Integer idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
