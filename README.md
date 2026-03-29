# Lager API – Spring Boot REST Backend

Backend-Service für das Lager Management System. Stellt eine REST API für die Verwaltung von Produkten, Kategorien und Lieferanten bereit.

## Technologien

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- MySQL 9
- Maven

## Voraussetzungen

- Java 21+
- Maven 3.8+
- MySQL läuft lokal auf Port 3306
- Datenbank `lager_db` existiert

## Schnellstart

**1. Repository klonen:**
```bash
git clone https://github.com/JurabekNormatov/lager-api.git
cd lager-api
```

**2. Datenbank anlegen:**
```sql
CREATE DATABASE lager_db;
```

**3. Umgebungsvariable setzen:**
```bash
export DB_PASSWORD='dein-passwort'
```

**4. API starten:**
```bash
mvn spring-boot:run
```

Die API läuft danach auf: `http://localhost:8080`

## API Endpoints

### Produkte
| Methode | Endpoint | Beschreibung |
|--------|----------|--------------|
| GET | /api/produkte | Alle Produkte abrufen |
| GET | /api/produkte/{id} | Produkt nach ID |
| POST | /api/produkte | Neues Produkt anlegen |
| PUT | /api/produkte/{id} | Produkt aktualisieren |
| DELETE | /api/produkte/{id} | Produkt löschen |

### Kategorien
| Methode | Endpoint | Beschreibung |
|--------|----------|--------------|
| GET | /api/kategorien | Alle Kategorien abrufen |
| GET | /api/kategorien/{id} | Kategorie nach ID |
| POST | /api/kategorien | Neue Kategorie anlegen |
| PUT | /api/kategorien/{id} | Kategorie aktualisieren |
| DELETE | /api/kategorien/{id} | Kategorie löschen |

### Lieferanten
| Methode | Endpoint | Beschreibung |
|--------|----------|--------------|
| GET | /api/lieferanten | Alle Lieferanten abrufen |
| GET | /api/lieferanten/{id} | Lieferant nach ID |
| POST | /api/lieferanten | Neuen Lieferanten anlegen |
| PUT | /api/lieferanten/{id} | Lieferant aktualisieren |
| DELETE | /api/lieferanten/{id} | Lieferant löschen |

## Projektstruktur
```
src/main/java/com/lager/lager_api/
├── controller/     – REST Controller (HTTP Anfragen)
├── service/        – Geschäftslogik
├── repository/     – Datenbankzugriff (Spring Data JPA)
├── model/          – Entitäten (Produkt, Kategorie, Lieferant)
└── exception/      – Fehlerbehandlung (GlobalExceptionHandler)
```

## Zugehöriges Projekt

Die JavaFX Desktop-Anwendung, die diese API aufruft:  
[lager-gui](https://github.com/JurabekNormatov/lager-gui)

## Autor

**Jurabek Normatov** – Junior Java Backend Developer  
Berlin, Deutschland  
GitHub: [JurabekNormatov](https://github.com/JurabekNormatov)
