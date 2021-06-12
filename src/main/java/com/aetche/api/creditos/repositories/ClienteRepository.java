package com.aetche.api.creditos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aetche.api.creditos.entities.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}

