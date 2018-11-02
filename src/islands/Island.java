package islands;

import creatures.Creature;

import java.util.ArrayList;

public abstract class Island<T>{
    private String name;
    private int area;
    private int animauxMax;
    private int nbAnimaux;
    private String propreté; //Mauvais, Bon, Correct
    private ArrayList<T> creatures;

    public Island(String name, int area, int animauxMax, int nbAnimaux, String propreté, ArrayList<T> creatures) {
        this.name = name;
        this.area = area;
        this.animauxMax = animauxMax;
        this.nbAnimaux = nbAnimaux;
        this.propreté = propreté;
        this.creatures = creatures;
        if(creatures != null) {
            this.creatures = creatures;
        }else{
            this.creatures = new ArrayList<T>();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
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
        System.out.println(this.toString());
        for(T creature:creatures) {
            System.out.println(creature.toString());
    }
    }

    public void addCreature(T creature){
        System.out.println(creature.toString());
        for(T myCreature:creatures) {
            System.out.println(myCreature.toString());
            if(myCreature == creature) {
                System.out.println("La créature " + creature + " est deja dans l'enclos");
            }
        }
        this.creatures.add(creature);
        this.nbAnimaux++;
    }


    public void removeCreature(T creature){
        this.creatures.remove(creature);
        //move creatures from this island to TransferIsland
    }

    /*public void feedCreatures(){
        for(T creature:creatures) {
            creature.setHungry(false);
        }
    }*/

    public void clean(){
        //test si il vide
        //si ile vide ==>  clean
        //sinon ==> move to TransferIsland then clean
    }

    @Override
    public String toString() {
        return "Island{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", animauxMax=" + animauxMax +
                ", nbAnimaux=" + nbAnimaux +
                ", propreté='" + propreté + '\'' +
                ", creatures=" + creatures +
                '}';
    }

}
