package creatures.decorator;

import creatures.Kaiju;

public class FireBlast extends DecorateurKaiju {

    public FireBlast(Kaiju kaiju){
        this.kaiju = kaiju;
    }

    @Override
    public void useSpell() {
        System.out.println("Le kaiju " + this.kaiju.getName() + " crache un souffle de feu");
    }

    @Override
    public void move() {
        System.out.println("Le kaiju se met en position pour envoyer son souffle de feu");
    }

    @Override
    public void howl() {
        System.out.println("Le kaiju se prépare a envoyer un souffle de feu et pousse un hurlement qui fait trembler la terre");
    }
}
