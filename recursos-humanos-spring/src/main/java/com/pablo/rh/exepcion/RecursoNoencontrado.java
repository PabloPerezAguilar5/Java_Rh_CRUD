package com.pablo.rh.exepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoencontrado extends RuntimeException {
    public RecursoNoencontrado(String mensaje){
        super(mensaje);
    }
}
