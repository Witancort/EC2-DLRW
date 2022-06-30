package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import com.idat.EC2DiandraRimabaquePizzeria.dto.PizzaDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.PizzaDTOResponse;

public interface PizzaService {
	
void guardarPizza(PizzaDTORequest pizza);
void actualizarPizza(PizzaDTORequest pizza);
void eliminarPizza(Integer id);
List<PizzaDTOResponse> listarPizza();
PizzaDTOResponse obtenerPizzaId(Integer id);
}

