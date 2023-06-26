package com.ronal.service;

import java.util.List;

import com.ronal.entity.Cliente;

public interface IClienteService {

	public List<Cliente> listAll();

	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);

}
