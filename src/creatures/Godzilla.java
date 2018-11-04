package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public final class Godzilla extends Kaiju implements Terrestrial, Marine{

	private static volatile Godzilla godzilla = null; //volatile pour gérer les thread
	
	public static Godzilla getGodzilla() {
		if(godzilla == null) {
			godzilla = new Godzilla();
		}
		return godzilla;
	}

	private Godzilla() {
		this.setName("Godzilla");
		this.setSex(true);
		this.setHeight(110);
		this.setWeight(90000);
		//ajouter une envergure (span)
		this.setAge(200);
		this.setHungry(false);
		this.setTired(false);
		this.setHealth(false);
	} //Contructeur privé pour le singleton 
	
	@Override
	public void move() {
		System.out.println(this.getName() + " marche et nage");
	}


	public void howl (){
		System.out.println("La créature " + this.getName() + " pousse un cri");
	}

	@Override
	public Egg layEggs() {
		return null;
	}

}
