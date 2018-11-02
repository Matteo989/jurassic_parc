package regimealimentaire;

import creatures.Dinosaur;

public abstract class Carnivorous extends Dinosaur {

    public Carnivorous() {
    }

    public Carnivorous(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired, boolean health) {
        super(name, sex, height, weight, age, hungry, tired, health);
    }

    public void eatMeat() {
        if(!this.isTired() && this.isHungry()) {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " mange de la viande.");
            this.setHungry(false);
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " a bien mangé.");
        } else if (this.isTired()) {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est endormi et ne peut pas manger.");
        } else {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " n'a pas faim.");
        }
    }
}
