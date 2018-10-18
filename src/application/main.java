package application;

import creatures.Tyrannosaure;

public class main {

    public static void main(String[] args) {
        Tyrannosaure Marc = new Tyrannosaure("Marc", true, 500, 10000, 10, true, false, true);
        Marc.walk();
        Marc.eatMeat();
        Marc.eatMeat();
        Marc.getDinosaurState();

    }
}
