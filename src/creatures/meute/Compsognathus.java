package creatures.meute;
import typedinosaure.*;
import regimealimentaire.*;

import java.util.*;

public class Compsognathus extends Carnivorous implements Terrestrial {



    private HowlStrategy howlStrategy;
    private Pack pack;
    private boolean heat;
    private boolean attack;
	private String catAge; //Jeune, Adulte, Vieux
	private int strength;
	private int dominanceFactor;
	private int dominanceRank;
	private int level;
	private int impetuosity;


	public Compsognathus() {
	}

	public Compsognathus(String name, boolean sex, double height, double weight, int age, boolean hungry,
						 boolean tired, boolean health, int strength, int dominanceFactor, int dominanceRank, int level, int impetuosity, Pack pack) {
		super(name, sex, height, weight, age, hungry, tired, health);
		this.strength = strength;
		if(this.getAge() <= 2)
			this.catAge = "Jeune";
		else if(this.getAge() <= 10)
			this.catAge = "Adulte";
		else if(this.getAge() >= 11)
			this.catAge = "Vieux";
		this.dominanceFactor = dominanceFactor;
		this.dominanceRank = dominanceRank;
		this.level = level;
		this.impetuosity = impetuosity;
		this.pack = pack;
	}




    public void setHowlStrategy(HowlStrategy howlStrategy) {
        this.howlStrategy = howlStrategy;
    }

    public void howl (){
	    howlStrategy.howl(this);
	    for(Compsognathus compsognathus:pack.getPack()){
	        compsognathus.hear();
        }
    }


    public void hear (){
	    if(this.isTired() == false && this.isHealth() == true){
            System.out.println("Le compsognathus a entendu");
        }
    }

    public void setHeat(boolean heat) {
        this.heat = heat;
    }


    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    @Override
	public void walk() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}

	public void afficherCarac(){
		System.out.println(this.toString());
	}

	public void die(Compsognathus compsognathus){
        System.out.println("Le compsognathus " + compsognathus.getName() + " décide de quitter la meute pour aller mourir");
	    pack.leaveMeute(compsognathus);
    }

    @Override
	public String toString() {
		return "Compsognathus{" +
				"name='" + this.getName() + '\'' +
				"age='" + this.getAge() + '\'' +
				"weight='" + this.getWeight() + '\'' +
				", catAge='" + catAge + '\'' +
				", strength=" + strength +
				", dominanceFactor=" + dominanceFactor +
				", dominanceRank=" + dominanceRank +
				", level=" + level +
				", impetuosity=" + impetuosity +
				'}';

	}
}
