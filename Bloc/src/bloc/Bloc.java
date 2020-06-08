package bloc;

import java.util.ArrayList;

public class Bloc {

    private String name;
    private Etaj etaje;

    public Bloc(String name){
        this.name = name;
    }

    public void setEtaje(Etaj etaje) {
        this.etaje = etaje;
    }

    public Etaj getEtaje() {
        return etaje;
    }

    public String getName() {
        return name;
    }
}
