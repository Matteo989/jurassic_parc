package creatures.decorator;

import creatures.Kaiju;

public class Thunder extends DecorateurKaiju {

    public Thunder(Kaiju kaiju){
        this.kaiju = kaiju;
    }

    @Override
    public void useSpell() {
        System.out.println("Le kaiju " + this.kaiju.getName() + " fait tomber de la foudre");
    }


    @Override
    public void move() {
        System.out.println("Le kaiju se met en position pour faire tomber de la foudre");
    }

    @Override
    public void howl() {
        System.out.println("Le kaiju fait appel a la puisance des éléments et pousse un hurlement qui fait trembler la terre");
    }
}
