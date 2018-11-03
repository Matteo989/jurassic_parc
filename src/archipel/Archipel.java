package archipel;

import islands.*;
import employees.*;
import creatures.*;
import regimealimentaire.*;
import typedinosaure.*;


import java.util.ArrayList;

public class Archipel<T extends Island> {
    // un archipel est un amas d'îles, îles qui sont nos enclos pour le projet.
    // Une île pour godzilla (peut etre radioactive), une île pour les kaiju,
    // une île pour tous les herbivores,
    // un île pour chaque sorte de carnivores et omnivores,
    // une volière pour les pterodactyl et un bassin pour les dino marins.

    private String name = "Jurassic Park Land";
    private Employee employe = new Employee();
    private int nbIleMax = 20;
    private int nbIleActual = 0;
    private ArrayList<T> islands = new ArrayList<T>();

    public Archipel(String name, Employee employe, int nbIleMax, int nbIleActual, ArrayList<T> islands) {
        this.name = name;
        this.employe = employe;
        this.nbIleMax = nbIleMax;
        this.nbIleActual = nbIleActual;
        this.islands = islands;
    }

    public Archipel() {
    }

    @Override
    public String toString() {
        return "Archipel{" +
                "name='" + name + '\'' +
                ", employee='" + employe + '\'' +
                ", nbIleMax=" + nbIleMax +
                ", nbIleActual=" + nbIleActual +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmploye() {
        return employe;
    }

    public void setEmploye(Employee employe) {
        this.employe = employe;
    }

    public int getNbIleMax() {
        return nbIleMax;
    }

    public void setNbIleMax(int nbIleMax) {
        this.nbIleMax = nbIleMax;
    }

    public int getNbIleActual() {
        for (T myIsland:getIslands()) {
            nbIleActual ++;
        }
        return nbIleActual;
    }

    public void setNbIleActual(int nbIleActual) {
        this.nbIleActual = nbIleActual;
    }

    public ArrayList<T> getIslands() {
        return islands;
    }

    public void setIslands(ArrayList<T> islands) {
        this.islands = islands;
    }

    //    // non fini
//    public void nbAnimals() {
//        int nbAnimals = 0;
//        for(int i = 0; i <= getnbIleActual(); i++)
//        {
//            nbAnimals += getAnimals();
//        }
//    }
//
//    public void nbAnimalsByIsland() {
//        int nbAnimals = 0;
//        for(int i = 0; i <= getnbIleActual(); i++)
//        {
//            System.out.println(island.getName() + " = " + island.getNbAnimals());
//        }
//    }


    public static void main(String[] args) {
        //À intervalle régulier, cette  méthode doit :
        //modifier aléatoirement l’état de certains animaux (les rendre malades, les endormir, etc.)
        //modifier aléatoirement l’état de certains enclos (leur propreté, leur salinité, etc.)
        //passer la main à l'employé (et donc à l’utilisateur) pour qu'il s'occupe du zoo
        // (son namebre d’action par intervalle de temps devant être limité)

        Archipel jurassicIsland = new Archipel();

        Island herbiLand = new HerbivorousIsland("HerbiLand", 100000, 100, 0, "Bon", null);
        Island t_rexLand = new CarnivorousLand("T-rexLand", 10000, 10, 0, "Bon", null);
        Island compsoLand = new CarnivorousLand("CompsoLand", 1000, 150, 0, "Bon", null);
        Island ceratoLand = new CarnivorousLand("CératoLand", 12500, 20, 0, "Bon", null);
        Island veloLand = new CarnivorousLand("VéloLand", 5000, 100, 0, "Bon", null);
        Island pteraLand = new PteraLand("PtéraLand", 10000, 140, 0, "Bon", null, 100);
        Island spinoLand = new SpinoLand("SpinoLand", 1000, 10, 0, "Bon", null, 500);
        Island godzilLand = new KaijuIsland("GodzilLand", 3000, 1, 0, "Bon", null);
        Island kaijuLand = new KaijuIsland("KaijuLand", 10000, 3, 0, "Bon", null);

        jurassicIsland.getIslands().add(herbiLand);
        jurassicIsland.getIslands().add(t_rexLand);
        jurassicIsland.getIslands().add(compsoLand);
        jurassicIsland.getIslands().add(ceratoLand);
        jurassicIsland.getIslands().add(veloLand);
        jurassicIsland.getIslands().add(pteraLand);
        jurassicIsland.getIslands().add(spinoLand);
        jurassicIsland.getIslands().add(godzilLand);
        jurassicIsland.getIslands().add(kaijuLand);


        System.out.println(jurassicIsland.toString());

//        Tyrannosaure Marc = new Tyrannosaure("Marc", true, 500, 10000, 10, true, false, true);
//        System.out.println(Marc.toString());
//        Marc.getDinosaurState();
//        Marc.walk();
//        Marc.eatMeat();
//        Marc.eatMeat();
//        Marc.getDinosaurState();
//
//        Godzilla.getGodzilla();
//        getGodzilla().nager();
//        getGodzilla().walk();
//        System.out.println(getGodzilla().getType()); // return Godzilla
//
//        Diplodocus Neiko = new Diplodocus("Neiko", true, 3, 8, 1, false, true, true);
//        System.out.println(Neiko.toString());
//        Neiko.walk();
//        Neiko.getDinosaurState();
//        Neiko.eatVegetables();
//
//        var transferIsland = TransferIsland.getIleTransfer();
//        System.out.println(transferIsland.toString());
////
//        //Lors du démarrage de l'application demande a l'utilisateur son nom, son sex, son age et définir un employe a partir
//        Employee employee = new Employee();
//
//        employee.cleanIsland(herbiland, transferIsland);
//
//        herbiland.addCreature(Neiko);
//        herbiland.addCreature(Marc);
//        herbiland.addCreature(Neiko);
//
//        herbiland.afficherCaracs();
//
//        Pack meute = new Pack("Meute de petit dinosaures");
//        Compsognathus compsognathus = new Compsognathus("Spot", true, 2, 10, 5, false, false, true, 10, 1, 10, 1, 1, meute);
//        Compsognathus c1 = new Compsognathus("Myrtille", false, 2, 10, 5, false, false, true, 10, 5, 5, 10, 1, meute);
//        meute.addCompsognathusToMeute(compsognathus);
//        meute.addCompsognathusToMeute(c1);
//
//
//        HowlStrategy heatHowlStrategy = new HeatHowlStrategy();
//        compsognathus.setHowlStrategy(heatHowlStrategy);
//        compsognathus.howl();

    }
}
