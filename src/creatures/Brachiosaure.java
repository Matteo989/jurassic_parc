package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Brachiosaure extends Herbivorous implements Terrestrial {

	public Brachiosaure() {
	}

	public Brachiosaure(String name, boolean sex, double height, double weight, int age, boolean hungry,
						boolean tired, boolean health) {
		super(name, sex, height, weight, age, hungry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}
}
