package employees;

import creatures.Creature;
import islands.HerbivorousIsland;
import islands.Island;
import islands.TransferIsland;

public class Employee {
    public String name;
    public char gender;  // M ou F
    public int age;

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void examinateIsland(Island island) {
        island.afficherCaracs();
    }

    public void cleanIsland(Island island, TransferIsland transferIsland) {
        if (island.getPropreté() == "Bon" && island.getPropreté() == "Correct") {
            System.out.println("L'île " + island.getName() + " et propre et ne doit pas être nettoyée.");
            return;
        } else if (island instanceof HerbivorousIsland) {
            System.out.println("L'employé " + this.getName() + " commence a nettoyer l'île " + island.getName());
            island.setPropreté("Bon");
            System.out.println("L'île " + island.getName() + " est propre.");
        } else if (transferIsland.getNbAnimaux() != 0) {
            System.out.println("L'île de transfers est déjà utilisée, attendez que les créatures actuellement présentes retournent dans leur enclos.");
            return;
        } else {
            this.moveAnimal(island, transferIsland);
            System.out.println("L'île est vide et commence à être nettoyée");
            island.setPropreté("Bon");
            System.out.println("L'île " + island.getName() + " est propre.");
            this.moveAnimal(transferIsland, island);
        }
    }

    public void feedAnimals(Creature creature) {
        System.out.println("L'employé commence a nourrir " + creature.getName());
        creature.setHungry(false);
        System.out.println(creature.getName() + " a bien mangé");
    }

    public void healAnimals(Creature creature) {
        System.out.println("L'employé commence a soigner " + creature.getName());
        creature.setHealth(true);
        System.out.println(creature.getName() + " est de nouveau en bonne santé.");
    }

    public void moveAnimal(Island pastIsland, Island newIsland) {

    }
}
