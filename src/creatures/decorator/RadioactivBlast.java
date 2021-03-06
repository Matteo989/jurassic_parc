/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures.decorator;

import creatures.Kaiju;

public class RadioactivBlast extends DecorateurKaiju {

    public RadioactivBlast(Kaiju kaiju) {
        this.kaiju = kaiju;
    }

    @Override
    public void useSpell() {
        System.out.println("Le kaiju " + this.kaiju.getName() + " crache un souffle radioactif");
    }

    @Override
    public void move() {
        System.out.println("Le kaiju se met en position pour envoyer son souffle");
    }

    @Override
    public void howl() {
        System.out.println("Le kaiju se prepare a utiliser son rayon et pousse un hurlement qui fait trembler la terre");
    }
}
