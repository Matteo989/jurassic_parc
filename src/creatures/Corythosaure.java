package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Corythosaure extends Herbivorous implements Terrestrial {

	public Corythosaure() {
	}

	public Corythosaure(String name, boolean sex, double height, double weight, int age, boolean angry,
			boolean tired, boolean health) {
		super(name, sex, height, weight, age, angry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}
}
