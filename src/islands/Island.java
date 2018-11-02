package islands;

import creatures.Creature;

import java.util.ArrayList;

public abstract class Island<T extends Creature>{
    private String name;
    private int superficie;
    private int animauxMax;
    private int nbAnimaux;
    private String propreté; //Mauvais, Bon, Correct
    private ArrayList<T> creatures = new ArrayList<T>();

    public Island(String name, int superficie, int animauxMax, int nbAnimaux, String propreté, ArrayList<T> creatures) {
        this.name = name;
        this.superficie = superficie;
        this.animauxMax = animauxMax;
        this.nbAnimaux = nbAnimaux;
        this.propreté = propreté;
        this.creatures = creatures;
    }

    public Island() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getAnimauxMax() {
        return animauxMax;
    }

    public void setAnimauxMax(int animauxMax) {
        this.animauxMax = animauxMax;
    }

    public int getNbAnimaux() {
        return nbAnimaux;
    }

    public void setNbAnimaux(int nbAnimaux) {
        this.nbAnimaux = nbAnimaux;
    }

    public String getPropreté() {
        return propreté;
    }

    public void setPropreté(String propreté) {
        this.propreté = propreté;
    }

    public ArrayList<T> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<T> creatures) {
        this.creatures = creatures;
    }

    public void afficherCaracs(){
        this.toString();
        for(T creature:creatures) {
            creature.toString();
        }
    }

    public void addCreature(T creature){
        this.creatures.add(creature);
        this.nbAnimaux ++;
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
                "name='" + name + '\'' +
                ", superficie=" + superficie +
                ", animauxMax=" + animauxMax +
                ", nbAnimaux=" + nbAnimaux +
                ", propreté='" + propreté + '\'' +
                ", creatures=" + creatures +
                '}';
    }

}
