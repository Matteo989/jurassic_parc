package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Brachiosaure extends Dinosaur implements Herbivorous, Terrestrial {

	

	public Brachiosaure(String name, boolean sex, double height, double weight, int age, boolean hanger,
			boolean tiredness, boolean health) {
		super(name, sex, height, weight, age, hanger, tiredness, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");		
	}

	@Override
	public void eatVegetables() {
		System.out.println("Je mange de l'herbe (et je parle pas de cannabis mdr)");		
	}
	
}
