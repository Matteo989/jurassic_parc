package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Tricératops extends Herbivorous implements Terrestrial {

	public Tricératops() {
	}

		public Tricératops(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(name, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}
}
