package creatures;

import typedinosaure.*;
import regimealimentaire.*;

public class Diplodocus extends Herbivorous implements Terrestrial {

    public Diplodocus() {
    }

    public Diplodocus(String name, boolean sex, double height, double weight, int age, boolean hungry,
                        boolean tired, boolean health) {
        super(name, sex, height, weight, age, hungry, tired, health);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Egg layEggs() {
        int i = 1;
        Diplodocus son = new Diplodocus("DiplodocuChild" +i, getRandomBoolean(), 10,10,10, true, true, true);
        i++;
        return new Egg(10, son);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " le " + this.getType().toLowerCase() + " marche");
    }


    public void howl (){
        System.out.println("La créature " + this.getName() + " pousse un cri");
    }

}
