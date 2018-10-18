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
		hanger = false;
		tiredness = false;
		health = true;
	} //Contructeur privé pour le singleton 
	
	
	@Override
	public void fly() {
		System.out.println("Je vole");
	}

	@Override
	public void eatEverything() {
		System.out.println("Je mange de tout");
	}

}
