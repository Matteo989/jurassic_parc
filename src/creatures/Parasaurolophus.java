package creatures;

import typedinosaure.*;
import regimealimentaire.*;
	
public class Parasaurolophus extends Herbivorous implements Terrestrial {

	public Parasaurolophus() {
	}

		public Parasaurolophus(String name, boolean sexe, double taille, double poids, int age, boolean faim,
			boolean fatigue, boolean santé) {
		super(name, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		Parasaurolophus son = new Parasaurolophus("Parasaurolophus", getRandomBoolean(), 10,10,10, true, true, true);
		return new Egg(10, son);
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}
}
