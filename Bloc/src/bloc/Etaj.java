package bloc;

import java.util.ArrayList;

public class Etaj {

    private int nrEtaj;
    private Apartament apartaments;

    public Etaj(int nrEtaj){
        this.nrEtaj = nrEtaj;
    }

    public void setApartaments(Apartament apartament) {
        this.apartaments = apartament;
    }

    public int getNrEtaj() {
        return nrEtaj;
    }
}
