package islands;

import creatures.Kaiju;
import regimealimentaire.Herbivorous;
import typedinosaure.Marine;
import typedinosaure.Terrestrial;

import java.util.ArrayList;

public class HerbivorousIsland<T> extends Island<T> {

    public HerbivorousIsland(String name, int area, int animauxMax, int nbAnimaux, String propreté, ArrayList creatures) {
        super(name, area, animauxMax, nbAnimaux, propreté, creatures);
    }

    @Override
    public void addCreature(T creature) {
        if (this.getNbAnimaux() < this.getAnimauxMax()) {
            if (creature instanceof Herbivorous) {
                for (T myCreature : getCreatures()) {
                    if (myCreature == creature) {
                        System.out.println("La créature " + creature + " est deja dans l'enclos");
                        return;
                    }
                }
                this.getCreatures().add(creature);
                this.setNbAnimaux(getNbAnimaux() + 1);
            } else {
                System.out.println(creature.getClass().getSimpleName() + " ne peut pas être ajouté a l'ile");
            }
        } else {
            System.out.println("Le nombre maximum d'animaux à été atteint.");
        }
    }
}
