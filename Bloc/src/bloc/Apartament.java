package bloc;

public class Apartament {

    private String name;
    private int apNumber;

    public Apartament(int apNumber, String name){
        this.apNumber = apNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getApNumber() {
        return apNumber;
    }
}
