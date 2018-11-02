package islands;

import creatures.Kaiju;
import typedinosaure.Marine;
import typedinosaure.Terrestrial;

import java.util.ArrayList;


public final class HerbivorousIsland extends Island {

    private static volatile HerbivorousIsland herbiland = null; //volatile pour gérer les thread

    public static HerbivorousIsland getHerbiland() {
        if (herbiland == null) {
            herbiland = new HerbivorousIsland();
        }
        return herbiland;
    }

    private HerbivorousIsland() {
        this.setName("Herbiland");
        this.setSuperficie(100000);
        this.setAnimauxMax(100);
        this.setNbAnimaux(0);
        this.setPropreté("Bon");
        this.setCreatures(null);
    }

}
