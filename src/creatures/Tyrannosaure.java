package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Tyrannosaure extends Dinosaur implements Carnivorous, Terrestrial{

	

	public Tyrannosaure(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");
	}

	@Override
	public void eatMeat() {
		System.out.println("Je mange de la viande");
	}

}
