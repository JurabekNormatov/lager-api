package com.lager.lager_api.service;

import com.lager.lager_api.exception.ProduktNotFoundException;
import com.lager.lager_api.model.Produkt;
import com.lager.lager_api.repository.ProduktRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduktService {
	
	private final ProduktRepository produktRepository;

    public ProduktService(ProduktRepository produktRepository) {
        this.produktRepository = produktRepository;
    }

    public List<Produkt> alleProdukte() {
        return produktRepository.findAll();
    }

    public Produkt produktById(Long id) {
        return produktRepository.findById(id)
            .orElseThrow(() -> new ProduktNotFoundException(id));
    }

    public Produkt erstellen(Produkt produkt) {
        return produktRepository.save(produkt);
    }

    public Produkt aktualisieren(Long id, Produkt neu) {
        Produkt alt = produktById(id);
        alt.setName(neu.getName());
        alt.setBeschreibung(neu.getBeschreibung());
        alt.setPreis(neu.getPreis());
        alt.setBestand(neu.getBestand());
        alt.setMindestbestand(neu.getMindestbestand());
        return produktRepository.save(alt);
    }

    public void loeschen(Long id) {
        produktById(id);
        produktRepository.deleteById(id);
    }

}
