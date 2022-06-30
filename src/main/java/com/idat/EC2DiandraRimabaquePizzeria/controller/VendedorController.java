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

import com.idat.EC2DiandraRimabaquePizzeria.dto.VendedorDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.VendedorDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.service.VendedorService;

@Controller
@RequestMapping(path = "/vendedor/v1")
public class VendedorController {
	
	
	@Autowired
	private VendedorService service;
	
	
	//METODO LISTAR
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<VendedorDTOResponse>> listar() {
		
		return new ResponseEntity<List<VendedorDTOResponse>>(service.listarVendedor(), HttpStatus.OK);
		
	}
	
	//METODO GUARDAR
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody VendedorDTORequest vendedor) {
		service.guardarVendedor(vendedor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//METODO ELIMINAR
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {	
		
	VendedorDTOResponse vendedor =service.obtenerVendedorId(id);
	
	if(vendedor !=null) {
	    service.eliminarVendedor(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	//METODO ACTUALIZAR
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody VendedorDTORequest vendedor) {
		
	VendedorDTOResponse vendedores =service.obtenerVendedorId(vendedor.getId());
	
	if(vendedores !=null) {
	    service.actualizarVendedor(vendedor);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	//METODO BUSCAR POR ID
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity< VendedorDTOResponse> obtenerId(@PathVariable Integer id) { 
		
	VendedorDTOResponse vendedor=service.obtenerVendedorId(id);
	
	if(vendedor !=null) {
		return new ResponseEntity<VendedorDTOResponse>(service.obtenerVendedorId(id),(HttpStatus.OK));
		
	}
	
	return new ResponseEntity<VendedorDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
}
