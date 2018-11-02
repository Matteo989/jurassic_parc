package creatures;
import typedinosaure.*;
import regimealimentaire.*;

public class Compsognathus extends Carnivorous implements Terrestrial{

	// tout petit qui vit en meutes


	public Compsognathus() {
	}

	public Compsognathus(String name, boolean sex, double height, double weight, int age, boolean hungry,
						 boolean tired, boolean health) {
		super(name, sex, height, weight, age, hungry, tired, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}

}
