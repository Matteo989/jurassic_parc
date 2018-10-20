package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public abstract class Dinosaur extends Creatures {

    public Dinosaur() {
    }

    public Dinosaur(String name, boolean sex, double height, double weight, int age, boolean angry, boolean tired,
                    boolean health) {
        super();
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.angry = angry;
        this.tired = tired;
        this.health = health;
    }

    public void makeNoise() {
        System.out.println("WHEN I SAY ANGER, YOU SAY FIST, ANGER FIST, ANGER FIST !");
    }

    public void getDinosaurState() {
        if (this.isAngry()) {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " a faim.");
        } else {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " n'a pas faim.");
        }

        if (this.isHealth()) {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est en bonne santé.");
        } else {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est malade.");
        }

        if (this.isTired()) {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " est fatigué.");
        } else {
            System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " n'est pas fatigué.");
        }
    }
}
