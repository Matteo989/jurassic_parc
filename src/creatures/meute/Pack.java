/**
 * Classe qui gère toute les autres classes
 * @author Lou Byrnes, Matthieu Nourry
 * @version 1.0
 */
package creatures.meute;

import java.util.ArrayList;

public class Pack {


    private String name;
    private ArrayList<Compsognathus> pack;
    private CoupleAlpha coupleAlpha;

    public Pack(String name) {
        this.name = name;
        this.pack = new ArrayList<Compsognathus>();
        setCoupleAlpha();
    }

    public CoupleAlpha getCoupleAlpha() {
        return coupleAlpha;
    }

    public void setCoupleAlpha() {
        for(Compsognathus compsognathus:pack){
            if(compsognathus.getDominanceRank() == 'a' && compsognathus.isSex() == true){
               this.coupleAlpha.setMale(compsognathus);
            }
            if(compsognathus.getDominanceRank() == 'a' && compsognathus.isSex() == false){
                this.coupleAlpha.setFemalle(compsognathus);
            }
        }

    }

    public void showPackDetails(){
        System.out.println("le couple alpha sont les loups " + coupleAlpha.toString()   );
        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Compsognathus> getPack() {
        return pack;
    }

    public void setPack(ArrayList<Compsognathus> pack) {
        this.pack = pack;
    }

    public void addCompsognathusToMeute(Compsognathus compsognathus){
        pack.add(compsognathus);
    }

    public void leaveMeute(Compsognathus compsognathus){
        pack.remove(compsognathus);
    }



    @Override
    public String toString() {
        return "Pack{" +
                "name='" + name + '\'' +
                ", pack=" + pack +
                ", coupleAlpha=" + coupleAlpha +
                '}';
    }
}
