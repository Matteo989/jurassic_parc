package islands;

import creatures.Kaiju;

import java.util.ArrayList;

public class KaijuIsland<T> extends Island<T> {

    public KaijuIsland(String name, int area, int animauxMax, int nbAnimaux, String propreté, ArrayList creatures) {
        super(name, area, animauxMax, nbAnimaux, propreté, creatures);
    }

    @Override
    public void addCreature(T creature) {
        if (creature instanceof Kaiju) {
            this.getCreatures().add(creature);
        } else {
            System.out.println(creature.toString() + "ne peut pas être ajouté a l'ile");
        }
    }
}

