package InterakcjaKonsola;

import Klasy.Kurs;
import Klasy.Osoba;
import Klasy.Pracownik_Badawczo_Dydaktyczny;
import Struktury.Listy;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ZapisObiektuKurs implements ZapisObiektu {
    @Override
    public Kurs saveObject() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz nazwe kursu:");
        String nazwaKursu = scanner.nextLine();
        int ects = AbstractCreator.isIntegerAndCorrect("liczbę punktów ECTS");
        Pracownik_Badawczo_Dydaktyczny prowadzacy = null;

        //W związku z kłopotami z odczytem listy pracowników, operacja wyboru prowadzącego jest wykonywana tutaj
        //prezentacja wyboru pracownika dydaktycznego
        //AtomicInteger potrzebny gdyż z każdym wyswietleniem osoby inkrementuję i zwracam numer
        AtomicInteger c = new AtomicInteger();
        System.out.println("[0] - Utwórz nowego prowadzącego");
        Listy.osoby.stream()
                .filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                .forEach(osoba -> System.out.println("[" + (c.incrementAndGet()) + "] - " + osoba.getImie() + " " + osoba.getNazwisko()));

        // poprawny jest wybor całkowity od 0 do ilosci prowadzacych
        // -1 nie jest poprawne i w tym przypadku znowu obslugujemy błędy wejścia
        int wybor = -1;
        do {
            System.out.println("Wybierz prowadzacego:");
            try {
                wybor = scanner.nextInt();
            } catch (InputMismatchException ex) {
                scanner.next();
            }

        } while (wybor < 0 || wybor > c.get());

        //Użytkownik może wybrać utworzenie prowadzącego zamiast przypisanie istniejącego
        if (wybor == 0) { //Utworzono nowy kurs i tworzymy nowego prowadzącego dla tego kursu
            ZapisObiektu tmpStrategy = new ZapisObiektuPracownikDydaktyczny();       //Przełączenie strategii na utworzenie nowego pracownika dydaktycznego
            prowadzacy = (Pracownik_Badawczo_Dydaktyczny) tmpStrategy.saveObject();
            Listy.osoby.add(prowadzacy);    //Po utworzeniu pracownika zapisanie go na koncu tablicy osob
            System.out.println("NOWY PROWADZĄCY:============================================");
            System.out.println(prowadzacy);    //Nowy prowadzący jest na koncu
            System.out.println("NOWY KURS:==================================================");



            //nowy utworzony kurs jest na koncu tablicy kursów - bierzemy go i przypisujemy mu ostatniego pracownika z zapisanych czyli nowego pracownika

        } else { // przypisanie istniejącego prowadzącego
            c.set(0);
            for (Osoba osoba : Listy.osoby) {
                if (osoba instanceof Pracownik_Badawczo_Dydaktyczny) {
                    c.incrementAndGet();
                    if (c.get() == wybor) {
                        prowadzacy = (Pracownik_Badawczo_Dydaktyczny) osoba;
                        break;
                    }
                }
            }
        }


        Kurs myKurs = new Kurs(nazwaKursu, prowadzacy, ects);

        return myKurs;
    }
}
