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

import com.idat.EC2DiandraRimabaquePizzeria.dto.UsuarioDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.UsuarioDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.service.UsuarioService;

@Controller
@RequestMapping(path = "/usuario/v1")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioService service;
	
	
	//METODO LISTAR
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<UsuarioDTOResponse>> listar() {
		
		return new ResponseEntity<List<UsuarioDTOResponse>>(service.listarUsuario(), HttpStatus.OK);
		
	}
	
	//METODO GUARDAR
	
	@RequestMapping( path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody UsuarioDTORequest usuario) {
		service.guardarUsuario(usuario);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//METODO ELIMINAR
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {	
		
	UsuarioDTOResponse usuario =service.obtenerUsuarioId(id);
	
	if(usuario !=null) {
	    service.eliminarUsuario(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	//METODO ACTUALIZAR
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody UsuarioDTORequest usuario) {
		
	UsuarioDTOResponse usuarios =service.obtenerUsuarioId(usuario.getId());
	
	if(usuarios !=null) {
	    service.actualizarUsuario(usuario);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	//METODO BUSCAR POR ID
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<UsuarioDTOResponse> obtenerId(@PathVariable Integer id) { 
		
	UsuarioDTOResponse usuario=service.obtenerUsuarioId(id);
	
	if(usuario !=null) {
		return new ResponseEntity<UsuarioDTOResponse>(service.obtenerUsuarioId(id),(HttpStatus.OK));
		
	}
	
	return new ResponseEntity<UsuarioDTOResponse>(HttpStatus.NOT_FOUND);
	}
	
}

