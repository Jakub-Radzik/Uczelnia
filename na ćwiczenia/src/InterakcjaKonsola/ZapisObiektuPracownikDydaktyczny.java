package InterakcjaKonsola;

import Klasy.Pracownik_Badawczo_Dydaktyczny;

import java.util.Scanner;

public class ZapisObiektuPracownikDydaktyczny implements ZapisObiektu {
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
        int dorobek = AbstractCreator.isIntegerAndCorrect("dorobek naukowy");
        Pracownik_Badawczo_Dydaktyczny pracownik = new Pracownik_Badawczo_Dydaktyczny(imie, nazwisko, PESEL,wiek,plec,stanowisko,stazPracy,pensja,dorobek);
        return pracownik;
    }
}
