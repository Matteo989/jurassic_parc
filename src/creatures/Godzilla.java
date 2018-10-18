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
		angry = false;
		tired = false;
		health = true;
	} //Contructeur privé pour le singleton 
	
	@Override
	public void nager() {
		System.out.println("Godzilla nage");
	}

	@Override
	public void walk() {
		System.out.println("Godzilla marche");
	}

	@Override
	public void eatEverything() {
		if(!this.tired && this.isAngry()) {
			System.out.println("Godzilla mange de tout");
			this.setAngry(false);
			System.out.println("Godzilla a bien mangé");
			this.setTired(true);
		} else if (this.tired) {
			System.out.println("Godzilla est endormi");
		} else {
			System.out.println("Godzilla n'a pas faim");
		}
	}
}
