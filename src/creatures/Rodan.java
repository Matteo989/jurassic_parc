package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Rodan extends Kaiju implements Omnivorous, Flying{

	private static volatile Rodan rodan = null; //volatile pour gérer les thread
	
	public static Rodan getRodan() {
		if(rodan == null) {
			rodan = new Rodan();
		}
		return rodan;
	}

	private Rodan() {
		this.name = "Rodan";
		this.sex = true;
		this.height = 70;
		this.weight = 60000;
		//ajouter une envergure (span)
		this.age = 8000;
		angry = false;
		tired = false;
		health = true;
	} //Contructeur privé pour le singleton 
	
	
	@Override
	public void fly() {
		System.out.println("Je vole");
	}

	@Override
	public void eatEverything() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Je mange de tout");
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
