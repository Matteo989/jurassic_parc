/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures.meute;

import creatures.Egg;

public class CoupleAlpha {
    private Compsognathus male;
    private Compsognathus femalle;


    public CoupleAlpha(Compsognathus male, Compsognathus femalle) {
        this.male = male;
        this.femalle = femalle;

    }

    public void setMale(Compsognathus male) {
        this.male = male;
    }


    public void setFemalle(Compsognathus femalle) {
        this.femalle = femalle;
    }

    public Compsognathus getMale() {
        return male;
    }


    public Compsognathus getFemalle() {
        return femalle;
    }


    public Egg reproductionAlpha(){
        return this.femalle.layEggs();
    }

    @Override
    public String toString() {
        return "coupleWolf{" +
                "male=" + male.toString() +
                ", femalle=" + femalle.toString() +
                '}';
    }



}
