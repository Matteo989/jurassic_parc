package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public abstract class Dinosaur {
	public String name;
	public boolean sex;
	public double height;
	public double weight;
	public int age;
	public boolean hanger;
	public boolean tiredness;
	public boolean health;
	
	
	
	
	public Dinosaur(String name, boolean sex, double height, double weight, int age, boolean hanger, boolean tiredness,
			boolean health) {
		super();
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.hanger = hanger;
		this.tiredness = tiredness;
		this.health = health;
	}

	public void eat(Dinosaur dinosaure) {
		if(this.tiredness == false ) {
			this.hanger = false; 
		}else 
			System.out.println("Je suis endormis");
	}
	
	public void makeNoise() {
		System.out.println("WHEN I SAY ANGER, YOU SAY FIST, ANGER FIST, ANGER FIST !");
	}
	
	public void getDinosaurState(Dinosaur dinosaure) {
		System.out.println("Le " + dinosaure.getName() + "a faim ?" + dinosaure.isHanger());
		System.out.println("Le " + dinosaure.getName() + "est en bonne santé ?" + dinosaure.isHealth());
		System.out.println("Le " + dinosaure.getName() + "est fatigué ?" + dinosaure.isTiredness());
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

	public boolean isHanger() {
		return hanger;
	}

	public void setHanger(boolean hanger) {
		this.hanger = hanger;
	}

	public boolean isTiredness() {
		return tiredness;
	}

	public void setTiredness(boolean tiredness) {
		this.tiredness = tiredness;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}
	
	
	
	

	
}
