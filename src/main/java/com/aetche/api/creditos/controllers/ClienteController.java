package com.aetche.api.creditos.controllers;

import com.aetche.api.creditos.entities.Cliente;
import com.aetche.api.creditos.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;



public class ClienteController {
    
    @Autowired
    ClienteService service;

    public void crearCliente(Cliente cliente){
        

    }
}
