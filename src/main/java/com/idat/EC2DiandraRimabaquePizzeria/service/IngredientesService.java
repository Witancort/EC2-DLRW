package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import com.idat.EC2DiandraRimabaquePizzeria.dto.IngredientesDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.IngredientesDTOResponse;

public interface IngredientesService {
    void guardarIngredientes(IngredientesDTORequest ingredientes);
    void actualizarIngredientes(IngredientesDTOResponse ingredientes);
    void eliminarIngredientes(Integer id);
    List<IngredientesDTOResponse> listarIngredientes();
    IngredientesDTOResponse obtenerIngredientesId(Integer id);
	
	

}
