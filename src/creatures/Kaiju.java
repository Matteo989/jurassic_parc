package creatures;

public abstract class Kaiju extends Creature {
	
	public Kaiju() {
		// TODO Auto-generated constructor stub
	}
	
	public Kaiju(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired,
			boolean health) {
		super();
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.hungry = hungry;
		this.tired = tired;
		this.health = health;
	}

	public void eatEverything() {
		if(!this.tired && this.isHungry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de tout");
			this.setHungry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi et ne peut pas manger.");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}
	
}
