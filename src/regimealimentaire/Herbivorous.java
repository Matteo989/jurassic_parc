package regimealimentaire;

import creatures.Dinosaur;

public abstract class Herbivorous extends Dinosaur {

    public Herbivorous() {
    }

    public Herbivorous(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired, boolean health) {
        super(name, sex, height, weight, age, hungry, tired, health);
    }

    public void eatVegetables() {
        if(!this.tired && this.isHungry()) {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de l'herbe (et je ne parle pas de cannabis mdr).");
            this.setHungry(false);
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé.");
        } else if (this.tired) {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi et ne peut pas manger.");
        } else {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim.");
        }
    }
}
