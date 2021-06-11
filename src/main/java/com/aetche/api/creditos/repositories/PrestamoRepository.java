package com.aetche.api.creditos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aetche.api.creditos.entities.*;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

}