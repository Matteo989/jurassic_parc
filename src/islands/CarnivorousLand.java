package islands;

import regimealimentaire.Carnivorous;
import regimealimentaire.Herbivorous;

import java.util.ArrayList;

public class CarnivorousLand<T> extends Island<T> {
    public CarnivorousLand(String name, int area, int animauxMax, int nbAnimaux, String proprete, ArrayList creatures) {
        super(name, area, animauxMax, nbAnimaux, proprete, creatures);
    }

    @Override
    public void addCreature(T creature) {
        if (this.getNbAnimaux() < this.getAnimauxMax()) {
            if (creature instanceof Carnivorous) {
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
