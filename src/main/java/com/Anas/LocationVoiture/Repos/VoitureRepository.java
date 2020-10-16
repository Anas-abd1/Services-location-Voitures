package com.Anas.LocationVoiture.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Anas.LocationVoiture.Entities.Voitures;

public interface VoitureRepository extends JpaRepository<Voitures, Long> {

}