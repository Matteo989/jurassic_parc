package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Cératosaure extends Dinosaur implements Carnivorous, Terrestrial {

	
	

	public Cératosaure(String name, boolean sex, double height, double weight, int age, boolean angry,
			boolean tired, boolean health) {
		super(name, sex, height, weight, age, angry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}

	@Override
	public void eatMeat() {
		if(!this.tired && this.isAngry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de la viande");
			this.setAngry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}

}
