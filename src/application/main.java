package application;

import creatures.Diplodocus;
import creatures.Godzilla;
import creatures.Tyrannosaure;

import static creatures.Godzilla.getGodzilla;

public class main {

    public static void main(String[] args) {
        Tyrannosaure Marc = new Tyrannosaure("Marc", true, 500, 10000, 10, true, false, true);
        System.out.println(Marc.toString());
        Marc.getDinosaurState();
        Marc.walk();
        Marc.eatMeat();
        Marc.eatMeat();
        Marc.getDinosaurState();

        Godzilla.getGodzilla();
        getGodzilla().nager();
        getGodzilla().walk();

        Diplodocus Neiko = new Diplodocus("Neiko", true, 3, 8, 1, false, true, true);
        System.out.println(Neiko.toString());
        Neiko.walk();
        Neiko.getDinosaurState();

    }
}
