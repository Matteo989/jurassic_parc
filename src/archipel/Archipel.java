package archipel;

import creatures.meute.Compsognathus;
import islands.*;
import employees.*;
import creatures.*;
import regimealimentaire.*;
import typedinosaure.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Archipel<T extends Island> {
    // un archipel est un amas d'îles, îles qui sont nos enclos pour le projet.
    // Une île pour godzilla (peut etre radioactive), une île pour les kaiju,
    // une île pour tous les herbivores,
    // un île pour chaque sorte de carnivores et omnivores,
    // une volière pour les pterodactyl et un bassin pour les dino marins.

    private String name;
    private Employee employe;
    private int nbIleMax;
    private int nbIleActual;
    private ArrayList<T> islands;

    public Archipel(String name, Employee employe, int nbIleMax, int nbIleActual, ArrayList<T> islands) {
        this.name = name;
        this.employe = employe;
        this.nbIleMax = nbIleMax;
        this.nbIleActual = nbIleActual;
        this.islands = islands;
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

    public void addIsland(T island) {
        if (island instanceof Island) {
            this.getIslands().add(island);
            this.setNbIleActual(getNbIleActual() + 1);
        } else {
            System.out.println(island.getClass().getSimpleName() + " n'est pas une île");
        }
    }

    public void afficherInfos(){
        System.out.println(this.toString());
        for (T iles : islands) {
            System.out.println(iles.toString());
        }
    }

    public String getNbAnimals() {
        int nbAnimals = 0;
        for(T island:islands)
        {
            nbAnimals += island.getNbAnimaux();
        }
        return "Il y a actuellement " + nbAnimals + " créatures dans le Jurassic Park.";
    }

    public int getNbAnimals(int i) {
        int nbAnimals = 0;
        for(T island:islands)
        {
            nbAnimals += island.getNbAnimaux();
        }
        return nbAnimals;
    }
//
//    public void nbAnimalsByIsland() {
//        int nbAnimals = 0;
//        for(int i = 0; i <= getnbIleActual(); i++)
//        {
//            System.out.println(island.getName() + " = " + island.getNbAnimals());
//        }
//    }

    public Creature getRandomCreature() {
        Island ileRandom = this.getRandomIsland();
        int creatureAleatoire = (int) (Math.random() * ileRandom.getNbAnimaux());
        Creature creatureRandom = (Creature) ileRandom.getCreatures().get(creatureAleatoire);

        return creatureRandom;
    }

    public Island getRandomIsland() {
        int ileAleatoire = (int) (Math.random() * this.getNbIleActual()-1);
        Island ileRandom = this.getIslands().get(ileAleatoire);

        return ileRandom;
    }

    public void getOldAllCreature(){
        for (T island:islands){
            island.getOldCreatures();
        }
    }

    public static void main(String[] args) {
        //À intervalle régulier, cette  méthode doit :
        //modifier aléatoirement l’état de certains animaux (les rendre malades, les endormir, etc.)
        //modifier aléatoirement l’état de certains enclos (leur propreté, leur salinité, etc.)
        //passer la main à l'employé (et donc à l’utilisateur) pour qu'il s'occupe du zoo
        // (son namebre d’action par intervalle de temps devant être limité)



        //Lors du démarrage de l'application demande a l'utilisateur son nom
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez votre nom => ");
        String employee_name = in.next();
        while (!(employee_name instanceof String)) {
            System.out.println("Veuillez écrire votre nom => ");
            employee_name = in.next();
        }

        // son sexe
        System.out.println("Êtes-vous un homme (M) ou une femme (F) => ");
        char employee_gender = Character.toLowerCase(in.next().charAt(0));
        while (employee_gender != 'm' && employee_gender != 'f') {
            System.out.println("Veuillez répondre par M ou F => ");
            employee_gender = in.next().charAt(0);
        }

        // son age
        System.out.println("Entrez votre age => ");
        int employee_age = in.nextInt();
        while (!(employee_age>0 && employee_age<100)) {
            System.out.println("Donnez un âge entre 0 et 100 => ");
            employee_age = in.nextInt();
        }

        // on défini un employé à partir de ces infos
        Employee employe_jurassic = new Employee(employee_name, employee_gender, employee_age);

        //Création du zoo (archipel)
        Archipel jurassicIsland = new Archipel("Jurassic Park Land", employe_jurassic, 20, 0, new ArrayList<Island>());

        //Création de toutes nos îles
        Island herbiLand = new HerbivorousIsland("HerbiLand", 100000, 100, 0, "Bon", null);
        Island t_rexLand = new CarnivorousLand("T-rexLand", 10000, 10, 0, "Bon", null);
        Island compsoLand = new CarnivorousLand("CompsoLand", 1000, 150, 0, "Bon", null);
        Island ceratoLand = new CarnivorousLand("CératoLand", 12500, 20, 0, "Bon", null);
        Island veloLand = new CarnivorousLand("VéloLand", 5000, 100, 0, "Bon", null);
        Island pteraLand = new PteraLand("PtéraLand", 10000, 140, 0, "Bon", null, 100);
        Island spinoLand = new SpinoLand("SpinoLand", 1000, 10, 0, "Bon", null, 500);
        Island godzilLand = new KaijuIsland("GodzilLand", 3000, 1, 0, "Bon", null);
        Island kaijuLand = new KaijuIsland("KaijuLand", 10000, 3, 0, "Bon", null);
        var transferIsland = TransferIsland.getIleTransfer();

        //Ajout des îles dans l'archipel
        jurassicIsland.addIsland(herbiLand);
        jurassicIsland.addIsland(t_rexLand);
        jurassicIsland.addIsland(compsoLand);
        jurassicIsland.addIsland(ceratoLand);
        jurassicIsland.addIsland(veloLand);
        jurassicIsland.addIsland(pteraLand);
        jurassicIsland.addIsland(spinoLand);
        jurassicIsland.addIsland(godzilLand);
        jurassicIsland.addIsland(kaijuLand);
        jurassicIsland.addIsland(transferIsland);

        System.out.println("Bonjour " + employe_jurassic.getName() + ", bienvenue dans le Jurassic Park Land." );

        //On créé deux dinosaures de chaque espèces. Puis un seul kaiju de chaque et un Godzilla.
        Ankylosaure AnkyMale = new Ankylosaure("AnkyMale", true, 250, 6000, 8, false, false, true);
        Ankylosaure AnkyFemale = new Ankylosaure("AnkyFemale", false, 230, 5600, 9, false, false, true);
        herbiLand.addCreature(AnkyMale);
        herbiLand.addCreature(AnkyFemale);
        Brachiosaure BrachioMale = new Brachiosaure("BrachioMale", true, 1200, 55000, 12, false, false, true);
        Brachiosaure BrachioFemale = new Brachiosaure("BrachioFemale", false, 1350, 60000, 11, false, false, true);
        herbiLand.addCreature(BrachioMale);
        herbiLand.addCreature(BrachioFemale);
        Compsognathus CompsoMale = new Compsognathus("CompsoMale", true, 25, 2, 5, false, false, true, 10, 10, 10, 10, 10, null);
        Compsognathus CompsoFemale = new Compsognathus("CompsoFemale", false, 25, 2, 4, false, false, true, 10, 10, 10, 10, 10, null);
        compsoLand.addCreature(CompsoMale);
        compsoLand.addCreature(CompsoFemale);
        Corythosaure CoryMale = new Corythosaure("CoryMale", true, 150, 4000, 5, false, false, true);
        Corythosaure CoryFemale = new Corythosaure("CoryFemale", false, 130, 3500, 4, false, false, true);
        herbiLand.addCreature(CoryMale);
        herbiLand.addCreature(CoryFemale);
        Cératosaure CeraMale = new Cératosaure("CeraMale", true, 250, 900, 8, true, false, true);
        Cératosaure CeraFemale = new Cératosaure("CeraFemale", false, 230, 800, 9, true, false, true);
        ceratoLand.addCreature(CeraMale);
        ceratoLand.addCreature(CeraFemale);
        Diplodocus DiploMale = new Diplodocus("DiploMale", true, 400, 20000, 7, false, false, true);
        Diplodocus DiploFemale = new Diplodocus("DiploFemale", false, 380, 18000, 6, false, false, true);
        herbiLand.addCreature(DiploMale);
        herbiLand.addCreature(DiploFemale);
        Parasaurolophus ParaMale = new Parasaurolophus("ParaMale", true, 580, 1600, 5, false, false, true);
        Parasaurolophus ParaFemale = new Parasaurolophus("ParaFemale", false, 600, 2000, 7, false, false, true);
        herbiLand.addCreature(ParaMale);
        herbiLand.addCreature(ParaFemale);

        //a gerer l'envergure d'un ptéranodon au lieu de la hauteur / taille

        Ptéranodon PteraMale = new Ptéranodon("PteraMale", true, 150, 4000, 5, false, false, true);
        Ptéranodon PteraFemale = new Ptéranodon("PteraFemale", false, 130, 3500, 4, false, false, true);
        pteraLand.addCreature(PteraMale);
        pteraLand.addCreature(PteraFemale);
        Spinosaure SpinoMale = new Spinosaure("SpinoMale", true, 380, 5800, 5, false, false, true);
        Spinosaure SpinoFemale = new Spinosaure("SpinoFemale", false, 400, 6000, 6, false, false, true);
        spinoLand.addCreature(SpinoMale);
        spinoLand.addCreature(SpinoFemale);
        Stégosaure StegoMale = new Stégosaure("StegoMale", true, 350, 2000, 8, false, false, true);
        Stégosaure StegoFemale = new Stégosaure("StegoFemale", false, 360, 2200, 9, false, false, true);
        herbiLand.addCreature(StegoMale);
        herbiLand.addCreature(StegoFemale);
        Tricératops TriceMale = new Tricératops("TriceMale", true, 320, 6500, 7, false, false, true);
        Tricératops TriceFemale = new Tricératops("TriceFemale", false, 300, 6200, 6, false, false, true);
        herbiLand.addCreature(TriceMale);
        herbiLand.addCreature(TriceFemale);
        Tyrannosaure TyraMale = new Tyrannosaure("TyraMale", true, 500, 10000, 10, true, false, true);
        Tyrannosaure TyraFemale = new Tyrannosaure("TyraFemale", false, 540, 12000, 8, true, false, true);
        t_rexLand.addCreature(TyraMale);
        t_rexLand.addCreature(TyraFemale);
        Vélociraptor VeloMale = new Vélociraptor("VeloMale", true, 125, 15, 6, true, false, true);
        Vélociraptor VeloFemale = new Vélociraptor("VeloFemale", false, 125, 14, 5, true, false, true);
        veloLand.addCreature(VeloMale);
        veloLand.addCreature(VeloFemale);

        godzilLand.addCreature(Godzilla.getGodzilla());
        kaijuLand.addCreature(Ghidorah.getGhidorah());
        kaijuLand.addCreature(Mithra.getMithra());
        kaijuLand.addCreature(Rodan.getRodan());

        //Pour afficher le nombre d'animaux.
        System.out.println(jurassicIsland.getNbAnimals());

        //Pour afficher le toString de tout l'archipel et le detail de chaque île.
        //jurassicIsland.afficherInfos();

        int i = 0;
        int lower = 0;
        int higher = 100;
        while (i != 100) {
            Creature laBete = null;
            Island ileAnettoyer = null;
            char response = ' ';
            int random = (int)(Math.random() * (higher-lower)) + lower;
            System.out.println(i);
            if (random == 0) {
                System.out.println("Une énorme météorite explose sur l'île principale de Jurassic Park Land détruisant tous les animaux.");
                return;
            } else if (random <= 15){
                System.out.println("Un animal se déplace.");
            } else if (random <= 30) {
                System.out.println("Un animal crie");
            } else if (random <= 50) {
                laBete = jurassicIsland.getRandomCreature();
                laBete.setHungry(true);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " a faim.");
                System.out.println("Voulez-vous le nourrir ? O / N => ");
                response = Character.toLowerCase(in.next().charAt(0));
                while (response != 'o' && response != 'n') {
                    System.out.println("Veuillez répondre par O ou N => ");
                    response = in.next().charAt(0);
                }
                if (response == 'o') {
                    employe_jurassic.feedAnimals(laBete);
                }
            } else if (random <= 60) {
                laBete = jurassicIsland.getRandomCreature();
                laBete.setHealth(false);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " est malade.");
                System.out.println("Voulez-vous le soigner ? O / N => ");
                response = Character.toLowerCase(in.next().charAt(0));
                while (response != 'o' && response != 'n') {
                    System.out.println("Veuillez répondre par O ou N => ");
                    response = in.next().charAt(0);
                }
                if (response == 'o') {
                    employe_jurassic.healAnimals(laBete);
                }
            } else if (random <= 65) {
                laBete = jurassicIsland.getRandomCreature();
                laBete.setTired(true);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " s'endort.");
            } else if (random <= 70) {
                laBete = jurassicIsland.getRandomCreature();
                laBete.setTired(false);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " se réveille");
            } else if (random <= 80) {
                ileAnettoyer = jurassicIsland.getRandomIsland();
                ileAnettoyer.setPropreté("Mauvais");
                System.out.println(ileAnettoyer.getName() + " est sale/abîmé");
            } else if (random <= 90) {
                laBete = jurassicIsland.getRandomCreature();
                if (laBete.isSex() == false) {
                    System.out.println("La femelle " + laBete.getName() + " attend un bébé.");
                }
            } else if (random <= 94) {
                Godzilla.getGodzilla().walk();
            } else if (random <= 99) {
                System.out.println("Un kaiju  se déplace");
            } else {
                System.out.println("La purge : Godzilla et les kaijus se battent et font exploser tout le Jurassic Park Land");
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
//        Marc.getDinosaurState();
//        Marc.walk();
//        Marc.eatMeat();
//        Marc.eatMeat();
//        Marc.getDinosaurState();

//        getGodzilla().nager();
//        getGodzilla().walk();
//        System.out.println(getGodzilla().getType()); // return Godzilla

//        Neiko.walk();
//        Neiko.getDinosaurState();
//        Neiko.eatVegetables();

//        employee.cleanIsland(herbiland, transferIsland);

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
