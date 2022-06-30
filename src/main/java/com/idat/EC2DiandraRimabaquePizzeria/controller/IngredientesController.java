package com.idat.EC2DiandraRimabaquePizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EC2DiandraRimabaquePizzeria.dto.IngredientesDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.IngredientesDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.model.Ingredientes;
import com.idat.EC2DiandraRimabaquePizzeria.service.IngredientesService;

@Controller
@RequestMapping(path = "/ingredientes/v1")
public class IngredientesController {
	
	
	@Autowired
	private IngredientesService service;
	
	
	//METODO LISTAR
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<IngredientesDTOResponse>> listar() {
		
		return new ResponseEntity<List<IngredientesDTOResponse>>(service.listarIngredientes(), HttpStatus.OK);
		
	}
	
	//METODO GUARDAR
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody IngredientesDTORequest ingredientes) {
		service.guardarIngredientes(ingredientes);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//METODO ELIMINAR
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {	
		
	IngredientesDTOResponse ingredientes =service.obtenerIngredientesId(id);
	
	if(ingredientes !=null) {
	    service.eliminarIngredientes(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	//METODO ACTUALIZAR
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody IngredientesDTORequest ingredientes) {
		
	IngredientesDTOResponse ingredientess =service.obtenerIngredientesId(Ingredientes.getId());
	
	if(ingredientess !=null) {
	    service.actualizarIngredientes(ingredientess);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	//METODO BUSCAR POR ID
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<IngredientesDTOResponse> obtenerId(@PathVariable Integer id) { 
		
	IngredientesDTOResponse ingredientes =service.obtenerIngredientesId(id);
	
	if(ingredientes !=null) {
		return new ResponseEntity<IngredientesDTOResponse>(service.obtenerIngredientesId(id),(HttpStatus.OK));
		
	}
	
	return new ResponseEntity<IngredientesDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
}



