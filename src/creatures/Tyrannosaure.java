package creatures;

import typedinosaure.*;
import regimealimentaire.*;

import java.sql.SQLOutput;

public class Tyrannosaure extends Dinosaur implements Carnivorous, Terrestrial{

	public Tyrannosaure(String nom, boolean sexe, double taille, double poids, int age, boolean faim, boolean fatigue,
						boolean santé) {
		super(nom, sexe, taille, poids, age, faim, fatigue, santé);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.name + " le " + this.getType().toLowerCase() + " marche");
	}

	@Override
	public void eatMeat() {
		if(!this.tired && this.isAngry()) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de la viande");
			this.setAngry(false);
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé");
		} else if (this.tired) {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi");
		} else {
			System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim");
		}
	}

	public String getType() {
		return "Tyrannosaure";
	}

}
