package creatures;

import regimealimentaire.*;
import typedinosaure.*;

public class Mithra extends Kaiju implements Flying {

	private static volatile Mithra mithra = null; //volatile pour gerer les thread
	
	public static Mithra getMithra() {
		if(mithra == null) {
			mithra = new Mithra();
		}
		return mithra;
	}

	private Mithra() {
		this.setName("Mithra");
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
