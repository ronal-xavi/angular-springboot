package com.ronal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ronal.entity.Cliente;
import com.ronal.service.IClienteService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = { "http://localhost:4200" }, methods = { RequestMethod.GET, RequestMethod.POST })
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClienteController {
	private final IClienteService clienteService;

	@GetMapping("/listar")
	public List<Cliente> listAll() {
		return clienteService.listAll();
	}

}
