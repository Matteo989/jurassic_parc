package regimealimentaire;

import creatures.Dinosaur;

public abstract class Omnivorous extends Dinosaur {

    public Omnivorous() {
    }

    public Omnivorous(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired, boolean health) {
        super(name, sex, height, weight, age, hungry, tired, health);
    }

    public void eatEverything() {
        if(!this.tired && this.isHungry()) {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange de tout.");
            this.setHungry(false);
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé.");
            this.setTired(true);
        } else if (this.tired) {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi.");
        } else {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim.");
        }
    }
}
