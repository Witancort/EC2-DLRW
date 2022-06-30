package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2DiandraRimabaquePizzeria.dto.UsuarioDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.UsuarioDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	@Autowired 
	private UsuarioRepository repository;
	
	@Override
	public void guardarUsuario(UsuarioDTORequest usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(UsuarioDTORequest usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UsuarioDTOResponse> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTOResponse obtenerUsuarioId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
