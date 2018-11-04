package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Pteranodon extends Omnivorous implements Flying{

	public Pteranodon() {
	}

		public Pteranodon(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
			boolean sante) {
		super(name, sexe, taille, poids, age, faim, fatigue, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " vole");
	}

	@Override
	public Egg layEggs() {
		int i = 1;
		Pteranodon son = new Pteranodon("PteranodonChild" +i, getRandomBoolean(), 10,10,0, true, true, true);
		i++;
		return new Egg(10, son);
	}

	@Override
	public void eatEverything() {
		if(!this.isTired() && this.isHungry()) {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " mange du poisson et de la viande.");
			this.setHungry(false);
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " a bien mange.");
			this.setTired(true);
		} else if (this.isTired()) {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est endormi.");
		} else {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " n'a pas faim.");
		}
	}

	public void howl (){
		System.out.println("La creature " + this.getName() + " pousse un cri");
	}

}
