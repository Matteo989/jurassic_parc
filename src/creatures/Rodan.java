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
		this.setName("Rodan");
		this.setSex(true);
		this.setHeight(70);
		this.setWeight(60000);
		//ajouter une envergure (span)
		this.setAge(100);
		this.setHungry(false);
		this.setTired(false);
		this.setHealth(true);
	} //Contructeur privé pour le singleton 
	
	
	@Override
	public void fly() {
		System.out.println(this.getName() + " vole");
	}
}
