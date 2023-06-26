package com.ronal.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ronal.entity.Cliente;
import com.ronal.service.IClienteService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = { "http://localhost:4200" }, methods = { RequestMethod.GET, RequestMethod.POST,
		RequestMethod.DELETE, RequestMethod.PUT })
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClienteController {
	private final IClienteService clienteService;

	@GetMapping("/cliente/listar")
	public List<Cliente> listAll() {
		return clienteService.listAll();
	}

	@GetMapping("/cliente/search/{id}")
	public Cliente findById(@PathVariable("id") Long id) {
		return clienteService.findById(id);
	}

	@PostMapping("/cliente/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@PutMapping("/cliente/update/{id}")
	public Cliente update(@RequestBody Cliente cliente, @PathVariable("id") Long id) {
		Cliente clienteEncontrado = this.clienteService.findById(id);
		if(clienteEncontrado != null) {
			clienteEncontrado.setNombre(cliente.getNombre());
			clienteEncontrado.setApellido(cliente.getApellido());
			clienteEncontrado.setEmail(cliente.getEmail());
			clienteEncontrado.setCreateAt(cliente.getCreateAt());
			return this.clienteService.save(clienteEncontrado);
		}
		return null;
	}
	
	@DeleteMapping("/cliente/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.clienteService.delete(id);
	}

}
