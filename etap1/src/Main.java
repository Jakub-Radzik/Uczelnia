import InterakcjaKonsola.*;
import Klasy.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    //STRATEGY DESIGN PATTER FOR ADDITION Students, Courses, Workers
    ZapisObiektu zapisObiektu;

    private ArrayList<Osoba> osoby;
    private ArrayList<Kurs> kursy;
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

    public ArrayList<Osoba> getOsoby() {
        return osoby;
    }

    public ArrayList<Kurs> getKursy() {
        return kursy;
    }

    public Main(){
        Szymon_Romanek = new Pracownik_Badawczo_Dydaktyczny("Szymon", "Romanek","000000000000", 30,"M","Wykladowca", 5,3000,5);
        Piotr_Puchala = new Pracownik_Badawczo_Dydaktyczny("Piotr", "Puchala","11111111111", 35,"M","Profesor Nadzwyczajny", 15,15000,22);
        Rafal_Kruszyna = new Pracownik_Badawczo_Dydaktyczny("Rafal", "Kruszyna","22222222222", 25,"M","Adiunkt", 5,5500,10);
        Jakub_Roszkowski = new Pracownik_Badawczo_Dydaktyczny("Jakub", "Roszkowski", "99999999999", 35, "M", "Profesor Nadzwyczajny", 20,16000, 30);

        Natalia_Martynenko = new Pracownik_Administracyjny("Natalia", "Martynenko","33333333333",28,"K","Starszy Specjalista", 10, 8500, 12);
        Kamil_Herbetko = new Pracownik_Administracyjny("Kamil", "Herbetko","44444444444",29,"M","Referent", 10, 9500, 6);
        Malina_Lobocka = new Pracownik_Administracyjny("Malina", "Lobocka","55555555555",32,"K","Specjalista", 5, 11500, 10);

        analiza1 = new Kurs("Analiza Matematyczna 1", Szymon_Romanek,5);
        logika = new Kurs("Logika", Rafal_Kruszyna,4);
        algebra = new Kurs("Algebra", Piotr_Puchala,6);
        fizyka1 = new Kurs("Fizyka 1", Szymon_Romanek,4);
        termodynamika = new Kurs("Termodynamika", Piotr_Puchala,5);
        wychowanieFizyczne = new Kurs("Wychowanie Fizyczne", Rafal_Kruszyna,0);
        ProgramowanieStrukturalneIObiektrowe = new Kurs("Programowanie Strukturalne i Obiektowe", Jakub_Roszkowski, 7);

        matematyka = new ArrayList<>(Arrays.asList(analiza1,algebra));
        fizyka = new ArrayList<>(Arrays.asList(fizyka1,termodynamika,wychowanieFizyczne,analiza1));
        informatyka = new ArrayList<>(Arrays.asList(fizyka1,logika,wychowanieFizyczne,analiza1, ProgramowanieStrukturalneIObiektrowe));

        Mateusz_Pietrych = new Student("Mateusz", "Pietrych", "66666666666", 19, "M","123456", matematyka, false, true, true ,1);
        Wiktor_Sadowy = new Student("Wiktor", "Sadowy", "77777777777", 20, "M","123654",fizyka, false, true, true ,2);
        Jakub_Oleszczuk = new Student("Jakub", "Oleszczuk", "88888888888", 21, "M","123777",informatyka, false, false, true ,3);

        kursy = new ArrayList<>(Arrays.asList(analiza1, logika, algebra, fizyka1,termodynamika, wychowanieFizyczne, ProgramowanieStrukturalneIObiektrowe));
        osoby = new ArrayList<>(Arrays.asList(Szymon_Romanek, Rafal_Kruszyna,Piotr_Puchala, Jakub_Roszkowski, Natalia_Martynenko, Kamil_Herbetko, Malina_Lobocka, Mateusz_Pietrych, Wiktor_Sadowy, Jakub_Oleszczuk));

    }

    public void realizacjap34(){

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

    public ZapisObiektu getZapisObiektu() {
        return zapisObiektu;
    }

    public void setZapisObiektu(ZapisObiektu zapisObiektu) {
        this.zapisObiektu = zapisObiektu;
    }

    public void menu(){
        System.out.println("WITAJ W MOJEJ UCZELNI");
        System.out.println("Co chcesz zrobić?");
        System.out.println("[1] - dodać kurs");
        System.out.println("[2] - dodać studenta");
        System.out.println("[3] - dodać pracownika administracji");
        System.out.println("[4] - dodać pracownika dydaktycznego");
    }

    public static void main(String[] args) throws InterruptedException {
        Main uczelnia = new Main();
//        uczelnia.realizacjap34();

        Scanner scanner = new Scanner(System.in);
        uczelnia.menu();
        int wybor = 0;
        do{
            System.out.println("Wybierz operacje:");
            try{
                wybor = scanner.nextInt();
            }catch(InputMismatchException ex){
                scanner.next();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }while (wybor<1 || wybor>4);

        switch (wybor) {
            case 1 -> {
                uczelnia.setZapisObiektu(new ZapisObiektuKurs());
                uczelnia.kursy.add((Kurs) uczelnia.zapisObiektu.saveObject());
                //W związku z kłopotami z odczytem listy pracowników, operacja wyboru prowadzącego jest wykonywana tutaj

                //prezentacja wyboru pracownika dydaktycznego
                AtomicInteger c = new AtomicInteger();
                uczelnia.osoby.stream()
                        .filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                        .forEach(osoba -> System.out.println("["+ (c.incrementAndGet()) + "]"+ " - "+osoba.getImie()+" "+osoba.getNazwisko()));

                wybor = 0;
                do{
                    System.out.println("Wybierz prowadzacego:");
                    try{
                        wybor = scanner.nextInt();
                    }catch (InputMismatchException ex){
                        scanner.next();
                    }

                }while (wybor<1 || wybor>c.get());

                c.set(0);
                for(Osoba osoba: uczelnia.osoby) {
                    if(osoba instanceof Pracownik_Badawczo_Dydaktyczny){
                        c.incrementAndGet();
                        if (c.get() == wybor){
                            uczelnia.kursy.get(uczelnia.kursy.size()-1).setProwadzacy((Pracownik_Badawczo_Dydaktyczny) osoba);
                        }
                    }

                }

                System.out.println(uczelnia.kursy.get(uczelnia.kursy.size()-1).toString());

            }
            case 2 -> {
                uczelnia.setZapisObiektu(new ZapisObiektuStudent());
                Thread.sleep(2);

                //Ustawiam podstawowe kursy dla studenta
                Student myStudent = (Student)uczelnia.zapisObiektu.saveObject();
                myStudent.setListaKursow(Arrays.asList(uczelnia.algebra, uczelnia.analiza1));

                ArrayList<String> indeksy = new ArrayList<>();
                for (Osoba osoba: uczelnia.osoby) {
                    if(osoba instanceof Student){
                        indeksy.add(((Student) osoba).getNumer_indeksu());
                    }
                }

                while (true){
                    String newIndeks = String.valueOf(new Random().nextInt(999999999));
                    if(!indeksy.contains(newIndeks)){
                        myStudent.setNumer_indeksu(newIndeks);
                        break;
                    }
                }
                uczelnia.osoby.add(myStudent);
                System.out.println(uczelnia.osoby.get(uczelnia.osoby.size()-1));


            }
            case 3 -> {
                uczelnia.setZapisObiektu(new ZapisObiektuPracownikAdministracji());
                uczelnia.osoby.add((Pracownik_Administracyjny) uczelnia.zapisObiektu.saveObject());
                Thread.sleep(2);
                System.out.println(uczelnia.osoby.get(uczelnia.osoby.size()-1));
            }
            case 4 -> {
                uczelnia.setZapisObiektu(new ZapisObiektuPracownikDydaktyczny());
                uczelnia.osoby.add((Pracownik_Badawczo_Dydaktyczny) uczelnia.zapisObiektu.saveObject());
                Thread.sleep(2);
                System.out.println(uczelnia.osoby.get(uczelnia.osoby.size()-1));
            }
            default -> System.out.println("coś poszło nie tak, dowiedz się co");
        }

//        uczelnia.kursy.forEach(System.out::println);

        scanner.close();



    }
}
