package com.lager.lager_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ProduktNotFoundException.class)
    public ResponseEntity<String> handleProduktNotFound(ProduktNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(KategorieNotFoundException.class)
    public ResponseEntity<String> handleKategorieNotFound(KategorieNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(LieferantNotFoundException.class)
    public ResponseEntity<String> handleLieferantNotFound(LieferantNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

}
