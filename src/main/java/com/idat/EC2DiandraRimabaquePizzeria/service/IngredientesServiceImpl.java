package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2DiandraRimabaquePizzeria.dto.IngredientesDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.IngredientesDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.repository.IngredientesRepository;

@Service
public class IngredientesServiceImpl implements IngredientesService{

	@Autowired
	private IngredientesRepository repository;

	@Override
	public void guardarIngredientes(IngredientesDTORequest ingredientes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarIngredientes(IngredientesDTOResponse ingredientes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarIngredientes(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IngredientesDTOResponse> listarIngredientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IngredientesDTOResponse obtenerIngredientesId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
