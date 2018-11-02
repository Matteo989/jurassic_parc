package islands;

import creatures.Kaiju;

import java.util.ArrayList;

public final class TransferIsland<T> extends Island<T>{

    private static volatile TransferIsland ileTransfer = null; //volatile pour gérer les thread

    public static TransferIsland getIleTransfer() {
        if(ileTransfer == null) {
            ileTransfer = new TransferIsland();
        }
        return ileTransfer;
    }

    private TransferIsland() {
        this.setName("Ile de Transfert");
        this.setArea(50000);
        this.setAnimauxMax(200);
        this.setNbAnimaux(0);
        this.setPropreté("Bon");
        this.setCreatures(null);
    }
}
