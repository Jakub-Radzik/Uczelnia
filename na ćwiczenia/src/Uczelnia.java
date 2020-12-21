import InterakcjaKonsola.*;
import Klasy.*;
import Serializacja.SerializacjaOsob;
import Sortowanie.NarzedziaSortowania;
import Struktury.Listy;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Uczelnia {
    //STRATEGY DESIGN PATTER FOR ADDITION Students, Courses, Workers
    ZapisObiektu zapisObiektu;
    public Uczelnia() {
        new Listy();
        new NarzedziaSortowania();
    }

    public void realizacjap34() {

        //REALIZACJA PUNKTU 3 - wszystkie metody
        System.out.println("REALIZACJA PUNKTU 3\n");

        System.out.println("\nWyszukiwanie osob po imieniu (Piotr) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzOsobyPoImieniu(Listy.osoby, "Piotr").forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po nazwisku (Oleszczuk) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzOsobyPoNazwisku(Listy.osoby, "Oleszczuk").forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stazu pracy mniejszym niz 10============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyMniejszymNiz(Listy.osoby, 10).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stazu pracy większym niz 10============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyWiekszymNiz(Listy.osoby, 10).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stazu pracy równym 5============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyRownym(Listy.osoby, 5).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin mniejszej niz 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachMniejszychNiz(Listy.osoby, 6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin wiekszej niz 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachWiekszychNiz(Listy.osoby, 6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin równej 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachRownych(Listy.osoby, 6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji wiekszej niz 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiWiekszejNiz(Listy.osoby, 15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji mniejszej niz 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiMniejszejNiz(Listy.osoby, 15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji rownej 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiRownej(Listy.osoby, 15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stanowisku (Adiunkt) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStanowisku(Listy.osoby, "Adiunkt").forEach(System.out::println);

        System.out.println("\nWyszukiwanie studenta po numerze indeksu (123456) ============================================================================\n");
        System.out.println(NarzedziaWyszukiwania.znajdzStudentaPoIndeksie(Listy.osoby, "123456"));

        System.out.println("\nWyszukiwanie studentów po roku studiów (1) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzStudentowPoRokuStudiow(Listy.osoby, 1).forEach(System.out::println);

        System.out.println("\nWyszukiwanie studentów po kierunku (Informatyka Stosowana) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzStudentowPoKierunku(Listy.osoby, "Informatyka Stosowana").forEach(System.out::println);

        System.out.println("\nWyszukiwanie kursu po nazwie (Analiza Matematyczna 1) ============================================================================\n");
        System.out.println(NarzedziaWyszukiwania.znajdzKursPoNazwie(Listy.kursy, "Analiza Matematyczna 1"));

        System.out.println("\nWyszukiwanie kursów po liczbie ects (5) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzKursyPoECTS(Listy.kursy, 5).forEach(System.out::println);

        System.out.println("\nWyszukiwanie kursów po prowadzacym+"+Listy.osoby.get(0).getImie()+" "+Listy.osoby.get(0).getNazwisko()+" ============================================================================\n");
        NarzedziaWyszukiwania.znajdzKursyPoProwadzacym(Listy.kursy, Listy.osoby.get(0)).forEach(System.out::println);


        //REALIZACJA PUNKTU 4
        System.out.println("=====================================================================================================================");
        System.out.println("REALIZACJA PUNKTU 4");
        System.out.println("=====================================================================================================================\n");
        System.out.println("Kursy:\n");
        for (Kurs kurs : Listy.kursy) {
            System.out.println(kurs.toString());
        }

        System.out.println("\nOsoby:\n");
        for (Osoba osoba : Listy.osoby) {
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

    public void menu() {
        System.out.println("____________________________________");
        System.out.println("\uD83C\uDF93 WITAJ W MOJEJ UCZELNI \uD83C\uDF93");
        System.out.println();
        System.out.println("[0] - zakończ");
        System.out.println("[1] - dodać kurs");
        System.out.println("[2] - dodać studenta");
        System.out.println("[3] - dodać pracownika administracji");
        System.out.println("[4] - dodać pracownika dydaktycznego");
        System.out.println("[5] - Operacje wyświetlania");
        System.out.println("[6] - Operacje serializacji");
        System.out.println("[7] - Operacje sortowania");
        System.out.println("____________________________________");
    }

    public static void startInteraction(Uczelnia uczelnia) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean breakTheLoop = false;
        while (true) {
            // Rozpoczynamy interakcje w menu
            // wybor przechowuje oznaczenie wyboru operacji
            int wybor = 0;
            uczelnia.menu();

        /*
            do-while wykona się co najmniej raz i więcej jeśli operacja będzie źle wybrana
            warunek w while obsługuje przypadki liczb całkowitych poza zakresem
            InputMismatchException działa w przypadku liczb nie całkowitych
         */
            do {
                System.out.println("Wybierz operacje:");
                try {
                    wybor = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    scanner.next();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } while (wybor < 0 || wybor > 7);
            switch (wybor) {
                case 0 -> {
                    breakTheLoop = true;
                }
                case 1 -> { // tworzenie nowego kursu
                    //Zmiana strategii i zapisanie kursu do tablicy z kursami
                    uczelnia.setZapisObiektu(new ZapisObiektuKurs());
                    Kurs nowyKurs = (Kurs) uczelnia.zapisObiektu.saveObject();
                    Listy.kursy.add(nowyKurs);
                    System.out.println(nowyKurs.toString());

                }
                case 2 -> { //Tworzenie nowego studenta
                    //Przełączenie strategii i zapis do tablicy
                    uczelnia.setZapisObiektu(new ZapisObiektuStudent());
                    Student nowyStudent = (Student) uczelnia.zapisObiektu.saveObject();
                    Listy.osoby.add(nowyStudent);
                    System.out.println("\nUTWORZONO NOWEGO STUDENTA:\n");
                    System.out.println(nowyStudent);
                }
                case 3 -> {//Tworzenie pracownika administracji
                    uczelnia.setZapisObiektu(new ZapisObiektuPracownikAdministracji());
                    Pracownik_Administracyjny nowyPracownik = (Pracownik_Administracyjny) uczelnia.zapisObiektu.saveObject();
                    Listy.osoby.add(nowyPracownik);
                    System.out.println("\nUTWORZONO NOWEGO PRACOWNIKA ADMINISTRACJI\n");
                    System.out.println(nowyPracownik);
                }
                case 4 -> {//Tworzenie pracownika dydaktycznego
                    uczelnia.setZapisObiektu(new ZapisObiektuPracownikDydaktyczny());
                    Pracownik_Badawczo_Dydaktyczny nowyPracownik = (Pracownik_Badawczo_Dydaktyczny) uczelnia.zapisObiektu.saveObject();
                    Listy.osoby.add(nowyPracownik);
                    System.out.println("\nUTWORZONO NOWEGO PRACOWNIKA NAUKOWO DYDAKTYCZNEGO\n");
                    System.out.println(nowyPracownik);
                }
                case 5 -> {
                    try {
                        uczelnia.searchTool(uczelnia);
                    } catch (Exception ex) {
                        System.out.println("Something wrong");
                    }
                }
                case 6 -> {
                    uczelnia.serialTool(uczelnia);
                }
                case 7 -> {
                    uczelnia.sortTool(uczelnia);
                }
            }

            if (breakTheLoop) {
                break;
            }
        }

        scanner.close();
    }

    public void searchTool(Uczelnia uczelnia) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("\nWYBIERZ OPCJE WYSZUKIWANIA:");
            System.out.println("[0] - WYJDŹ Z OPCJI WYSWIETLANIA");
            System.out.println("[1] - wyświetl wszystkie osoby");
            System.out.println("[2] - wyświetl wszystkie kursy");
            System.out.println("|====================| SZUKANIE OSÓB |====================|");
            System.out.println("[3] - wyświetl wszystkich studentów");
            System.out.println("[4] - wyświetl wszystkich pracowników uczelni");
            System.out.println("[5] - wyświetl wszystkich pracowników administracyjnych");
            System.out.println("[6] - wyświetl wszystkich pracowników naukowo dydaktycznych");
            System.out.println("[7] - wyświetl osoby po imieniu");
            System.out.println("[8] - wyświetl osoby po nazwisku");
            System.out.println("|====================| SZUKANIE PRACOWNIKÓW |====================|");
            System.out.println("[9] - wyświetl pracowników po stażu większym niż podany");
            System.out.println("[10] - wyświetl pracowników po stażu równym podanemu");
            System.out.println("[11] - wyświetl pracowników po stażu mniejszym niż podany");
            System.out.println("[12] - wyświetl pracowników po ilości nadgodzin mniejszej niż podane");
            System.out.println("[13] - wyświetl pracowników po ilości nadgodzin równej podanej");
            System.out.println("[14] - wyświetl pracowników po ilości nadgodzin większej niż podane");
            System.out.println("[15] - wyświetl pracowników po pensji mniejszej niż podana");
            System.out.println("[16] - wyświetl pracowników po pensji równej podanej");
            System.out.println("[17] - wyświetl pracowników po pensji większej niż podana");
            System.out.println("[18] - wyświetl osoby po zajmowanym stanowisku");
            System.out.println("|====================| SZUKANIE STUDENTÓW |====================|");
            System.out.println("[19] - wyświetl studenta po danym numerze indeksu");
            System.out.println("[20] - wyświetl studentów po danym roku studiów");
            System.out.println("[21] - wyświetl studentów po danym kierunku");
            System.out.println("|====================| SZUKANIE KURSÓW |====================|");
            System.out.println("[22] - wyświetl kursy po nazwie");
            System.out.println("[23] - wyświetl kursy po prowadzącym");
            System.out.println("[24] - wyświetl kursy po liczbie punktów ECTS");

            System.out.println();
            System.out.println("WYBIERZ OPERACJE:");
            switch (scanner.nextInt()) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    Listy.osoby.forEach(System.out::println);
                }
                case 2 -> {
                    Listy.kursy.forEach(System.out::println);
                }
                case 3 -> {
                    Listy.osoby.stream().filter(osoba -> osoba instanceof Student)
                            .forEach(System.out::println);
                }
                case 4 -> {
                    Listy.osoby.stream().filter(osoba -> osoba instanceof Pracownik_Uczelni)
                            .forEach(System.out::println);
                }
                case 5 -> {
                    Listy.osoby.stream().filter(osoba -> osoba instanceof Pracownik_Administracyjny)
                            .forEach(System.out::println);
                }
                case 6 -> {
                    Listy.osoby.stream().filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                            .forEach(System.out::println);
                }
                //IMIE
                case 7 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadz imię:");
                    NarzedziaWyszukiwania.znajdzOsobyPoImieniu(Listy.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //NAZWISKO
                case 8 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadz nazwisko:");
                    NarzedziaWyszukiwania.znajdzOsobyPoNazwisku(Listy.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //STAŻ PRACY
                case 9 -> {
                    System.out.println("Wprowadz staż pracy:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyWiekszymNiz(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 10 -> {
                    System.out.println("Wprowadz staż pracy:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyRownym(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 11 -> {
                    System.out.println("Wprowadz staż pracy:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyMniejszymNiz(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                //NADGODZINY
                case 12 -> {
                    System.out.println("Wprowadz ilość nadgodzin:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachMniejszychNiz(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 13 -> {
                    System.out.println("Wprowadz ilość nadgodzin:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachRownych(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 14 -> {
                    System.out.println("Wprowadz ilość nadgodzin:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachWiekszychNiz(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                //PENSJA
                case 15 -> {
                    System.out.println("Wprowadz pensję:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoPensjiMniejszejNiz(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 16 -> {
                    System.out.println("Wprowadz pensję:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoPensjiRownej(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 17 -> {
                    System.out.println("Wprowadz pensję:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoPensjiWiekszejNiz(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                //STANOWISKO
                case 18 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadz stanowisko:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStanowisku(Listy.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //STUDENCI
                case 19 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadz numer indeksu:");
                    Student student = NarzedziaWyszukiwania.znajdzStudentaPoIndeksie(Listy.osoby, scanner.nextLine());
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("\nNIE ZNALEZIONO STUDENTA\n");
                    }
                }
                case 20 -> {
                    System.out.println("Wprowadz numer roku:");
                    NarzedziaWyszukiwania.znajdzStudentowPoRokuStudiow(Listy.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 21 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadz nazwę kierunku:");
                    NarzedziaWyszukiwania.znajdzStudentowPoKierunku(Listy.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //KURS
                case 22 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadz nazwę:");
                    Kurs kurs = NarzedziaWyszukiwania.znajdzKursPoNazwie(Listy.kursy, scanner.nextLine());
                    if (kurs != null) {
                        System.out.println(kurs);
                    } else {
                        System.out.println("\nNIE ZNALEZIONO KURSU\n");
                    }
                }
                case 23 -> {
                    int wybor = -1;
                    AtomicInteger counter = new AtomicInteger(0);
                    Listy.osoby.stream()
                            .filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                            .forEach(osoba -> System.out.println("[" + counter.incrementAndGet() + "] - " + osoba.getImie() + " " + osoba.getNazwisko()));

                    do {
                        System.out.println("WYBIERZ PROWADZĄCEGO:");
                        try {
                            wybor = scanner.nextInt();
                        } catch (InputMismatchException ex) {
                            scanner.next();
                        }

                    } while (wybor < 1 || wybor > counter.get());

                    int c = 0;
                    for (Osoba osoba : Listy.osoby) {
                        if (osoba instanceof Pracownik_Badawczo_Dydaktyczny) {
                            c++;
                            if (c == wybor) {
                                NarzedziaWyszukiwania.znajdzKursyPoProwadzacym(Listy.kursy, (Pracownik_Badawczo_Dydaktyczny) osoba).forEach(System.out::println);
                            }
                        }
                    }

                }
                case 24 -> {
                    System.out.println("Wprowadz liczbę punktów ECTS:");
                    NarzedziaWyszukiwania.znajdzKursyPoECTS(Listy.kursy, scanner.nextInt()).forEach(System.out::println);
                }

            }
            Thread.sleep(2000);
        }
    }

    public void serialTool(Uczelnia uczelnia) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("\nWYBIERZ OPCJE SERIALIZACJI:");
            System.out.println("[0] - WYJDŹ Z OPCJI SERIALIZACJI");
            System.out.println("[1] - serializuj osoby");
            System.out.println("[2] - wczytaj osoby");
            System.out.println("[3] - serializuj kursy");
            System.out.println("[4] - wczytaj kursy");
            System.out.println();

            switch (scanner.nextInt()) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    SerializacjaOsob.serializacja(Listy.osoby, "Osoby.ser");
                }
                case 2 -> {
                    if (SerializacjaOsob.deserializacja(Listy.osoby, "Osoby.ser") != null) {
                        Listy.osoby = SerializacjaOsob.deserializacja(Listy.osoby, "Osoby.ser");
                    } else {
                        System.out.println("Wystąpił problem w czasie odczytu osób");
                    }
                }
                case 3 -> {
                    SerializacjaOsob.serializacja(Listy.kursy, "Kursy.ser");
                }
                case 4 -> {
                    if (SerializacjaOsob.deserializacja(Listy.kursy, "Kursy.ser") != null) {
                        Listy.kursy = SerializacjaOsob.deserializacja(Listy.kursy, "Kursy.ser");
                    } else {
                        System.out.println("Wystąpił problem w czasie odczytu kursów");
                    }
                }
            }
        }
    }

    public void sortTool(Uczelnia uczelnia) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("\nWYBIERZ OPCJE SORTOWANIA:");
            System.out.println("[0] - WYJDŹ Z OPCJI SORTOWANIA");
            System.out.println("[1] - sortuj osoby po imieniu");
            System.out.println("[2] - sortuj osoby po nazwisku");
            System.out.println("[3] - sortuj osoby po nazwisku i imieniu");
            System.out.println("[4] - sortuj osoby po wieku");
            System.out.println("[5] - sortuj pracowników po zarobkach");
            System.out.println("[6] - sortuj pracowników po stażu pracy");
            System.out.println("[7] - sortuj po nazwach kursów dla wybranego studenta po indeksie");
            System.out.println("[8] - sortuj osoby po nazwisku i wieku\n");

            switch (scanner.nextInt()) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    Listy.osoby.sort(NarzedziaSortowania.getComparatorImie());
                    sortToolConfirmSortAndDisplayOsoby(Listy.osoby);
                }
                case 2 -> {
                    Listy.osoby.sort(NarzedziaSortowania.getComparatorNazwisko());
                    sortToolConfirmSortAndDisplayOsoby(Listy.osoby);
                }
                case 3 -> {
                    Listy.osoby.sort(NarzedziaSortowania.getComparatorNazwiskoImie());
                    sortToolConfirmSortAndDisplayOsoby(Listy.osoby);
                }
                case 4 -> {
                    Listy.osoby.sort(NarzedziaSortowania.getComparatorWiek());
                    sortToolConfirmSortAndDisplayOsoby(Listy.osoby);
                }
                case 5 -> {
                    ArrayList<Pracownik_Uczelni> pracownicy = generateWorkersArray(Listy.osoby);
                    pracownicy.sort(NarzedziaSortowania.getComparatorPensja());
                    pracownicy.forEach(System.out::println);
                }
                case 6 -> {
                    ArrayList<Pracownik_Uczelni> pracownicy = generateWorkersArray(Listy.osoby);
                    pracownicy.sort(NarzedziaSortowania.getComparatorStaz());
                    pracownicy.forEach(System.out::println);
                }
                case 7 -> {
                    scanner.nextLine();
                    System.out.println("Wprowadź indeks studenta:");
                    String index = scanner.nextLine();
                    Student student = NarzedziaWyszukiwania.znajdzStudentaPoIndeksie(Listy.osoby, index);
                    if (student == null) {
                        System.out.println("NIE ZNALEZIONO STUDENTA");
                    } else {
                        student.getListaKursow().sort(NarzedziaSortowania.getComparatorKursy());
                        System.out.println(student);
                    }
                }
                case 8 -> {
                    Listy.osoby.sort(NarzedziaSortowania.getComparatorNazwiskoWiek());
                    sortToolConfirmSortAndDisplayOsoby(Listy.osoby);
                }
            }


        }
    }

    private void sortToolConfirmSortAndDisplayOsoby(ArrayList<Osoba> lista) throws InterruptedException {
        System.out.println("KOLECKCJA ZOSTALA POSORTOWANA\n");
        System.out.println("WYGLĄD FRAGMENTU KOLEKCJI PO SORTOWANIU:\n");
        if (lista.size() < 5) {
            lista.forEach(System.out::println);
        } else {
            int counter = 0;
            {
                while (counter != 5) {
                    System.out.println(lista.get(counter).getImie() + " " + lista.get(counter).getNazwisko() + " " + lista.get(counter).getWiek());
                    counter++;
                }
            }
        }
        Thread.sleep(500);
        System.out.println("\n");
    }

    private ArrayList<Pracownik_Uczelni> generateWorkersArray(ArrayList<Osoba> lista) {
        ArrayList<Pracownik_Uczelni> pracownicy = new ArrayList<Pracownik_Uczelni>();
        for (Osoba osoba : lista) {
            if (osoba instanceof Pracownik_Uczelni) {
                pracownicy.add((Pracownik_Uczelni) osoba);
            }
        }
        return pracownicy;
    }






    public static void main(String[] args) {
        Uczelnia uczelnia = new Uczelnia();
        try {
            startInteraction(uczelnia);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


    }
}


