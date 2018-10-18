package creatures;

import typedinosaure.*;
import regimealimentaire.*;
	
public class Parasaurolophus extends Dinosaur implements Herbivorous, Terrestrial {



	public Parasaurolophus(String nom, boolean sexe, double taille, double poids, int age, boolean faim,
			boolean fatigue, boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");
	}

	@Override
	public void eatVegetables() {
		System.out.println("Je mange de l'herbe (et je parle pas de cannabis mdr");		
	}

}
