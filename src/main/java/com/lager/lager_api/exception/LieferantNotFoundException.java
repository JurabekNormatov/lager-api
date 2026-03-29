package com.lager.lager_api.exception;

public class LieferantNotFoundException extends RuntimeException {
	
	public LieferantNotFoundException(Long id) {
        super("Lieferant nicht gefunden mit ID: " + id);
    }

}
