package InterakcjaKonsola;

import Klasy.Osoba;
import Klasy.Pracownik_Uczelni;

import java.util.Scanner;

public abstract class AbstractCreator {
    protected static Osoba personCreator(Osoba person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię:");
        person.setImie(scanner.nextLine());
        System.out.println("Wprowadź nazwisko:");
        person.setNazwisko(scanner.nextLine());
        System.out.println("Wprowadź PESEL:");
        person.setPesel(scanner.nextLine());
        System.out.println("Wprowadź plec [M/K]:");
        person.setPlec(scanner.nextLine());
        System.out.println("Wprowadź wiek:");
        person.setWiek(scanner.nextInt());
        return person;
    }

    protected static Osoba workerCreator(Pracownik_Uczelni worker) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stanowisko");
        worker.setStanowisko(scanner.nextLine());
        System.out.println("Podaj staż pracy");
        worker.setStazPracy(scanner.nextInt());
        System.out.println("Podaj pensje");
        worker.setPensja(scanner.nextInt());
        return worker;
    }

}
