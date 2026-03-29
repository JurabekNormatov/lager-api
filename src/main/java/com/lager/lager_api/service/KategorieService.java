package com.lager.lager_api.service;

import com.lager.lager_api.exception.KategorieNotFoundException;
import com.lager.lager_api.model.Kategorie;
import com.lager.lager_api.repository.KategorieRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KategorieService {
	
	private final KategorieRepository kategorieRepository;
	
	public KategorieService(KategorieRepository kategorieRepository) {
		this.kategorieRepository = kategorieRepository;
	}
	
	public List<Kategorie> alleKategorien(){
		return kategorieRepository.findAll();
	}
	
	public Kategorie kategorieById(Long id) {
		return kategorieRepository.findById(id)
				.orElseThrow(() -> new KategorieNotFoundException(id));
	}
	
	public Kategorie erstellen(Kategorie kategorie) {
		return kategorieRepository.save(kategorie);
	}
	
	public Kategorie aktualisieren(Long id, Kategorie neu) {
		Kategorie alt = kategorieById(id);
		alt.setName(neu.getName());
        alt.setBeschreibung(neu.getBeschreibung());
        return kategorieRepository.save(alt);
	}
	
	public void loeschen(Long id) {
		kategorieById(id);
        kategorieRepository.deleteById(id);
    }

}
