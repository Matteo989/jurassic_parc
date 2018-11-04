package creatures.decorator;

import creatures.Kaiju;

public class BlindingFlash extends DecorateurKaiju {

    public BlindingFlash(Kaiju kaiju){
        this.kaiju = kaiju;
    }

    @Override
    public void useSpell() {
        System.out.println("Le kaiju " + this.kaiju.getName() + " emmet une lumiere aveuglante");
    }



    @Override
    public void move() {
        System.out.println("Le kaiju se met en position pour utiliser son attaque speciale");
    }

    @Override
    public void howl() {
        System.out.println("Le kaiju se prepare a utiliser son rayon lumineux et pousse un hurlement qui fait trembler la terre");
    }
}
