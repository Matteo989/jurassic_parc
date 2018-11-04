package islands;

import regimealimentaire.Omnivorous;
import typedinosaure.Marine;
import java.util.ArrayList;

public class SpinoLand<T> extends Island<T> {
    public SpinoLand(String name, int area, int animauxMax, int nbAnimaux, String proprete, ArrayList creatures, int depth) {
        super(name, area, animauxMax, nbAnimaux, proprete, creatures);
    }

    @Override
    public void addCreature(T creature) {
        if (getNbAnimaux() < getAnimauxMax()){
            if (creature instanceof Omnivorous && creature instanceof Marine) {
                for(T myCreature:getCreatures()) {
                    if(myCreature == creature) {
                        System.out.println("La creature " + creature + " est deja dans l'enclos");
                        return;
                    }
                }
                this.getCreatures().add(creature);
                this.setNbAnimaux(getNbAnimaux() + 1);
            } else {
                System.out.println(creature.getClass().getSimpleName() + " ne peut pas etre ajoute a l'ile");
            }
        } else {
            System.out.println("Le nombre maximum d'animaux a ete atteint.");
        }
    }
}
