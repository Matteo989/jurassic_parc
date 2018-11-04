/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package islands;

import creatures.Creature;

import java.util.ArrayList;

public abstract class Island<T>{
    private String name;
    private int area;
    private int animauxMax;
    private int nbAnimaux;
    private String proprete; //Mauvais, Bon, Correct
    private ArrayList<T> creatures;

    public Island(){

    }

    public Island(String name, int area, int animauxMax, int nbAnimaux, String proprete, ArrayList<T> creatures) {
        this.name = name;
        this.area = area;
        this.animauxMax = animauxMax;
        this.nbAnimaux = nbAnimaux;
        this.proprete = proprete;
        this.creatures = creatures;
        if(creatures != null) {
            this.creatures = creatures;
        }else{
            this.creatures = new ArrayList<T>();
        }
    }

    public void getOldCreatures(){
        for (T creature:this.creatures){
            ((Creature) creature).getOld();
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

    public String getProprete() {
        return proprete;
    }

    public void setProprete(String proprete) {
        this.proprete = proprete;
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
                ", proprete='" + proprete + '\'' +
                ", creatures=" + creatures +
                '}';
    }

}
