package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Rodan extends Kaiju implements Flying{

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
		hungry = false;
		tired = false;
		health = true;
	} //Contructeur privé pour le singleton 
	
	
	@Override
	public void fly() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " vole");
	}
}
