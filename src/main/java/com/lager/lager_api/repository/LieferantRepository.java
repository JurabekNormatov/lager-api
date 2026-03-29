package com.lager.lager_api.repository;

import com.lager.lager_api.model.Lieferant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LieferantRepository extends JpaRepository<Lieferant, Long>{

}
