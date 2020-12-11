import Klasy.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pracownik_Badawczo_Dydaktyczny Szymon_Romanek = new Pracownik_Badawczo_Dydaktyczny("Szymon", "Romanek","000000000000", 30,"M","Wykladowca", 5,3000,5);
        Pracownik_Badawczo_Dydaktyczny Piotr_Puchala = new Pracownik_Badawczo_Dydaktyczny("Piotr", "Puchala","11111111111", 35,"M","Profesor Nadzwyczajny", 15,15000,22);
        Pracownik_Badawczo_Dydaktyczny Rafal_Kruszyna = new Pracownik_Badawczo_Dydaktyczny("Rafal", "Kruszyna","22222222222", 25,"M","Adiunkt", 5,5500,10);
        Pracownik_Badawczo_Dydaktyczny Jakub_Roszkowski = new Pracownik_Badawczo_Dydaktyczny("Jakub", "Roszkowski", "99999999999", 35, "M", "Profesor Nadzwyczajny", 20,16000, 30);

        Pracownik_Administracyjny Natalia_Martynenko = new Pracownik_Administracyjny("Natalia", "Martynenko","33333333333",28,"K","Starszy Specjalista", 10, 8500, 12);
        Pracownik_Administracyjny Kamil_Herbetko = new Pracownik_Administracyjny("Kamil", "Herbetko","44444444444",29,"M","Referent", 10, 9500, 6);
        Pracownik_Administracyjny Malina_Lobocka = new Pracownik_Administracyjny("Malina", "Lobocka","55555555555",32,"K","Specjalista", 5, 11500, 10);

        Kurs analiza1 = new Kurs("Analiza Matematyczna 1", Szymon_Romanek,5);
        Kurs logika = new Kurs("Logika", Rafal_Kruszyna,4);
        Kurs algebra = new Kurs("Algebra", Piotr_Puchala,6);
        Kurs fizyka1 = new Kurs("Fizyka 1", Szymon_Romanek,4);
        Kurs termodynamika = new Kurs("Termodynamika", Piotr_Puchala,5);
        Kurs wychowanieFizyczne = new Kurs("Wychowanie Fizyczne", Rafal_Kruszyna,0);
        Kurs ProgramowanieStrukturalneIObiektrowe = new Kurs("Programowanie Strukturalne i Obiektowe", Jakub_Roszkowski, 7);

        ArrayList<Kurs> matematyka = new ArrayList<>(Arrays.asList(analiza1,algebra));
        ArrayList<Kurs> fizyka = new ArrayList<>(Arrays.asList(fizyka1,termodynamika,wychowanieFizyczne,analiza1));

        ArrayList<Kurs> informatyka = new ArrayList<>(Arrays.asList(fizyka1,logika,wychowanieFizyczne,analiza1, ProgramowanieStrukturalneIObiektrowe));

        Student Mateusz_Pietrych = new Student("Mateusz", "Pietrych", "66666666666", 19, "M","123456", matematyka, false, true, true ,1);
        Student Wiktor_Sadowy = new Student("Wiktor", "Sadowy", "77777777777", 20, "M","123654",fizyka, false, true, true ,2);
        Student Jakub_Oleszczuk = new Student("Jakub", "Oleszczuk", "88888888888", 21, "M","123777",informatyka, false, false, true ,3);

        ArrayList<Kurs> kursy = new ArrayList<>(Arrays.asList(analiza1, logika, algebra, fizyka1,termodynamika, wychowanieFizyczne, ProgramowanieStrukturalneIObiektrowe));
        ArrayList<Osoba> osoby = new ArrayList<>(Arrays.asList(Szymon_Romanek, Rafal_Kruszyna,Piotr_Puchala, Jakub_Roszkowski, Natalia_Martynenko, Kamil_Herbetko, Malina_Lobocka, Mateusz_Pietrych, Wiktor_Sadowy, Jakub_Oleszczuk));

        //REALIZACJA PUNKTU 3 - wszystkie metody
        System.out.println("REALIZACJA PUNKTU 3\n");

        System.out.println("\nWyszukiwanie osob po imieniu (Piotr) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzOsobyPoImieniu(osoby, "Piotr").forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po nazwisku (Oleszczuk) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzOsobyPoNazwisku(osoby, "Oleszczuk").forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stazu pracy mniejszym niz 10============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyMniejszymNiz(osoby, 10).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stazu pracy większym niz 10============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyWiekszymNiz(osoby, 10).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stazu pracy równym 5============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyRownym(osoby, 5).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin mniejszej niz 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachMniejszychNiz(osoby,6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin wiekszej niz 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachWiekszychNiz(osoby,6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin równej 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachRownych(osoby,6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji wiekszej niz 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiWiekszejNiz(osoby,15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji mniejszej niz 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiMniejszejNiz(osoby,15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji rownej 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiRownej(osoby,15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stanowisku (Adiunkt) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStanowisku(osoby,"Adiunkt").forEach(System.out::println);

        System.out.println("\nWyszukiwanie studenta po numerze indeksu (123456) ============================================================================\n");
        System.out.println(NarzedziaWyszukiwania.znajdzStudentaPoIndeksie(osoby,"123456"));

        System.out.println("\nWyszukiwanie studentów po roku studiów (1) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzStudentowPoRokuStudiow(osoby,1).forEach(System.out::println);

        System.out.println("\nWyszukiwanie kursu po nazwie (Analiza Matematyczna 1) ============================================================================\n");
        System.out.println(NarzedziaWyszukiwania.znajdzKursPoNazwie(kursy,"Analiza Matematyczna 1"));

        System.out.println("\nWyszukiwanie kursów po liczbie ects (5) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzKursyPoECTS(kursy, 5).forEach(System.out::println);

        System.out.println("\nWyszukiwanie kursów po prowadzacym (Rafał Kruszyna) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzKursyPoProwadzacym(kursy, Rafal_Kruszyna).forEach(System.out::println);


        //REALIZACJA PUNKTU 4
        System.out.println("=====================================================================================================================");
        System.out.println("REALIZACJA PUNKTU 4");
        System.out.println("=====================================================================================================================\n");
        System.out.println("Kursy:\n");
        for (Kurs kurs: kursy) {
            System.out.println(kurs.toString());
        }

        System.out.println("\nOsoby:\n");
        for (Osoba osoba: osoby) {
            System.out.println("OSOBA====================================================================================================");
            System.out.println(osoba.toString());
            System.out.println();
        }


    }
}
