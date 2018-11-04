/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package islands;

import creatures.Kaiju;

import java.util.ArrayList;

public class KaijuIsland<T> extends Island<T> {

    public KaijuIsland(String name, int area, int animauxMax, int nbAnimaux, String proprete, ArrayList creatures) {
        super(name, area, animauxMax, nbAnimaux, proprete, creatures);
    }

    @Override
    public void addCreature(T creature) {
        if (this.getNbAnimaux() < this.getAnimauxMax()) {
            if (creature instanceof Kaiju) {
                this.getCreatures().add(creature);
                this.setNbAnimaux(getNbAnimaux() + 1);
            } else {
                System.out.println(creature.toString() + "ne peut pas etre ajoute a l'ile");
            }
        } else {
            System.out.println("Le nombre maximum d'animaux a ete atteint.");
        }
    }

}

