package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Ceratosaure extends Carnivorous implements Terrestrial {


	public Ceratosaure() {
	}

	public Ceratosaure(String name, boolean sex, double height, double weight, int age, boolean hungry,
					   boolean tired, boolean health) {
		super(name, sex, height, weight, age, hungry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		int i = 1;
		Ceratosaure son = new Ceratosaure("CeratosaureChild" + i, getRandomBoolean(), 10,10,0, true, true, true);
		i++;
		return new Egg(10, son);
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}

}
