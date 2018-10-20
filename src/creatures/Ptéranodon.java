package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Ptéranodon extends Omnivorous implements Flying{

	public Ptéranodon() {
	}

		public Ptéranodon(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " vole");
	}

	@Override
	public void eatEverything() {
		if(!this.tired && this.isAngry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange du poisson et de la viande.");
			this.setAngry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé.");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi.");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim.");
		}
	}

}
