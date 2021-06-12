package com.aetche.api.creditos.controllers;

import java.util.List;

import com.aetche.api.creditos.entities.Cliente;
import com.aetche.api.creditos.models.GenericResponse;
import com.aetche.api.creditos.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> traerTodos() {

        return ResponseEntity.ok(service.traerTodos());

    }

    @PostMapping
    public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente) {

        service.crearClientes(cliente);
        GenericResponse respuesta = new GenericResponse();
        respuesta.isOk= true;
        respuesta.id = cliente.getClienteId();
        respuesta.message = "El cliente fue creadocon éxito";
        
        return ResponseEntity.ok(respuesta);
    }

}
