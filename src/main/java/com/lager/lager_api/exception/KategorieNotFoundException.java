package com.lager.lager_api.exception;

public class KategorieNotFoundException extends RuntimeException{
	
	public KategorieNotFoundException(Long id) {
        super("Kategorie nicht gefunden mit ID: " + id);
    }

}
