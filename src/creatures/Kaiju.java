package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public abstract class Kaiju {
	public String name;
	public boolean sex;
	public double height;
	public double weight;
	public int age;
	public boolean angry;
	public boolean tired;
	public boolean health;
	
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
	
	
	public String getName() {
		return name;
	}
	public void setNom(String name) {
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
	public void setTaille(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setPoids(double weight) {
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
	public void setSanté(boolean health) {
		this.health = health;
	}

	public String getType() {
		return this.getClass().getSimpleName();
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
