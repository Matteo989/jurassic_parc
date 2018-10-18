package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public abstract class Dinosaur {
	public String name;
	public boolean sex;   // 1 = male, 0 = female
	public double height; // en cm
	public double weight; // en kilos
	public int age;
	public boolean angry; // 1 = faim , 0 = pas faim
	public boolean tired;
	public boolean health; // 1 = ok , 0 = pas bon


	public Dinosaur(String name, boolean sex, double height, double weight, int age, boolean angry, boolean tired,
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
	
	public void makeNoise() {
		System.out.println("WHEN I SAY ANGER, YOU SAY FIST, ANGER FIST, ANGER FIST !");
	}
	
	public void getDinosaurState() {
		if (this.isAngry()) {
			System.out.println("Le " + this.getName() + " a faim.");
		} else {
			System.out.println("Le " + this.getName() + " n'a pas faim.");
		}

		//a refaire les deux suivants
		System.out.println("Le " + this.getName() + " est en bonne santé ? " + this.isHealth());
		System.out.println("Le " + this.getName() + " est fatigué ? " + this.isTired());
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAngry() {
		return angry;
	}

	public void setAngry(boolean angry) {
		this.angry = angry;
	}

	public boolean isTired() {
		return tired;
	}

	public void setTired(boolean tired) {
		this.tired = tired;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}
	
	
	
	

	
}
