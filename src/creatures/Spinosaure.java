package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Spinosaure extends Omnivorous implements Marine, Terrestrial {


	public Spinosaure() {
	}

	public Spinosaure(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
					  boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche.");
	}

	@Override
	public void nager() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " nage.");
	}
}
