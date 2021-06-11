package ar.com.ada.api.creditos.exceptions;

import ar.com.ada.api.creditos.entities.*;

/**
 * ClienteDNIException
 */
public class ClienteDNIException extends ClienteInfoException {

    public ClienteDNIException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
        
    }

}