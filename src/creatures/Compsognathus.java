package creatures;
import typedinosaure.*;
import regimealimentaire.*;

public class Compsognathus extends Dinosaur implements Carnivorous, Terrestrial{

	// tout petit qui vit en meutes

	
	public Compsognathus(String name, boolean sex, double height, double weight, int age, boolean angry,
			boolean tired, boolean health) {
		super(name, sex, height, weight, age, angry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Je marche");		
	}

	@Override
	public void eatMeat() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Je mange de la viande");
			this.setAngry(false);
			System.out.println("J'ai bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println("Je suis endormi");
		} else {
			System.out.println("Je n'ai pas faim");
		}
	}

}
