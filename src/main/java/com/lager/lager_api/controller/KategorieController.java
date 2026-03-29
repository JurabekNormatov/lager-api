package com.lager.lager_api.controller;

import com.lager.lager_api.model.Kategorie;
import com.lager.lager_api.service.KategorieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/kategorien")
public class KategorieController {
	
	private final KategorieService kategorieService;
	
	public KategorieController(KategorieService kategorieService) {
		this.kategorieService = kategorieService;
	}
	
	@GetMapping
    public ResponseEntity<List<Kategorie>> alleKategorien() {
        return ResponseEntity.ok(kategorieService.alleKategorien());
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Kategorie> kategorieById(@PathVariable Long id) {
        return ResponseEntity.ok(kategorieService.kategorieById(id));
    }
	
	@PostMapping
    public ResponseEntity<Kategorie> erstellen(@RequestBody Kategorie kategorie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(kategorieService.erstellen(kategorie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kategorie> aktualisieren(@PathVariable Long id, @RequestBody Kategorie kategorie) {
        return ResponseEntity.ok(kategorieService.aktualisieren(id, kategorie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> loeschen(@PathVariable Long id) {
    	kategorieService.loeschen(id);
        return ResponseEntity.noContent().build();
    }

}
