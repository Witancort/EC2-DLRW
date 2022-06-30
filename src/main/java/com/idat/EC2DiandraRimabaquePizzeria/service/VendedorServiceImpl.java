package com.idat.EC2DiandraRimabaquePizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2DiandraRimabaquePizzeria.dto.VendedorDTORequest;
import com.idat.EC2DiandraRimabaquePizzeria.dto.VendedorDTOResponse;
import com.idat.EC2DiandraRimabaquePizzeria.repository.VendedorRepository;

@Service
public class VendedorServiceImpl implements VendedorService{

	
	@Autowired 
	private VendedorRepository repository;

	@Override
	public void guardarVendedor(VendedorDTORequest vendedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarVendedor(VendedorDTORequest vendedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarVendedor(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VendedorDTOResponse> listarVendedor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VendedorDTOResponse obtenerVendedorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
