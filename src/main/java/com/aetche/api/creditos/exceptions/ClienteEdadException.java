package ar.com.ada.api.creditos.exceptions;

import ar.com.ada.api.creditos.entities.*;

/**
 * ClienteEdadException
 */
public class ClienteEdadException extends ClienteInfoException {

    public ClienteEdadException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
    }

}