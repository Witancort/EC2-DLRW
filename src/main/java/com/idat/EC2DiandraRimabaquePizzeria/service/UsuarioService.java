package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import com.idat.EC2DiandraRimabaquePizzeria.dto.UsuarioDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.UsuarioDTOResponse;

public interface UsuarioService {
	void guardarUsuario(UsuarioDTORequest usuario);
	void actualizarUsuario(UsuarioDTORequest usuario);
	void eliminarUsuario(Integer id);
	List<UsuarioDTOResponse> listarUsuario();
	UsuarioDTOResponse obtenerUsuarioId(Integer id);
}
