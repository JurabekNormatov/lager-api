package com.lager.lager_api.controller;

import com.lager.lager_api.model.Produkt;
import com.lager.lager_api.service.ProduktService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produkte")
public class ProduktController {
	
	private final ProduktService produktService;

    public ProduktController(ProduktService produktService) {
        this.produktService = produktService;
    }

    @GetMapping
    public ResponseEntity<List<Produkt>> alleProdukte() {
        return ResponseEntity.ok(produktService.alleProdukte());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produkt> produktById(@PathVariable Long id) {
        return ResponseEntity.ok(produktService.produktById(id));
    }

    @PostMapping
    public ResponseEntity<Produkt> erstellen(@RequestBody Produkt produkt) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produktService.erstellen(produkt));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produkt> aktualisieren(@PathVariable Long id, @RequestBody Produkt produkt) {
        return ResponseEntity.ok(produktService.aktualisieren(id, produkt));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> loeschen(@PathVariable Long id) {
        produktService.loeschen(id);
        return ResponseEntity.noContent().build();
    }

}
