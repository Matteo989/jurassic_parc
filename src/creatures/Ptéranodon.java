package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Ptéranodon extends Omnivorous implements Flying{

	public Ptéranodon() {
	}

		public Ptéranodon(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean santé) {
		super(name, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " vole");
	}

	@Override
	public Egg layEggs() {
		Ptéranodon son = new Ptéranodon("PtéranodonSon", getRandomBoolean(), 10,10,10, true, true, true);
		return new Egg(10, son);
	}

	@Override
	public void eatEverything() {
		if(!this.isTired() && this.isHungry()) {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " mange du poisson et de la viande.");
			this.setHungry(false);
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " a bien mangé.");
			this.setTired(true);
		} else if (this.isTired()) {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est endormi.");
		} else {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " n'a pas faim.");
		}
	}

}
