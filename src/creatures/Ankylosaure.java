package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Ankylosaure extends Herbivorous implements Terrestrial {

	public Ankylosaure() {
	}

	public Ankylosaure(String name, boolean sex, double height, double weight, int age, boolean hungry,
						boolean tired, boolean health) {
		super(name, sex, height, weight, age, hungry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		Ankylosaure son = new Ankylosaure("AnkilosaureSon", getRandomBoolean(), 10,10,10, true, true, true);
		return new Egg(10, son);
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}
}
