package com.ronal.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ronal.entity.Cliente;
import com.ronal.repository.IClienteRepository;
import com.ronal.service.IClienteService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ClienteServiceImpl implements IClienteService {
	
	private final IClienteRepository clienteRepository;

	@Override
	public List<Cliente> listAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente findById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		clienteRepository.deleteById(id);
		
	}

}
