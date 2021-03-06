/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Ghidorah extends Kaiju implements Flying, Terrestrial {

	
	private static volatile Ghidorah ghidorah = null; //volatile pour gerer les thread
	
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
		
	} //Contructeur prive pour le singleton
	
	@Override
	public void move() {
		System.out.println(this.getName() + " marche et vole");
	}


	public void howl (){
		System.out.println("La creature " + this.getName() + " pousse un cri");
	}

	@Override
	public Egg layEggs() {
		return null;
	}

}
