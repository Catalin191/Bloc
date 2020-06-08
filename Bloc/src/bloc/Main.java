package bloc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bloc bloc = new Bloc("ANL");
        Etaj etaj0 = new Etaj(0);
        Apartament ap1 = new Apartament(1," fam Ionescu");

        etaj0.setApartaments(ap1);

        Apartament ap2 = new Apartament(2," fam Popescu");

        etaj0.setApartaments(ap2);
        bloc.setEtaje(etaj0);

        Etaj etaj1 = new Etaj(1);
        Apartament ap3 = new Apartament(3, " fam Georgescu");
        etaj1.setApartaments(ap3);
        Apartament ap4 = new Apartament(4, " fam Vladimirescu");
        etaj1.setApartaments(ap4);
        Apartament ap5 = new Apartament(5, " fam Tutulescu");
        etaj1.setApartaments(ap5);
        bloc.setEtaje(etaj1);

        System.out.println(bloc.getName());
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("et-" + etaj1.getNrEtaj() + ":||" + ap3.getApNumber() + "." + ap3.getName() + "|| ||"
        + ap4.getApNumber() + "." + ap4.getName() + "|| ||" + ap5.getApNumber() + "." + ap5.getName() + "||");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("et-"+ etaj0.getNrEtaj() + ":||1. " + ap1.getName() + "|| ||2. " + ap2.getName());
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        
    }
}
