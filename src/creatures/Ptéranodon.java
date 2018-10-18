package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Ptéranodon extends Dinosaur implements Carnivorous, Piscivorous, Flying{

	

	public Ptéranodon(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Je vole");
	}

	@Override
	public void eatFish() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Je mange du poisson");
			this.setAngry(false);
			System.out.println("J'ai bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println("Je suis endormi");
		} else {
			System.out.println("Je n'ai pas faim");
		}
	}

	@Override
	public void eatMeat() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Je mange de la viande");
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
