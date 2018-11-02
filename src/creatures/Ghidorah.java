package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Ghidorah extends Kaiju implements Flying, Terrestrial {

	
	private static volatile Ghidorah ghidorah = null; //volatile pour gérer les thread
	
	public static Ghidorah getGhidorah() {
		if(ghidorah == null) {
			ghidorah = new Ghidorah();
		}
		return ghidorah;
	}

	private Ghidorah() {
		this.setName("Ghidorah");
		this.setSex(true);
		this.setHeight(150);
		this.setWeight(70000);
		//ajouter une envergure (span)
		this.setAge(100);
		this.setHungry(false);
		this.setTired(false);
		this.setHealth(false);
		
	} //Contructeur privé pour le singleton 
	
	@Override
	public void walk() {
		System.out.println(this.getName() + " marche");
	}

	@Override
	public void fly() {
		System.out.println(this.getName() + " vole");
	}
}
