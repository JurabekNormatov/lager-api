package com.lager.lager_api.repository;

import com.lager.lager_api.model.Kategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorieRepository extends JpaRepository<Kategorie, Long>{

}
