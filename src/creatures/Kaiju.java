package creatures;

public abstract class Kaiju extends Creature {
	
	public Kaiju() {
		// TODO Auto-generated constructor stub
	}

	public Kaiju(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired, boolean health) {
		super(name, sex, height, weight, age, hungry, tired, health);
	}

	public void eatEverything() {
		if(!this.isTired() && this.isHungry()) {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " mange de tout");
			this.setHungry(false);
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " a bien mangé");
			this.setTired(true);
		} else if (this.isTired()) {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est endormi et ne peut pas manger.");
		} else {
			System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}
	
}
