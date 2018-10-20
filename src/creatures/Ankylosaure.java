package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Ankylosaure extends Herbivorous implements Terrestrial {

	public Ankylosaure() {
	}

	public Ankylosaure(String name, boolean sex, double height, double weight, int age, boolean angry,
						boolean tired, boolean health) {
		super(name, sex, height, weight, age, angry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}
}
