package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Stégosaure extends Herbivorous implements Terrestrial {


	public Stégosaure() {
	}

	public Stégosaure(String name, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
					  boolean santé) {
		super(name, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Egg layEggs() {
		int i = 1;
		Stégosaure son = new Stégosaure("StégosaureChild" + i, getRandomBoolean(), 10,10,10, true, true, true);
		i++;
		return new Egg(10, son);
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}

	public void howl (){
		System.out.println("La créature " + this.getName() + " pousse un cri");
	}
}
