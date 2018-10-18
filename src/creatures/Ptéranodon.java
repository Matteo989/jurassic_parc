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
		System.out.println("Je mange du poisson");
	}

	@Override
	public void eatMeat() {
		System.out.println("Je mange de la viande");
	}

}
