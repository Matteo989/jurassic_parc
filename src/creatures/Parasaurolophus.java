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
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}

	@Override
	public void eatVegetables() {
		if(!this.tired && this.isAngry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de l'herbe (et je ne parle pas de cannabis mdr)");
			this.setAngry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé");
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi et ne peut pas manger.");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}
}
