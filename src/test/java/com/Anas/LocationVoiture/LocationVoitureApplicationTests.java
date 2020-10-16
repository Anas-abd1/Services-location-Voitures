package com.Anas.LocationVoiture;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Anas.LocationVoiture.Entities.Voitures;
import com.Anas.LocationVoiture.Repos.VoitureRepository;


@SpringBootTest
class LocationVoitureApplicationTests {
	
	@Autowired
	private VoitureRepository voitureRepository;
	
	@Test
	public void testCreateVoiture() 
	{
		Voitures v = new Voitures("BMW",22.500,new Date());
		voitureRepository.save(v);
 	} 
	@Test
	public void testFindVoiture() 
	{
		Voitures v = voitureRepository.findById(1L).get();
		voitureRepository.save(v);
	}
	@Test
	public void TestUpdateVoiture() 
	{
		Voitures v=voitureRepository.findById(1L).get();
		v.setPrixVoiture(450.123);
		voitureRepository.save(v);
		System.out.println(v);
	}
	@Test
	public void TestDeleteVoiture() 
	{
		voitureRepository.deleteById(1L);
		
	}
	@Test
	public void TestFindAllVoiture() 
	{
		List<Voitures> v=voitureRepository.findAll();
		
		for(Voitures i:v)
			System.out.println(i);
		
	}
	
	

}
  