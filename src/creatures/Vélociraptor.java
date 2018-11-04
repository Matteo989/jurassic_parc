package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Vélociraptor extends Carnivorous implements Terrestrial {


	public Vélociraptor() {
	}

	public Vélociraptor(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
						boolean santé) {
		super(name, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		int i = 1;
		Vélociraptor son = new Vélociraptor("VélociraptorChild" +i, getRandomBoolean(), 10,10,10, true, true, true);
		++i;
		return new Egg(10, son);
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}
}
