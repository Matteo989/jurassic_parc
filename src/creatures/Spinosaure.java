/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Spinosaure extends Omnivorous implements Marine, Terrestrial {


	public Spinosaure() {
	}

	public Spinosaure(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
					  boolean sante) {
		super(name, sexe, taille, poids, age, faim, fatigue, sante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		int i = 1;
		Spinosaure son = new Spinosaure("SpinosaureChild" + i, getRandomBoolean(), 10,10,0, true, true, true);
		i++;
		return new Egg(10, son);
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche ou nage");
	}

	public void howl (){
		System.out.println("La creature " + this.getName() + " pousse un cri");
	}

}
