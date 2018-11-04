package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Spinosaure extends Omnivorous implements Marine, Terrestrial {


	public Spinosaure() {
	}

	public Spinosaure(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
					  boolean santé) {
		super(name, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		Spinosaure son = new Spinosaure("SpinosaureSon", getRandomBoolean(), 10,10,10, true, true, true);
		return new Egg(10, son);
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche.");
	}

	@Override
	public void nager() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " nage.");
	}
}
