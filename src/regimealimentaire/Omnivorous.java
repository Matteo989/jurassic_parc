package regimealimentaire;

import creatures.Dinosaur;

public abstract class Omnivorous extends Dinosaur {

    public Omnivorous() {
    }

    public Omnivorous(String name, boolean sex, double height, double weight, int age, boolean angry, boolean tired, boolean health) {
        super(name, sex, height, weight, age, angry, tired, health);
    }

    public void eatEverything() {
        if(!this.tired && this.isAngry()) {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " mange du poisson et de la viande.");
            this.setAngry(false);
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " a bien mangé.");
            this.setTired(true);
        } else if (this.tired) {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " est endormi.");
        } else {
            System.out.println(this.name + " le " + this.getType().toLowerCase() + " n'a pas faim.");
        }
    }
}
