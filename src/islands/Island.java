package islands;

import creatures.Creatures;
import creatures.Dinosaur;

import java.util.ArrayList;

public abstract class Island<T>{
    private String nom;
    private int superficie;
    private int animauxMax, nbAnimaux;
    private String propreté; //Mauvais, Bon, Correct
    private ArrayList<T> creatures;

    public void afficherCaracs(){
        this.toString();
        for(T creature:creatures) {
            creature.toString();
        }
    }

    public void addCreature(T creature){
        this.creatures.add(creature);
    }


    public void moveCreature(){
        //move creatures from this island to TransferIsland
    }

    public void feedCreatures(){
        for(T creature:creatures) {
            creature.setHungry(false);
        }
    }

    public void clean(){
        //test si il vide
        //si ile vide ==>  clean
        //sinon ==> move to TransferIsland then clean
    }


    @Override
    public String toString() {
        return "Island{" +
                "nom='" + nom + '\'' +
                ", superficie=" + superficie +
                ", animauxMax=" + animauxMax +
                ", nbAnimaux=" + nbAnimaux +
                ", propreté='" + propreté + '\'' +
                ", creatures=" + creatures +
                '}';
    }

}
