package com.tiarlei.desafioCrudClientes.services.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg){
        super(msg);
    }
}
