package com.example.hw6;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpServerErrorException.BadGateway.class)
    public ResponseEntity<Object> handleBadGateway(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Кастомная ошибка 502", new HttpHeaders(), HttpStatus.BAD_GATEWAY, request);
    }
}
