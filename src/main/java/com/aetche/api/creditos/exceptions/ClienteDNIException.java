package com.aetche.api.creditos.exceptions;

import com.aetche.api.creditos.entities.Cliente;



/**
 * ClienteDNIException
 */
public class ClienteDNIException extends ClienteInfoException {

    public ClienteDNIException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
        
    }

}