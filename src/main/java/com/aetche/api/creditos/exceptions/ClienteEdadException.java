package com.aetche.api.creditos.exceptions;

import com.aetche.api.creditos.entities.Cliente;


/**
 * ClienteEdadException
 */
public class ClienteEdadException extends ClienteInfoException {

    public ClienteEdadException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
    }

}