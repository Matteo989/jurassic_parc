package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Vélociraptor extends Carnivorous implements Terrestrial {

	
	public Vélociraptor(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}
}
