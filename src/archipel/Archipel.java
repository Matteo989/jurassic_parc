/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package archipel;

import creatures.meute.Compsognathus;
import creatures.meute.Pack;
import creatures.meute.strategy.*;
import islands.*;
import employees.*;
import creatures.*;
import regimealimentaire.*;


import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Archipel<T extends Island> {
    // un archipel est un amas d'iles, iles qui sont nos enclos pour le projet.
    // Une ile pour godzilla (peut etre radioactive), une ile pour les kaiju,
    // une ile pour tous les herbivores,
    // un ile pour chaque sorte de carnivores et omnivores,
    // une voliere pour les pterodactyl et un bassin pour les dino marins.

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

    /**
     * ajoute une ile a l'archipel ou renvoie un message d'erreur
     *  @param island
     */
    public void addIsland(T island) {
        if (island instanceof Island) {
            this.getIslands().add(island);
            this.setNbIleActual(getNbIleActual() + 1);
        } else {
            System.out.println(island.getClass().getSimpleName() + " n'est pas une ile");
        }
    }

    /**
     * affiche les informations sur les iles de l'archipel
     */
    public void afficherInfos(){
        System.out.println(this.toString());
        for (T iles : islands) {
            System.out.println(iles.toString());
        }
    }
    /**
     * Renvoie le nombre d'animaux au total dans l'archipel
     * @return String dans laquelle il y a le nombre d'animaux
     */
    public String getNbAnimals() {
        int nbAnimals = 0;
        for(T island:islands)
        {
            nbAnimals += island.getNbAnimaux();
        }
        return "Il y a actuellement " + nbAnimals + " creatures dans le Jurassic Park.";
    }

//
//    public void nbAnimalsByIsland() {
//        int nbAnimals = 0;
//        for(int i = 0; i <= getnbIleActual(); i++)
//        {
//            System.out.println(island.getName() + " = " + island.getNbAnimals());
//        }
//    }

    /**
     * renvoie une créature au hasard de notre archipel
     *  @return creatureRandom
     */
    public Creature getRandomCreature() {
        Island ileRandom = this.getRandomIsland();
        int creatureAleatoire = (int) (Math.random() * ileRandom.getNbAnimaux());
        Creature creatureRandom = (Creature) ileRandom.getCreatures().get(creatureAleatoire);

        return creatureRandom;
    }

    /**
     *  renvoie une ile au hasard parmis toutes les iles de l'archipel
     *  @return Island
     */
    public Island getRandomIsland() {
        int ileAleatoire = (int) (Math.random() * this.getNbIleActual()-1);
        Island ileRandom = this.getIslands().get(ileAleatoire);

        return ileRandom;
    }

    /**
     * fait vieillir toutes les créatures d'un an
     */
    public void getOldAllCreature(){
        for (T island:islands){
            island.getOldCreatures();
        }
    }

    /**
     * fonction main
     * @param args
     */
    public static void main(String[] args) {
        //À intervalle regulier, cette  methode doit :
        //modifier aleatoirement l’etat de certains animaux (les rendre malades, les endormir, etc.)
        //modifier aleatoirement l’etat de certains enclos (leur proprete, leur salinite, etc.)
        //passer la main a l'employe (et donc a l’utilisateur) pour qu'il s'occupe du zoo
        // (son namebre d’action par intervalle de temps devant etre limite)



        //Lors du demarrage de l'application demande a l'utilisateur son nom
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez votre nom => ");
        String employee_name = in.next();
        while (!(employee_name instanceof String)) {
            System.out.println("Veuillez ecrire votre nom => ");
            employee_name = in.next();
        }

        // son sexe
        System.out.println("Êtes-vous un homme (M) ou une femme (F) => ");
        char employee_gender = toLowerCase(in.next().charAt(0));
        while (employee_gender != 'm' && employee_gender != 'f') {
            System.out.println("Veuillez repondre par M ou F => ");
            employee_gender = in.next().charAt(0);
        }

        // son age

        System.out.println("Entrez votre age => ");
        int employee_age = in.nextInt();
        while (!(employee_age>0 && employee_age<100)) {
            System.out.println("Donnez un âge entre 0 et 100 => ");
            employee_age = in.nextInt();
        }

        // on defini un employe a partir de ces infos
        Employee employe_jurassic = new Employee(employee_name, employee_gender, employee_age);

        //Creation du zoo (archipel)
        Archipel jurassicIsland = new Archipel("Jurassic Park Land", employe_jurassic, 20, 0, new ArrayList<Island>());

        //Creation de toutes nos iles
        Island herbiLand = new HerbivorousIsland("HerbiLand", 100000, 100, 0, "Bon", null);
        Island t_rexLand = new CarnivorousLand("T-rexLand", 10000, 10, 0, "Bon", null);
        Island compsoLand = new CarnivorousLand("CompsoLand", 1000, 150, 0, "Bon", null);
        Island ceratoLand = new CarnivorousLand("CeratoLand", 12500, 20, 0, "Bon", null);
        Island veloLand = new CarnivorousLand("VeloLand", 5000, 100, 0, "Bon", null);
        Island pteraLand = new PteraLand("PteraLand", 10000, 140, 0, "Bon", null, 100);
        Island spinoLand = new SpinoLand("SpinoLand", 1000, 10, 0, "Bon", null, 500);
        Island godzilLand = new KaijuIsland("GodzilLand", 3000, 1, 0, "Bon", null);
        Island kaijuLand = new KaijuIsland("KaijuLand", 10000, 3, 0, "Bon", null);
        TransferIsland transferIsland = TransferIsland.getIleTransfer();

        //Ajout des iles dans l'archipel
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

        System.out.println("Bonjour " + employe_jurassic.getName() + ", bienvenue dans le Jurassic Park Land.\n" +
                "Vous etes l'employe d'un Zoo d'un nouveau genre, ici pas d'animaux communs mais bel et bien des dinosaures comme au bon vieux temps.\n" +
                "Mais en plus de ces dinosaures, nous avons decides d'heberger egalement des Kaiju et leur copain Godzilla.\n" +
                "Tout au long de votre contrat, des actions vous seront propose, mais vous ne disposez que de 10 actions avant de pouvoir vous reposer.\n" +
                "En effet, s'occuper de dinosaures et plus laborieux que des animaux classiques. \nFaites les bons choix.");

        //On cree deux dinosaures de chaque especes. Puis un seul kaiju de chaque et un Godzilla.
        Ankylosaure AnkyMale = new Ankylosaure("AnkyMale", true, 250, 6000, 8, false, false, true);
        Ankylosaure AnkyFemale = new Ankylosaure("AnkyFemale", false, 230, 5600, 9, false, false, true);
        herbiLand.addCreature(AnkyMale);
        herbiLand.addCreature(AnkyFemale);
        Brachiosaure BrachioMale = new Brachiosaure("BrachioMale", true, 1200, 55000, 12, false, false, true);
        Brachiosaure BrachioFemale = new Brachiosaure("BrachioFemale", false, 1350, 60000, 11, false, false, true);
        herbiLand.addCreature(BrachioMale);
        herbiLand.addCreature(BrachioFemale);
        Pack meute = new Pack("Meute de compsognathus");
        HowlStrategy basicHowl = new BasicHowlStrategy();
        HowlStrategy agressivHowl = new AgressivHowlStrategy();
        HowlStrategy heatHowl = new HeatHowlStrategy();
        HowlStrategy submissionHowl = new SubmissionHowlStrategy();
        HowlStrategy dominanceHowl = new DominanceHowlStrategy();
        Compsognathus CompsoMale = new Compsognathus("CompsoMale", true, 25, 2, 5, false, false, true, 10, 10, 'a', 10, 10, meute, basicHowl );
        Compsognathus CompsoFemale = new Compsognathus("CompsoFemale", false, 25, 2, 4, false, false, true, 10, 10, 'a', 10, 10, meute, basicHowl);
        compsoLand.addCreature(CompsoMale);
        compsoLand.addCreature(CompsoFemale);
        Corythosaure CoryMale = new Corythosaure("CoryMale", true, 150, 4000, 5, false, false, true);
        Corythosaure CoryFemale = new Corythosaure("CoryFemale", false, 130, 3500, 4, false, false, true);
        herbiLand.addCreature(CoryMale);
        herbiLand.addCreature(CoryFemale);
        Ceratosaure CeraMale = new Ceratosaure("CeraMale", true, 250, 900, 8, true, false, true);
        Ceratosaure CeraFemale = new Ceratosaure("CeraFemale", false, 230, 800, 9, true, false, true);
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
        Pteranodon PteraMale = new Pteranodon("PteraMale", true, 150, 4000, 5, false, false, true);
        Pteranodon PteraFemale = new Pteranodon("PteraFemale", false, 130, 3500, 4, false, false, true);
        pteraLand.addCreature(PteraMale);
        pteraLand.addCreature(PteraFemale);
        Spinosaure SpinoMale = new Spinosaure("SpinoMale", true, 380, 5800, 5, false, false, true);
        Spinosaure SpinoFemale = new Spinosaure("SpinoFemale", false, 400, 6000, 6, false, false, true);
        spinoLand.addCreature(SpinoMale);
        spinoLand.addCreature(SpinoFemale);
        Stegosaure StegoMale = new Stegosaure("StegoMale", true, 350, 2000, 8, false, false, true);
        Stegosaure StegoFemale = new Stegosaure("StegoFemale", false, 360, 2200, 9, false, false, true);
        herbiLand.addCreature(StegoMale);
        herbiLand.addCreature(StegoFemale);
        Triceratops TriceMale = new Triceratops("TriceMale", true, 320, 6500, 7, false, false, true);
        Triceratops TriceFemale = new Triceratops("TriceFemale", false, 300, 6200, 6, false, false, true);
        herbiLand.addCreature(TriceMale);
        herbiLand.addCreature(TriceFemale);
        Tyrannosaure TyraMale = new Tyrannosaure("TyraMale", true, 500, 10000, 10, true, false, true);
        Tyrannosaure TyraFemale = new Tyrannosaure("TyraFemale", false, 540, 12000, 8, true, false, true);
        t_rexLand.addCreature(TyraMale);
        t_rexLand.addCreature(TyraFemale);
        Velociraptor VeloMale = new Velociraptor("VeloMale", true, 125, 15, 6, true, false, true);
        Velociraptor VeloFemale = new Velociraptor("VeloFemale", false, 125, 14, 5, true, false, true);
        veloLand.addCreature(VeloMale);
        veloLand.addCreature(VeloFemale);

        Godzilla godzilla = Godzilla.getGodzilla();
        godzilLand.addCreature(godzilla);
        Ghidorah ghidorah = Ghidorah.getGhidorah();
        kaijuLand.addCreature(ghidorah);
        Mithra mithra = Mithra.getMithra();
        kaijuLand.addCreature(mithra);
        Rodan rodan = Rodan.getRodan();
        kaijuLand.addCreature(rodan);

        //Pour afficher le nombre d'animaux.
        System.out.println(jurassicIsland.getNbAnimals());

        //Pour afficher le toString de tout l'archipel et le detail de chaque ile.
        //jurassicIsland.afficherInfos();

        int i = 0;
        int lower = 0;
        int higher = 100;
        int nbActionEmploye = 0;
        while (i != 200) {
            Creature laBete = null;
            Island ileAnettoyer = null;
            char response = ' ';
            int random = (int)(Math.random() * (higher-lower)) + lower;

            System.out.println("\n");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (random == 0) {
                System.out.println("Une enorme meteorite explose sur l'ile principale de Jurassic Park Land detruisant tous les animaux.");
                return;
            } else if (random <= 15){
                CompsoFemale.setHowlStrategy(agressivHowl);
                CompsoMale.setHowlStrategy(agressivHowl);
                laBete = jurassicIsland.getRandomCreature();
                laBete.move();
            } else if (random <= 30) {
                laBete = jurassicIsland.getRandomCreature();
                laBete.howl();

            } else if (random <= 50) {
                CompsoFemale.setHowlStrategy(dominanceHowl);
                CompsoMale.setHowlStrategy(submissionHowl);
                laBete = jurassicIsland.getRandomCreature();
                laBete.setHungry(true);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " a faim.");
                System.out.println("Voulez-vous le nourrir ? O / N => ");
                response = toLowerCase(in.next().charAt(0));
                while (response != 'o' && response != 'n') {
                    System.out.println("Veuillez repondre par O ou N => ");
                    response = in.next().charAt(0);
                }
                if (response == 'o' && nbActionEmploye < 10) {
                    employe_jurassic.feedAnimals(laBete);
                    nbActionEmploye++;
                } else if (nbActionEmploye > 10) {
                    System.out.println("L'employe est fatigue et se repose.");
                    nbActionEmploye = 0;
                }
            } else if (random <= 60) {
                CompsoFemale.setHowlStrategy(basicHowl);
                CompsoMale.setHowlStrategy(basicHowl);
                laBete = jurassicIsland.getRandomCreature();
                laBete.setHealth(false);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " est malade.");
                System.out.println("Voulez-vous le soigner ? O / N => ");
                response = toLowerCase(in.next().charAt(0));
                while (response != 'o' && response != 'n') {
                    System.out.println("Veuillez repondre par O ou N => ");
                    response = in.next().charAt(0);
                }
                if (response == 'o' && nbActionEmploye < 10) {
                    employe_jurassic.healAnimals(laBete);
                    nbActionEmploye++;
                } else if (response == 'n' && nbActionEmploye < 10) {
                    laBete.setAge(laBete.getAge() + 1);
                    if (laBete.getAge() > 15) {
                        System.out.println("La creature " + laBete.getName() + " est morte due a sa maladie.");
                    }
                } else {
                    System.out.println("L'employe est fatigue et doit se repose.");
                    nbActionEmploye = 0;
                }
            } else if (random <= 65) {
                laBete = jurassicIsland.getRandomCreature();
                laBete.setTired(true);
                System.out.println(laBete.getName() + " le " + laBete.getType() + " s'endort.");
            } else if (random <= 70) {
                laBete = jurassicIsland.getRandomCreature();
                if (laBete.isTired() == true) {
                    laBete.setTired(false);
                    System.out.println(laBete.getName() + " le " + laBete.getType() + " se reveille");
                }
            } else if (random <= 80) {
                ileAnettoyer = jurassicIsland.getRandomIsland();
                ileAnettoyer.setProprete("Mauvais");
                System.out.println(ileAnettoyer.getName() + " est sale/abime, voulez-vous le nettoyer ? O / N =>");
                response = toLowerCase(in.next().charAt(0));
                while (response != 'o' && response != 'n') {
                    System.out.println("Veuillez repondre par O ou N => ");
                    response = in.next().charAt(0);
                }
                if (response == 'o' && nbActionEmploye < 10) {
                    employe_jurassic.cleanIsland(ileAnettoyer, transferIsland);
                    nbActionEmploye++;
                } else if (nbActionEmploye >= 10){
                    System.out.println("L'employe est fatigue et doit se repose.");
                    nbActionEmploye = 0;
                }
            } else if (random <= 90) {
                laBete = jurassicIsland.getRandomCreature();

                if (laBete.isSex() == false) {
                    CompsoFemale.setHowlStrategy(heatHowl);
                    CompsoFemale.howl();
                    System.out.println("La femalle " + laBete.getName() + " attend un bebe.");
                    Egg nouvelleCreature = laBete.layEggs();
                    Creature newDino = nouvelleCreature.hatch();
                    if (newDino instanceof Herbivorous) {
                        herbiLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    } else if (newDino instanceof Tyrannosaure) {
                        t_rexLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    } else if (newDino instanceof Ceratosaure) {
                        ceratoLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    } else if (newDino instanceof Compsognathus) {
                        compsoLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    } else if (newDino instanceof Pteranodon) {
                        pteraLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    } else if (newDino instanceof Spinosaure) {
                        spinoLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    } else if (newDino instanceof Velociraptor) {
                        veloLand.addCreature(newDino);
                        System.out.println("Felicitations aux heureux parents, l'ile " + herbiLand.getName() + " a un nouveau locataire. Bienvenue a " + newDino.getName());
                    }
                    System.out.println(jurassicIsland.getNbAnimals());
                }else{
                    CompsoMale.setHowlStrategy(heatHowl);
                    CompsoMale.howl();
                }
            } else if (random <= 94) {
                Godzilla.getGodzilla().move();
            } else if (random <= 99) {
                System.out.println("Un kaiju  se deplace");
            } else {
                System.out.println("La purge : Godzilla et les kaijus se battent et font exploser tout le Jurassic Park Land");
                return;
            }

            if (i%30 == 0) {
                jurassicIsland.getOldAllCreature();
            }
            i++;
        }
    }
}
