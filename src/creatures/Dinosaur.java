package creatures;

public abstract class Dinosaur extends Creature {

    public Dinosaur() {
    }

    public Dinosaur(String name, boolean sex, double height, double weight, int age, boolean hungry, boolean tired, boolean health) {
        super(name, sex, height, weight, age, hungry, tired, health);
    }

    public void makeNoise() {
        System.out.println("WHEN I SAY ANGER, YOU SAY FIST, ANGER FIST, ANGER FIST !");
    }

    public void getDinosaurState() {
        if (this.isHungry()) {
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
