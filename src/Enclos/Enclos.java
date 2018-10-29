package Enclos;
import java.util.ArrayList;

import Animaux.*;

public abstract class Enclos {
	public String nom;
	public int superficie;
	public int animauxMax, nbAnimaux;
	public String propreté; //Mauvais, Bon, Correct
	public ArrayList<Animal> animaux;
	
	public Enclos(String nom, int superficie, int animauxMax, int nbAnimaux, String propreté) {
		super();
		this.nom = nom;
		this.superficie = superficie;
		this.animauxMax = animauxMax;
		this.nbAnimaux = nbAnimaux;
		this.propreté = propreté;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public int getAnimauxMax() {
		return animauxMax;
	}
	public void setAnimauxMax(int animauxMax) {
		this.animauxMax = animauxMax;
	}
	public int getNbAnimaux() {
		return nbAnimaux;
	}
	public void setNbAnimaux(int nbAnimaux) {
		this.nbAnimaux = nbAnimaux;
	}
	public String getPropreté() {
		return propreté;
	}
	public void setPropreté(String propreté) {
		this.propreté = propreté;
	}
	
	public void printAnimalsDetails() {
		for(Animal animal:animaux) {
			animal.toString();
		}
	}

	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}

	public void feedAnimals() {
		for(Animal animal:animaux) {
			animal.hanger = false;
		}
	}
	
	public void clean() {
		if(this.animaux.isEmpty() && this.propreté == "Mauvais") {
			this.propreté = "Bon";
		}
	}

	@Override
	public String toString() {
		return "Enclos [nom=" + nom + ", superficie=" + superficie + ", animauxMax=" + animauxMax + ", nbAnimaux="
				+ nbAnimaux + ", propreté=" + propreté + ", animaux=" + animaux + "]";
	}
	

	

}
