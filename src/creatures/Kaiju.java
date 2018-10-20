package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public abstract class Kaiju extends Creatures {
	
	public Kaiju() {
		// TODO Auto-generated constructor stub
	}
	
	public Kaiju(String name, boolean sex, double height, double weight, int age, boolean angry, boolean tired,
			boolean health) {
		super();
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.angry = angry;
		this.tired = tired;
		this.health = health;
	}

	public void eatEverything() {
		if(!this.tired && this.isAngry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de tout");
			this.setAngry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi et ne peut pas manger.");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}
	
}
