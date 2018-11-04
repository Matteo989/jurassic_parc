/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
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
	public Egg layEggs() {
		int i = 1;
		Brachiosaure son = new Brachiosaure("BrachiosaureChild" +i, getRandomBoolean(), 10,10,0, true, true, true);
		i++;
		return new Egg(10, son);
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}

	public void howl (){
		System.out.println("La creature " + this.getName() + " pousse un cri");
	}
}
