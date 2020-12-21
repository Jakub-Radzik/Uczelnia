package Struktury;

import Klasy.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Listy {
    public static ArrayList<Osoba> osoby;
    public static ArrayList<Kurs> kursy;

    private Pracownik_Badawczo_Dydaktyczny Szymon_Romanek;
    private Pracownik_Badawczo_Dydaktyczny Piotr_Puchala;
    private Pracownik_Badawczo_Dydaktyczny Rafal_Kruszyna;
    private Pracownik_Badawczo_Dydaktyczny Jakub_Roszkowski;
    private Pracownik_Administracyjny Natalia_Martynenko;
    private Pracownik_Administracyjny Kamil_Herbetko;
    private Pracownik_Administracyjny Malina_Lobocka;
    private Kurs analiza1;
    private Kurs logika;
    private Kurs algebra;
    private Kurs fizyka1;
    private Kurs termodynamika;
    private Kurs wychowanieFizyczne;
    private Kurs ProgramowanieStrukturalneIObiektrowe;
    private ArrayList<Kurs> matematyka;
    private ArrayList<Kurs> fizyka;
    private ArrayList<Kurs> informatyka;
    private Student Mateusz_Pietrych;
    private Student Wiktor_Sadowy;
    private Student Jakub_Oleszczuk;

    public Listy(){
        Szymon_Romanek = new Pracownik_Badawczo_Dydaktyczny("Szymon", "Romanek", "000000000000", 30, "M", "Wykladowca", 5, 3000, 5);
        Piotr_Puchala = new Pracownik_Badawczo_Dydaktyczny("Piotr", "Puchala", "11111111111", 35, "M", "Profesor Nadzwyczajny", 15, 15000, 22);
        Rafal_Kruszyna = new Pracownik_Badawczo_Dydaktyczny("Rafal", "Kruszyna", "22222222222", 25, "M", "Adiunkt", 5, 5500, 10);
        Jakub_Roszkowski = new Pracownik_Badawczo_Dydaktyczny("Jakub", "Roszkowski", "99999999999", 35, "M", "Profesor Nadzwyczajny", 20, 16000, 30);

        Natalia_Martynenko = new Pracownik_Administracyjny("Natalia", "Martynenko", "33333333333", 28, "K", "Starszy Specjalista", 10, 8500, 12);
        Kamil_Herbetko = new Pracownik_Administracyjny("Kamil", "Herbetko", "44444444444", 29, "M", "Referent", 10, 9500, 6);
        Malina_Lobocka = new Pracownik_Administracyjny("Malina", "Lobocka", "55555555555", 32, "K", "Specjalista", 5, 11500, 10);

        analiza1 = new Kurs("Analiza Matematyczna 1", Szymon_Romanek, 5);
        logika = new Kurs("Logika", Rafal_Kruszyna, 4);
        algebra = new Kurs("Algebra", Piotr_Puchala, 6);
        fizyka1 = new Kurs("Fizyka 1", Szymon_Romanek, 4);
        termodynamika = new Kurs("Termodynamika", Piotr_Puchala, 5);
        wychowanieFizyczne = new Kurs("Wychowanie Fizyczne", Rafal_Kruszyna, 0);
        ProgramowanieStrukturalneIObiektrowe = new Kurs("Programowanie Strukturalne i Obiektowe", Jakub_Roszkowski, 7);

        matematyka = new ArrayList<>(Arrays.asList(analiza1, algebra));
        fizyka = new ArrayList<>(Arrays.asList(fizyka1, termodynamika, wychowanieFizyczne, analiza1));
        informatyka = new ArrayList<>(Arrays.asList(fizyka1, logika, wychowanieFizyczne, analiza1, ProgramowanieStrukturalneIObiektrowe));

        Mateusz_Pietrych = new Student("Mateusz", "Pietrych", "66666666666", 19, "M", "123456", matematyka, false, true, true, 1, "Matematyka Stosowana");
        Wiktor_Sadowy = new Student("Wiktor", "Sadowy", "77777777777", 20, "M", "123654", fizyka, false, true, true, 2, "Fizyka Jądrowa");
        Jakub_Oleszczuk = new Student("Jakub", "Oleszczuk", "88888888888", 21, "M", "123777", informatyka, false, false, true, 3, "Informatyka Stosowana");

        Listy.kursy = new ArrayList<>(Arrays.asList(analiza1, logika, algebra, fizyka1, termodynamika, wychowanieFizyczne, ProgramowanieStrukturalneIObiektrowe));
        Listy.osoby = new ArrayList<>(Arrays.asList(Szymon_Romanek, Rafal_Kruszyna, Piotr_Puchala, Jakub_Roszkowski, Natalia_Martynenko, Kamil_Herbetko, Malina_Lobocka, Mateusz_Pietrych, Wiktor_Sadowy, Jakub_Oleszczuk));
    }

}
