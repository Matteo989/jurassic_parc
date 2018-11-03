package creatures.meute;

public class HeatHowlStrategy implements HowlStrategy {
    @Override
    public void howl(Compsognathus compsognathus) {
        System.out.println("Le compsognatus hurle et est pret a s'accoupler");
        compsognathus.setHeat(true);
    }
}
