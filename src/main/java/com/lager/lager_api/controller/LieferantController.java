package com.lager.lager_api.controller;


import com.lager.lager_api.model.Lieferant;
import com.lager.lager_api.service.LieferantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lieferanten")
public class LieferantController {
	
    private final LieferantService lieferantService;
	
	public LieferantController(LieferantService lieferantService) {
		this.lieferantService = lieferantService;
	}
	
	@GetMapping
    public ResponseEntity<List<Lieferant>> alleLieferanten() {
        return ResponseEntity.ok(lieferantService.alleLieferanten());
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Lieferant> lieferantById(@PathVariable Long id) {
        return ResponseEntity.ok(lieferantService.lieferantById(id));
    }
	
	@PostMapping
    public ResponseEntity<Lieferant> erstellen(@RequestBody Lieferant lieferant) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lieferantService.erstellen(lieferant));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lieferant> aktualisieren(@PathVariable Long id, @RequestBody Lieferant lieferant) {
        return ResponseEntity.ok(lieferantService.aktualisieren(id, lieferant));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> loeschen(@PathVariable Long id) {
    	lieferantService.loeschen(id);
        return ResponseEntity.noContent().build();
    }

}
