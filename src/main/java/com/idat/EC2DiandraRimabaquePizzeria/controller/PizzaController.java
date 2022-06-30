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

import com.idat.EC2DiandraRimabaquePizzeria.dto.PizzaDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.PizzaDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.service.PizzaServiceImpl;

@Controller
@RequestMapping(path = "/pizza/v1")
public class PizzaController {
	
	
	@Autowired
	private PizzaServiceImpl service;
	
	
	//METODO LISTAR
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<PizzaDTOResponse>> listar() {
		
		return new ResponseEntity<List<PizzaDTOResponse>>(service.listarPizza(), HttpStatus.OK);
		
	}
	
	//METODO GUARDAR
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody PizzaDTORequest pizza) {
		service.guardarPizza(pizza);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//METODO ELIMINAR
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {	
		
	PizzaDTOResponse pizza =service.obtenerPizzaId(id);
	
	if(pizza !=null) {
	    service.eliminarPizza(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	//METODO ACTUALIZAR
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody PizzaDTORequest pizza) {
		
	PizzaDTOResponse pizzas =service.obtenerPizzaId(pizza.getId());
	
	if(pizzas !=null) {
	    service.actualizarPizza(pizza);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	//METODO BUSCAR POR ID
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<PizzaDTOResponse> obtenerId(@PathVariable Integer id) { 
		
	PizzaDTOResponse pizza =service.obtenerPizzaId(id);
	
	if(pizza !=null) {
		return new ResponseEntity<PizzaDTOResponse>(service.obtenerPizzaId(id),(HttpStatus.OK));
		
	}
	
	return new ResponseEntity<PizzaDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
}
