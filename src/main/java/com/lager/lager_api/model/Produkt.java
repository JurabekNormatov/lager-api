package com.lager.lager_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produkte")
public class Produkt {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String beschreibung;
    private double preis;
    private int bestand;
    private int mindestbestand;

    public Produkt() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getBestand() {
		return bestand;
	}

	public void setBestand(int bestand) {
		this.bestand = bestand;
	}

	public int getMindestbestand() {
		return mindestbestand;
	}

	public void setMindestbestand(int mindestbestand) {
		this.mindestbestand = mindestbestand;
	}
    
    

}
