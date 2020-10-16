package com.Anas.LocationVoiture.Service;

import java.util.List;

import com.Anas.LocationVoiture.Entities.Voitures;

public interface VoitureService {
	Voitures saveVoiture(Voitures v);
	Voitures updateVoiture(Voitures v);
	void deleteVoiture(Voitures v);
	void deleteVoitureById(Long id);
	Voitures getVoitures(Long id);
	List<Voitures> getAllProduits();

}
