package InterakcjaKonsola;

import Klasy.Kurs;
import Klasy.Pracownik_Badawczo_Dydaktyczny;

import java.util.Scanner;

public class ZapisObiektuKurs implements ZapisObiektu{
    @Override
    public Kurs saveObject() {

        Scanner kursScanner = new Scanner(System.in);
        Kurs myKurs = new Kurs();

        System.out.println("Wprowadz nazwe kursu:");
        myKurs.setNazwaKursu(kursScanner.nextLine());

        System.out.println("Wprowadz ilość punktów ECTS:");
        myKurs.setEcts(kursScanner.nextInt());

        return myKurs;
    }
}
