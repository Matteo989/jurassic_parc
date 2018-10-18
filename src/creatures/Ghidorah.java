package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Ghidorah extends Kaiju implements Omnivorous, Flying, Terrestrial {

	
	private static volatile Ghidorah ghidorah = null; //volatile pour gérer les thread
	
	public static Ghidorah getGhidorah() {
		if(ghidorah == null) {
			ghidorah = new Ghidorah();
		}
		return ghidorah;
	}

	private Ghidorah() {
		this.name = "Ghidorah";
		this.sex = true;
		this.height = 150;
		this.weight = 70000;
		//ajouter une envergure (span)
		this.age = 10000;
		angry = false;
		tired = false;
		health = true;
		
	} //Contructeur privé pour le singleton 
	
	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}

	@Override
	public void fly() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " vole");
	}

	@Override
	public void eatEverything() {
		if(!this.tired && this.isAngry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de tout");
			this.setAngry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}
}
