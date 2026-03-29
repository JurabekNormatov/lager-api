package com.lager.lager_api.service;

import com.lager.lager_api.exception.LieferantNotFoundException;
import com.lager.lager_api.model.Lieferant;
import com.lager.lager_api.repository.LieferantRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LieferantService {
	
	private final LieferantRepository lieferantRepository;
	
	public LieferantService(LieferantRepository lieferantRepository) {
		this.lieferantRepository = lieferantRepository;
	}
	
	public List<Lieferant> alleLieferanten(){
		return lieferantRepository.findAll();
	}
	
	public Lieferant lieferantById(Long id) {
		return lieferantRepository.findById(id)
				.orElseThrow(() -> new LieferantNotFoundException(id));
	}
	
	public Lieferant erstellen(Lieferant lieferant) {
		return lieferantRepository.save(lieferant);
	}
	
	public Lieferant aktualisieren(Long id, Lieferant neu) {
		Lieferant alt = lieferantById(id);
		alt.setName(neu.getName());
		alt.setEmail(neu.getEmail());
		alt.setTelefon(neu.getTelefon());
		return lieferantRepository.save(alt);
	}
	
	public void loeschen(Long id) {
		lieferantById(id);
		lieferantRepository.deleteById(id);
    }

}
