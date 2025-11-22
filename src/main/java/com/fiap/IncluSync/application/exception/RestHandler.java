package com.fiap.IncluSync.application.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class RestHandler {

    @ExceptionHandler(value={UnauthorizedException.class})
    public ResponseEntity<Erro> handleUnauthorizedException(Exception e) {
        Erro erro = new Erro();
        erro.setCode("RT0001");
        erro.setStatus(HttpStatus.UNAUTHORIZED);
        erro.setMessage(e.getMessage());
        log.error(erro.toString());

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(erro);
    }

    @ExceptionHandler(value = {UserExistsException.class})
    public ResponseEntity<Erro> handleUserExistsException(Exception e) {
        Erro erro = new Erro();
        erro.setCode("RT0002");
        erro.setStatus(HttpStatus.CONFLICT);
        erro.setMessage(e.getMessage());
        log.error(erro.toString());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }

    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<Erro> handleUserNotFoundException(Exception e) {
        Erro erro = new Erro();
        erro.setCode("RT0003");
        erro.setStatus(HttpStatus.NOT_FOUND);
        erro.setMessage(e.getMessage());
        log.error(erro.toString());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }

    @ExceptionHandler(value = {StationRegisteredException.class})
    public ResponseEntity<Erro> handleStationRegisteredException(Exception e) {
        Erro erro = new Erro();
        erro.setCode("RT0004");
        erro.setStatus(HttpStatus.CONFLICT);
        erro.setMessage(e.getMessage());
        log.error(erro.toString());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }

    @ExceptionHandler(value = {StationNotFoundException.class})
    public ResponseEntity<Erro> handleStationNotFoundException(Exception e) {
        Erro erro = new Erro();
        erro.setCode("RT0005");
        erro.setStatus(HttpStatus.NOT_FOUND);
        erro.setMessage(e.getMessage());
        log.error(erro.toString());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}
