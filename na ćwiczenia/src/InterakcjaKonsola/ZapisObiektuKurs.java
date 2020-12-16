package InterakcjaKonsola;

import Klasy.Kurs;

import java.util.Scanner;

public class ZapisObiektuKurs implements ZapisObiektu {
    @Override
    public Kurs saveObject() {

        Scanner kursScanner = new Scanner(System.in);
        Kurs myKurs = new Kurs();

        System.out.println("Wprowadz nazwe kursu:");
        myKurs.setNazwaKursu(kursScanner.nextLine());

        myKurs.setEcts(AbstractCreator.isIntegerAndCorrect("liczbę punktów ECTS"));

        return myKurs;
    }
}
