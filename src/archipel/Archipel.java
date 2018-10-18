package archipel;

import creatures.Diplodocus;
import creatures.Godzilla;
import creatures.Tyrannosaure;

import static creatures.Godzilla.getGodzilla;

public class Archipel {
    // un archipel est un amas d'îles, îles qui sont nos enclos pour le projet.
    // Une île pour godzilla (peut etre radioactive), une île pour les kaiju,
    // et une île principale pour tous les dinausaures avec un enclos pour les herbivores,
    // un enclos pour chaque sorte de carnivores et omnivores,
    // une volière pour les pterodactyl et un bassin pour les dino marins.

    public String name;
    public String employee = "Mickael";
    public double nbEnclosMax;
    public double nbEnclosActual;

    public Archipel(String name, String employee, double nbEnclosMax, double nbEnclosActual) {
        this.name = name;
        this.employee = employee;
        this.nbEnclosMax = nbEnclosMax;
        this.nbEnclosActual = nbEnclosActual;
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

    public double getNbEnclosMax() {
        return nbEnclosMax;
    }

    public void setNbEnclosMax(double nbEnclosMax) {
        this.nbEnclosMax = nbEnclosMax;
    }

    public double getNbEnclosActual() {
        return nbEnclosActual;
    }

    public void setNbEnclosActual(double nbEnclosActual) {
        this.nbEnclosActual = nbEnclosActual;
    }



    public static void main(String[] args) {
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
