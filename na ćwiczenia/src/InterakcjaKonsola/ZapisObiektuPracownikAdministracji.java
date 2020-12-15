package InterakcjaKonsola;

import Klasy.Pracownik_Administracyjny;

import java.util.Scanner;

public class ZapisObiektuPracownikAdministracji implements ZapisObiektu {
    @Override
    public Object saveObject() {
        Scanner scanner = new Scanner(System.in);
        Pracownik_Administracyjny pracownik = new Pracownik_Administracyjny();
        AbstractCreator.personCreator(pracownik);
        AbstractCreator.workerCreator(pracownik);
        pracownik.setLiczba_nadgodzin(AbstractCreator.isIntegerAndCorrect("liczbę nadgodzin"));
        return pracownik;
    }
}
