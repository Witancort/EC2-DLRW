package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import com.idat.EC2DiandraRimabaquePizzeria.dto.VendedorDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.VendedorDTOResponse;

public interface VendedorService {
	void guardarVendedor(VendedorDTORequest vendedor);
	void actualizarVendedor(VendedorDTORequest vendedor);
	void eliminarVendedor(Integer id);
	List<VendedorDTOResponse> listarVendedor();
	VendedorDTOResponse obtenerVendedorId(Integer id);
    
}
