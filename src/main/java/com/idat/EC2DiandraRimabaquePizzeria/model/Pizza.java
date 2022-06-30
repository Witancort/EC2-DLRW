package com.idat.EC2DiandraRimabaquePizzeria.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name= "Pizza")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idPizza;
	private String pizza;
	private String descripcion;
	
	//@OneToMany(mappedBy = "pizza")
	//private List<Ingredientes>ingredientes = new ArrayList<>();
	
	
	public Integer getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
