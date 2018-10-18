package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Brachiosaure extends Dinosaur implements Herbivorous, Terrestrial {

	

	public Brachiosaure(String name, boolean sex, double height, double weight, int age, boolean angry,
			boolean tired, boolean health) {
		super(name, sex, height, weight, age, angry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");		
	}

	@Override
	public void eatVegetables() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Je mange de l'herbe (et je ne parle pas de cannabis mdr)");
			this.setAngry(false);
			System.out.println("J'ai bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println("Je suis endormi");
		} else {
			System.out.println("Je n'ai pas faim");
		}
	}
}
