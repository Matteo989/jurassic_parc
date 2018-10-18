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
		hanger = false;
		tiredness = false;
		health = true;
		
	} //Contructeur privé pour le singleton 
	
	@Override
	public void walk() {
		System.out.println("Je marche");
	}

	@Override
	public void fly() {
		System.out.println("Je vole");
	}

	@Override
	public void eatEverything() {
		System.out.println("Je mange de tout");		
	}

}
