/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures.meute.strategy;

import creatures.meute.Compsognathus;

public class AgressivHowlStrategy implements HowlStrategy {
    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognathus exprime son agressivite");
    }
}
