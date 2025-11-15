package com.fiap.IncluSync.application.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Erro {
    private String code;
    private HttpStatus status;
    private String message;
}
