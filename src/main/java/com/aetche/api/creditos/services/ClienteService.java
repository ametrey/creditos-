package com.aetche.api.creditos.services;

import java.util.List;

import com.aetche.api.creditos.entities.Cliente;
import com.aetche.api.creditos.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public List<Cliente> traerTodos(){

        return repository.findAll();

    }





}