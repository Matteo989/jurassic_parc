package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Tricératops extends Herbivorous implements Terrestrial {

	public Tricératops() {
	}

		public Tricératops(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}
}
