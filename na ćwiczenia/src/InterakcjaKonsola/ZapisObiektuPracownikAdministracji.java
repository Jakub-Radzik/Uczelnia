package InterakcjaKonsola;

import Klasy.Pracownik_Administracyjny;

import java.util.Scanner;

public class ZapisObiektuPracownikAdministracji implements ZapisObiektu {
    @Override
    public Object saveObject() {
        Scanner scanner = new Scanner(System.in);
        String imie = AbstractCreator.checkStringHasOnlyLetters("imię");
        String nazwisko = AbstractCreator.checkStringHasOnlyLetters("nazwisko");
        String PESEL = AbstractCreator.checkPESEL("PESEL");
        String plec = AbstractCreator.isGenderValid();
        int wiek = AbstractCreator.isIntegerAndCorrect("wiek");
        String stanowisko = AbstractCreator.checkStringHasOnlyLetters("stanowisko");
        int stazPracy = AbstractCreator.isIntegerAndCorrect("staż pracy");
        int pensja = AbstractCreator.isIntegerAndCorrect("pensję");
        int nadgodziny = AbstractCreator.isIntegerAndCorrect("liczbę nadgodzin");
        Pracownik_Administracyjny pracownik = new Pracownik_Administracyjny(imie,nazwisko,PESEL,wiek,plec,stanowisko,stazPracy,pensja,nadgodziny);
        return pracownik;
    }
}
