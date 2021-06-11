package com.aetche.api.creditos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aetche.api.creditos.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}

