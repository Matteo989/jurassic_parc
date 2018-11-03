package creatures.meute;

import java.util.ArrayList;

public class Pack {


    private String name;
    private ArrayList<Compsognathus> pack;

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

    public Pack(String name) {
        this.name = name;
        this.pack = new ArrayList<Compsognathus>();
    }

    @Override
    public String toString() {
        return "Pack{" +
                "name='" + name + '\'' +
                ", pack=" + pack +
                '}';
    }
}
