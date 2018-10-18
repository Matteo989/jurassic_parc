package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Stégosaure extends Dinosaur implements Herbivorous, Terrestrial {

	


	public Stégosaure(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void walk() {
		System.out.println("Je marche");		
	}


	@Override
	public void eatVegetables() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Je mange de l'herbe (et je ne parle pas de cannabis mdr)");
			this.setAngry(false);
			System.out.println("J'ai bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println("Je suis endormi");
		} else {
			System.out.println("Je n'ai pas faim");
		}
	}
}
