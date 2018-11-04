package creatures.meute.strategy;

import creatures.meute.Compsognathus;

public class AttackHowlStrategy implements HowlStrategy {

    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognatus hurle et est pret a l'attaque");
        compsognathus.setAttack(true);
    }
}
