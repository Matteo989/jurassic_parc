package archipel;

import creatures.Diplodocus;
import creatures.Godzilla;
import creatures.Tyrannosaure;

import static creatures.Godzilla.getGodzilla;

public class Archipel {
    // un archipel est un amas d'îles, îles qui sont nos enclos pour le projet.
    // Une île pour godzilla (peut etre radioactive), une île pour les kaiju,
    // une île pour tous les herbivores,
    // un île pour chaque sorte de carnivores et omnivores,
    // une volière pour les pterodactyl et un bassin pour les dino marins.

    public String name;
    public String employee = "Mickael";
    public double nbIleMax;
    public double nbIleActual;

    public Archipel(String name, String employee, double nbIleMax, double nbIleActual) {
        this.name = name;
        this.employee = employee;
        this.nbIleMax = nbIleMax;
        this.nbIleActual = nbIleActual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public double getnbIleMax() {
        return nbIleMax;
    }

    public void setnbIleMax(double nbIleMax) {
        this.nbIleMax = nbIleMax;
    }

    public double getnbIleActual() {
        return nbIleActual;
    }

    public void setnbIleActual(double nbIleActual) {
        this.nbIleActual = nbIleActual;
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
        // (son nombre d’action par intervalle de temps devant être limité)

        Tyrannosaure Marc = new Tyrannosaure("Marc", true, 500, 10000, 10, true, false, true);
        System.out.println(Marc.toString());
        Marc.getDinosaurState();
        Marc.walk();
        Marc.eatMeat();
        Marc.eatMeat();
        Marc.getDinosaurState();

        Godzilla.getGodzilla();
        getGodzilla().nager();
        getGodzilla().walk();
        System.out.println(getGodzilla().getType()); // return Godzilla

        Diplodocus Neiko = new Diplodocus("Neiko", true, 3, 8, 1, false, true, true);
        System.out.println(Neiko.toString());
        Neiko.walk();
        Neiko.getDinosaurState();
        Neiko.eatVegetables();

    }
}
