package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2DiandraRimabaquePizzeria.dto.PizzaDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.PizzaDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.repository.PizzaRepository;

@Service

public class PizzaServiceImpl implements PizzaService{

	
	@Autowired
	private PizzaRepository repository;

	@Override
	public void guardarPizza(PizzaDTORequest pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarPizza(PizzaDTORequest pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPizza(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PizzaDTOResponse> listarPizza() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PizzaDTOResponse obtenerPizzaId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


}
