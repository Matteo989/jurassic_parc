package creatures.meute.strategy;

import creatures.meute.Compsognathus;

public class DominanceHowlStrategy implements HowlStrategy {

    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognatus exprime sa dominance");
    }
}
