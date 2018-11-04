/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Rodan extends Kaiju implements Flying{

	private static volatile Rodan rodan = null; //volatile pour gerer les thread
	
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
	} //Contructeur prive pour le singleton
	
	
	@Override
	public void move() {
		System.out.println(this.getName() + " vole");
	}

	public void howl (){
		System.out.println("La creature " + this.getName() + " pousse un cri");
	}
	@Override
	public Egg layEggs() {
		return null;
	}
}
