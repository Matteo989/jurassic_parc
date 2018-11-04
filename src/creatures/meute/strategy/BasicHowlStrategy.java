package creatures.meute.strategy;

import creatures.meute.Compsognathus;

public class BasicHowlStrategy implements HowlStrategy {
    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognatus hurle");
        System.out.println(compsognathus.toString());
    }
}
