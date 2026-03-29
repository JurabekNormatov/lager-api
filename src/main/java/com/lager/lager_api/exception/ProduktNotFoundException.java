package com.lager.lager_api.exception;

public class ProduktNotFoundException extends RuntimeException{
	
	public ProduktNotFoundException(Long id) {
        super("Produkt nicht gefunden mit ID: " + id);
    }

}
