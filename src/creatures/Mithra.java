package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Mithra extends Kaiju implements Flying {

	private static volatile Mithra mithra = null; //volatile pour gérer les thread
	
	public static Mithra getMithra() {
		if(mithra == null) {
			mithra = new Mithra();
		}
		return mithra;
	}

	private Mithra() { 
		this.name = "Mithra";
		this.sex = false;
		this.height = 90;	
		//ajouter une envergure (span)
		this.weight = 40000;
		this.age = 5000;
		hungry = false;
		tired = false;
		health = true;		
	} //Contructeur privé pour le singleton 
	
	@Override
	public void fly() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " nage");
	}
}
