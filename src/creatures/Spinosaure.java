package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Spinosaure extends Dinosaur implements Carnivorous, Piscivorous, Marine, Terrestrial {


	public Spinosaure(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");
	}

	@Override
	public void nager() {
		System.out.println("Je nage");
	}

	@Override
	public void eatFish() {
		System.out.println("Je mange du poisson");
	}

	@Override
	public void eatMeat() {
		System.out.println("Je mange de la viande");
	}

}
