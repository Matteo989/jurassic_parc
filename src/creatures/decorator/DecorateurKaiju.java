/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures.decorator;

import creatures.Egg;
import creatures.Kaiju;

public abstract class DecorateurKaiju extends Kaiju {

    protected Kaiju kaiju;
    public abstract void useSpell();

    @Override
    public Egg layEggs() {
        return null;
    }
}
