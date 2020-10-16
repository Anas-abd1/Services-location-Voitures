package com.Anas.LocationVoiture.Entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voitures {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private long IdVoiture;
		private String ModelVoiture;
		private double PrixVoiture;
		private Date DateRetour;
		
		
		public Voitures(String modelVoiture, double prixVoiture, Date dateRetour) {
			super();
			ModelVoiture = modelVoiture;
			PrixVoiture = prixVoiture;
			DateRetour = dateRetour;
		}
		public Voitures() {
			super();
			
		}
		public long getIdVoiture() {
			return IdVoiture;
		}
		public void setIdVoiture(long idVoiture) {
			IdVoiture = idVoiture;
		}
		public String getModelVoiture() {
			return ModelVoiture;
		}
		public void setModelVoiture(String modelVoiture) {
			ModelVoiture = modelVoiture;
		}
		public double getPrixVoiture() {
			return PrixVoiture;
		}
		public void setPrixVoiture(double prixVoiture) {
			PrixVoiture = prixVoiture;
		}
		public Date getDateRetour() {
		
			return DateRetour;
		}
		public void setDateRetour(Date dateRetour) {
			DateRetour = dateRetour;
		}
		 
		@Override
		public String toString() {
			return "Voitures [IdVoiture=" + IdVoiture + ", ModelVoiture=" + ModelVoiture + ", PrixVoiture="
					 + " prixVoiture" + ", DateRetour=" + DateRetour + "]";
		}
		
					  }
