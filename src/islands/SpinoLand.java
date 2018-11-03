package islands;

import regimealimentaire.Omnivorous;
import typedinosaure.Marine;
import java.util.ArrayList;

public class SpinoLand<T> extends Island<T> {
    public SpinoLand(String name, int area, int animauxMax, int nbAnimaux, String propreté, ArrayList creatures, int depth) {
        super(name, area, animauxMax, nbAnimaux, propreté, creatures);
    }

    @Override
    public void addCreature(T creature) {
        if (creature instanceof Omnivorous && creature instanceof Marine) {
            for(T myCreature:getCreatures()) {
                if(myCreature == creature) {
                    System.out.println("La créature " + creature + " est deja dans l'enclos");
                    return;
                }
            }
            this.getCreatures().add(creature);
            this.setNbAnimaux(getNbAnimaux() + 1);
        } else {
            System.out.println(creature.getClass().getSimpleName() + " ne peut pas être ajouté a l'ile");
        }
    }
}
