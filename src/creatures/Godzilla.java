package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public final class Godzilla extends Kaiju implements Omnivorous, Terrestrial, Marine{

	private static volatile Godzilla godzilla = null; //volatile pour gérer les thread
	
	public static Godzilla getGodzilla() {
		if(godzilla == null) {
			godzilla = new Godzilla();
		}
		return godzilla;
	}

	private Godzilla() {
		this.name = "Godzilla";
		this.sex = true;
		this.height = 110; 
		this.weight = 90000;
		this.age = 0;
		hanger = false;
		tiredness = false;
		health = true;
	} //Contructeur privé pour le singleton 
	
	@Override
	public void nager() {
		System.out.println("Je nage");
	}

	@Override
	public void walk() {
		System.out.println("Je marche");
	}
	

	@Override
	public void eatEverything() {
		System.out.println("Je mange de tout");			
	}
}
