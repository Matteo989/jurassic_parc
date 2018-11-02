package islands;

import java.util.ArrayList;

public class HerbivorousIsland<Herbivorous> extends Island{

    public HerbivorousIsland() {
    }

    public HerbivorousIsland(String nom, int superficie, int animauxMax, int nbAnimaux, String propreté, ArrayList creatures) {
        super(nom, superficie, animauxMax, nbAnimaux, propreté, creatures);
    }
}
