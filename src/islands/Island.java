package islands;

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
        for()
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
