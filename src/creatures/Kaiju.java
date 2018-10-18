package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public abstract class Kaiju {
	public String name;
	public boolean sex;
	public double height;
	public double weight;
	public int age;
	public boolean hanger;
	public boolean tiredness;
	public boolean health;
	
	public Kaiju() {
		// TODO Auto-generated constructor stub
	}
	
	public Kaiju(String name, boolean sex, double height, double weight, int age, boolean hanger, boolean tiredness,
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
	public boolean getHanger() {
		return hanger;
	}
	public void setHanger(boolean hanger) {
		this.hanger = hanger;
	}
	public boolean getTiredness() {
		return tiredness;
	}
	public void setTiredness(boolean tiredness) {
		this.tiredness = tiredness;
	}
	public boolean getHealth() {
		return health;
	}
	public void setSanté(boolean health) {
		this.health = health;
	}
	
}
