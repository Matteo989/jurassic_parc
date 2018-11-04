/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures.meute.strategy;

import creatures.meute.Compsognathus;

public class DominanceHowlStrategy implements HowlStrategy {

    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognatus exprime sa dominance");
    }
}
