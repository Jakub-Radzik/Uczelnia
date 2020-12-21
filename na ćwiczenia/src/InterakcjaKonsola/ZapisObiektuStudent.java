package InterakcjaKonsola;

import Klasy.Kurs;
import Klasy.Osoba;
import Klasy.Student;
import Struktury.Listy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ZapisObiektuStudent implements ZapisObiektu {
    @Override
    public Student saveObject() {

        Scanner scanner = new Scanner(System.in);
        String imie = AbstractCreator.checkStringHasOnlyLetters("imię");
        String nazwisko = AbstractCreator.checkStringHasOnlyLetters("nazwisko");
        String PESEL = AbstractCreator.checkPESEL("PESEL");
        String plec = AbstractCreator.isGenderValid();
        int wiek = AbstractCreator.isIntegerAndCorrect("wiek");
        int rokStudiow = AbstractCreator.isIntegerAndCorrect("rok studiów");
        String kierunek = AbstractCreator.checkStringHasOnlyLetters("kierunek studiów");
        boolean erasmus;
        boolean pierwszyStopien;
        boolean stacjonarny;

        System.out.println("Czy student jest uczestnikiem erasmusa? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")) {
            erasmus = true;
        } else {
            erasmus = false;
        }

        System.out.println("Czy student jest studentem 1 stopnia? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")) {
            pierwszyStopien = true;
        } else {
            pierwszyStopien = false;
        }

        System.out.println("Czy student jest studentem stacjonarnym? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")) {
            stacjonarny = true;
        } else {
            stacjonarny = false;
        }

        ArrayList<Kurs> kursyStudenta = new ArrayList<>();
        System.out.println("\nDomyślnie student został zapisany na analizę 1 i algebrę\n");
        for (Kurs kurs: Listy.kursy) {
            if (kurs.getNazwaKursu().equals("Analiza Matematyczna 1") || kurs.getNazwaKursu().equals("Algebra")){
                kursyStudenta.add(kurs);
            }
        }

        String indeks = "";
        //Tworzymy tablice z istniejącymi indeksami
        ArrayList<String> indeksy = new ArrayList<>();
        for (Osoba osoba : Listy.osoby) {
            if (osoba instanceof Student) {
                indeksy.add(((Student) osoba).getNumer_indeksu());
            }
        }

        //Dopoki nowy indeks nie jest unikalny generujemy nowy
        while (true) {
            String newIndeks = String.valueOf(new Random().nextInt(999999999));
            if (!indeksy.contains(newIndeks)) {
                break;
            }
        }


        Student myStudent = new Student(imie,nazwisko,PESEL,wiek,plec,indeks,kursyStudenta,erasmus,pierwszyStopien,stacjonarny,rokStudiow,kierunek);


        int wybor = -1;

        AtomicInteger c = new AtomicInteger(0);

        ArrayList<Kurs> kursyDoWyboru = new ArrayList<Kurs>(Listy.kursy);

        while (true) {
            c.set(0);
            if (myStudent.getListaKursow() != null) {
                kursyDoWyboru.removeAll(myStudent.getListaKursow());
            }


            System.out.println("WYBIERZ KURS DO PRZYPISANIA STUDENTOWI:");
            System.out.println("[0] - ZAKONCZ");
            kursyDoWyboru.forEach(kurs -> System.out.println("[" + c.incrementAndGet() + "] - " + kurs.getNazwaKursu()));

            do {
                System.out.println("Wybierz kurs do przypisania:");
                try {
                    wybor = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    scanner.next();
                }

            } while (wybor < 0 || wybor > kursyDoWyboru.size());

            if (wybor != 0) {
                myStudent.appendCourse(kursyDoWyboru.get(wybor - 1));
            } else {
                break;
            }
        }



        return myStudent;
    }
}
