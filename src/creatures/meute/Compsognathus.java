package creatures.meute;
import creatures.Egg;
import creatures.meute.strategy.BasicHowlStrategy;
import creatures.meute.strategy.DominanceHowlStrategy;
import creatures.meute.strategy.HeatHowlStrategy;
import creatures.meute.strategy.HowlStrategy;
import typedinosaure.*;
import regimealimentaire.*;

public class Compsognathus extends Carnivorous implements Terrestrial {



    private HowlStrategy howlStrategy;
    private Pack pack;
    private boolean heat;
    private boolean attack;
	private String catAge; //Jeune, Adulte, Vieux
	private int strength;
	private int dominanceFactor;
	private char dominanceRank;
	private int level;
	private int impetuosity;


	public Compsognathus() {
	}

	public Compsognathus(String name, boolean sex, double height, double weight, int age, boolean hungry,
						 boolean tired, boolean health, int strength, int dominanceFactor, char dominanceRank, int level, int impetuosity, Pack pack, HowlStrategy howlStrategy) {
		super(name, sex, height, weight, age, hungry, tired, health);
		this.strength = strength;
		int ascii = (int) dominanceFactor;
		this.dominanceFactor = dominanceFactor;
		this.impetuosity = impetuosity;
		this.pack = pack;
		this.dominanceRank = dominanceRank;
		this.howlStrategy = howlStrategy;
		calculateDominanceRank();
		calculateLevel();
		calculateCategorie();

	}

	public void calculateDominanceRank(){
		boolean bool = true;
		for(Compsognathus compsognathus:pack.getPack()){
			if (this.strength > compsognathus.strength){
				if((int) this.dominanceRank < (int) compsognathus.dominanceRank) {
					char tmp = this.dominanceRank;
					this.dominanceRank = compsognathus.dominanceRank;
					compsognathus.dominanceRank = tmp;
				}
				bool = true;
			}else
				bool = false;
		}
		if(bool == true){
			this.dominanceRank = 'a';
		}
	}
	public void calculateCategorie(){
		if(this.getAge() <= 2)
			this.catAge = "Jeune";
		else if(this.getAge() <= 10)
			this.catAge = "Adulte";
		else if(this.getAge() >= 11)
			this.catAge = "Vieux";
	}

	public void calculateLevel(){
		int asciiCode = (int)dominanceRank;
		if(this.catAge == "Jeune" || this.catAge == "Vieux") {
			this.level = (impetuosity * 10 - asciiCode + 5 * dominanceFactor) / 2;
		} else
			this.level = impetuosity * 10 - asciiCode + 5 * dominanceFactor;
		if(this.level < 0)
			this.level = 0;
	}


	@Override
	public Egg layEggs() {
		int i = 1;
		BasicHowlStrategy basicHowl = new BasicHowlStrategy();
		Compsognathus son = new Compsognathus("CompsognathusChild" +1 , getRandomBoolean(), 10,10,10, true, true, true,10,10,'w',10,10,this.pack, basicHowl);
		i++;
		return new Egg(10, son);

	}


	public HowlStrategy getHowlStrategy() {
		return howlStrategy;
	}

	public void setHowlStrategy(HowlStrategy howlStrategy){
		this.howlStrategy = howlStrategy;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public boolean isHeat() {
		return heat;
	}

	public boolean isAttack() {
		return attack;
	}

	public String getCatAge() {
		return catAge;
	}

	public void setCatAge(String catAge) {
		this.catAge = catAge;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDominanceFactor() {
		return dominanceFactor;
	}

	public void setDominanceFactor(int dominanceFactor) {
		this.dominanceFactor = dominanceFactor;
	}

	public char getDominanceRank() {
		return dominanceRank;
	}

	public void setDominanceRank(char dominanceRank) {
		this.dominanceRank = dominanceRank;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getImpetuosity() {
		return impetuosity;
	}

	public void setImpetuosity(int impetuosity) {
		this.impetuosity = impetuosity;
	}



    public void howl (){
		Egg egg;
	    howlStrategy.howl(this);
	    for(Compsognathus compsognathus:pack.getPack()){
	        compsognathus.hear();
			if((howlStrategy instanceof HeatHowlStrategy && this.heat == true && this.isSex() == false && compsognathus.isSex() == true) ||
					(howlStrategy instanceof HeatHowlStrategy && this.heat == true && this.isSex() == true && compsognathus.isSex() == false)){
				System.out.println("Le compsognathus " + compsognathus.getName() + " s'accouple avec le compsognathus " + this.getName() + " en chaleur");
				if(this.isSex() == false) {
					System.out.println("La compsognathus + " + this.getName() + " + fait un oeuf");
					egg = this.layEggs();
					egg.hatch();
				}
				else{
					System.out.println("La compsognathus + " + this.getName() + " + fait un oeuf");
					egg = compsognathus.layEggs();
					egg.hatch();
				}
				compsognathus.setHeat(false);
				this.setHeat(false);
			}
			else if(howlStrategy instanceof DominanceHowlStrategy){
				System.out.println("Tout les loups de la meute attaquent ensemble");
			}
        }
    }

	public void submission(){
		this.dominanceFactor -= 1;
	}

	public void dominate(Compsognathus compsognathus){
		if(this.impetuosity >= compsognathus.impetuosity){
			if(this.level > compsognathus.level){
				//Le compsognathus se soummet
				this.dominanceFactor += 1;  //on incrémente le facteur de domination
				char tampon = compsognathus.dominanceRank; //on échange les rangs de domination
				compsognathus.dominanceRank = this.dominanceRank;
				this.dominanceRank = tampon;
				compsognathus.submission();
				compsognathus.calculateLevel();
				this.calculateLevel();
			}
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
	public void move() {
		System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
	}

	public void printCarac(){
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
