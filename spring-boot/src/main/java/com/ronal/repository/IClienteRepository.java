package com.ronal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronal.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
