package com.nelioalves.projeto_curso_nelioalves_java_secao24_springbook_mongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
