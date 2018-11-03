package creatures.meute;

public class BasicHowl implements HowlStrategy {
    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognatus hurle");
    }
}
