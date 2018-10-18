package creatures;
import typedinosaure.*;
import regimealimentaire.*;

public class Compsognathus extends Dinosaur implements Carnivorous, Terrestrial{

	

	
	public Compsognathus(String name, boolean sex, double height, double weight, int age, boolean hanger,
			boolean tiredness, boolean health) {
		super(name, sex, height, weight, age, hanger, tiredness, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");		
	}

	@Override
	public void eatMeat() {
		System.out.println("Je mange de la beat. (meat* pardon hihi)");				
	}

}
