package creatures.meute.strategy;

import creatures.meute.Compsognathus;

public class AgressivHowlStrategy implements HowlStrategy {
    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognathus exprime son agressivité");
    }
}
