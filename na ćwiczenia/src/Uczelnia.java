import InterakcjaKonsola.*;
import Klasy.*;
import Serializacja.SerializacjaOsob;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Uczelnia {
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

    public Uczelnia() {
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

        kursy = new ArrayList<>(Arrays.asList(analiza1, logika, algebra, fizyka1, termodynamika, wychowanieFizyczne, ProgramowanieStrukturalneIObiektrowe));
        osoby = new ArrayList<>(Arrays.asList(Szymon_Romanek, Rafal_Kruszyna, Piotr_Puchala, Jakub_Roszkowski, Natalia_Martynenko, Kamil_Herbetko, Malina_Lobocka, Mateusz_Pietrych, Wiktor_Sadowy, Jakub_Oleszczuk));

    }

    public void realizacjap34() {

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
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachMniejszychNiz(osoby, 6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin wiekszej niz 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachWiekszychNiz(osoby, 6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po liczbie nadgodzin równej 6 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachRownych(osoby, 6).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji wiekszej niz 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiWiekszejNiz(osoby, 15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji mniejszej niz 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiMniejszejNiz(osoby, 15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po pensji rownej 15000 ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoPensjiRownej(osoby, 15000).forEach(System.out::println);

        System.out.println("\nWyszukiwanie osob po stanowisku (Adiunkt) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzPracownikowPoStanowisku(osoby, "Adiunkt").forEach(System.out::println);

        System.out.println("\nWyszukiwanie studenta po numerze indeksu (123456) ============================================================================\n");
        System.out.println(NarzedziaWyszukiwania.znajdzStudentaPoIndeksie(osoby, "123456"));

        System.out.println("\nWyszukiwanie studentów po roku studiów (1) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzStudentowPoRokuStudiow(osoby, 1).forEach(System.out::println);

        System.out.println("\nWyszukiwanie studentów po kierunku (Informatyka Stosowana) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzStudentowPoKierunku(osoby, "Informatyka Stosowana").forEach(System.out::println);

        System.out.println("\nWyszukiwanie kursu po nazwie (Analiza Matematyczna 1) ============================================================================\n");
        System.out.println(NarzedziaWyszukiwania.znajdzKursPoNazwie(kursy, "Analiza Matematyczna 1"));

        System.out.println("\nWyszukiwanie kursów po liczbie ects (5) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzKursyPoECTS(kursy, 5).forEach(System.out::println);

        System.out.println("\nWyszukiwanie kursów po prowadzacym (Rafał Kruszyna) ============================================================================\n");
        NarzedziaWyszukiwania.znajdzKursyPoProwadzacym(kursy, Rafal_Kruszyna).forEach(System.out::println);


        //REALIZACJA PUNKTU 4
        System.out.println("=====================================================================================================================");
        System.out.println("REALIZACJA PUNKTU 4");
        System.out.println("=====================================================================================================================\n");
        System.out.println("Kursy:\n");
        for (Kurs kurs : kursy) {
            System.out.println(kurs.toString());
        }

        System.out.println("\nOsoby:\n");
        for (Osoba osoba : osoby) {
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
        System.out.println("____________________________________");
    }

    public static void startInteraction(Uczelnia uczelnia) {
        Scanner scanner = new Scanner(System.in);
        boolean breakTheLoop = false;
        while(true){
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
            } while (wybor < 0 || wybor > 6);
            switch (wybor) {
                case 0 -> {
                    breakTheLoop = true;
                }
                case 1 -> { // tworzenie nowego kursu
                    //Zmiana strategii i zapisanie kursu do tablicy z kursami
                    uczelnia.setZapisObiektu(new ZapisObiektuKurs());
                    uczelnia.kursy.add((Kurs) uczelnia.zapisObiektu.saveObject());

                    //W związku z kłopotami z odczytem listy pracowników, operacja wyboru prowadzącego jest wykonywana tutaj
                    //prezentacja wyboru pracownika dydaktycznego
                    //AtomicInteger potrzebny gdyż z każdym wyswietleniem osoby inkrementuję i zwracam numer
                    AtomicInteger c = new AtomicInteger();
                    System.out.println("[0] - Utwórz nowego prowadzącego");
                    uczelnia.osoby.stream()
                            .filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                            .forEach(osoba -> System.out.println("[" + (c.incrementAndGet()) + "] - " + osoba.getImie() + " " + osoba.getNazwisko()));

                    // poprawny jest wybor całkowity od 0 do ilosci prowadzacych
                    // -1 nie jest poprawne i w tym przypadku znowu obslugujemy błędy wejścia
                    wybor = -1;
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
                        uczelnia.setZapisObiektu(new ZapisObiektuPracownikDydaktyczny());       //Przełączenie strategii na utworzenie nowego pracownika dydaktycznego
                        uczelnia.osoby.add((Pracownik_Badawczo_Dydaktyczny) uczelnia.zapisObiektu.saveObject());    //Po utworzeniu pracownika zapisanie go na koncu tablicy osob
                        System.out.println("NOWY PROWADZĄCY:============================================");
                        System.out.println(uczelnia.osoby.get(uczelnia.osoby.size() - 1));    //Nowy prowadzący jest na koncu
                        System.out.println("NOWY KURS:==================================================");
                        uczelnia.kursy.get(uczelnia.kursy.size() - 1).setProwadzacy((Pracownik_Badawczo_Dydaktyczny) uczelnia.osoby.get(uczelnia.osoby.size() - 1));
                        //nowy utworzony kurs jest na koncu tablicy kursów - bierzemy go i przypisujemy mu ostatniego pracownika z zapisanych czyli nowego pracownika

                    } else { // przypisanie istniejącego prowadzącego
                        c.set(0);
                        for (Osoba osoba : uczelnia.osoby) {
                            if (osoba instanceof Pracownik_Badawczo_Dydaktyczny) {
                                c.incrementAndGet();
                                if (c.get() == wybor) {
                                    uczelnia.kursy.get(uczelnia.kursy.size() - 1).setProwadzacy((Pracownik_Badawczo_Dydaktyczny) osoba);
                                }
                            }
                        }
                    }
                    System.out.println(uczelnia.kursy.get(uczelnia.kursy.size() - 1).toString());

                }
                case 2 -> { //Tworzenie nowego studenta
                    //Przełączenie strategii i zapis do tablicy
                    uczelnia.setZapisObiektu(new ZapisObiektuStudent());
                    Student myStudent = (Student) uczelnia.zapisObiektu.saveObject();
//                    Student myStudent = new Student();      //tymczasowo
                    //MENU WYBORU KURSÓW:

                    AtomicInteger c = new AtomicInteger(0);

                    ArrayList<Kurs> kursyDoWyboru = new ArrayList<Kurs>(uczelnia.kursy);

                    System.out.println("\nDomyślnie student został zapisany na analizę 1 i algebrę\n");
                    myStudent.appendCourse(uczelnia.algebra);
                    myStudent.appendCourse(uczelnia.analiza1);

                    while (true){
                        c.set(0);
                        if(myStudent.getListaKursow()!=null){
                            kursyDoWyboru.removeAll(myStudent.getListaKursow());
                        }


                        System.out.println("WYBIERZ KURS DO PRZYPISANIA STUDENTOWI:");
                        System.out.println("[0] - ZAKONCZ");
                        kursyDoWyboru.forEach(kurs -> System.out.println("["+c.incrementAndGet()+"] - "+kurs.getNazwaKursu()));

                        wybor = -1;
                        do {
                            System.out.println("Wybierz kurs do przypisania:");
                            try {
                                wybor = scanner.nextInt();
                            } catch (InputMismatchException ex) {
                                scanner.next();
                            }

                        } while (wybor < 0 || wybor > kursyDoWyboru.size());

                        if(wybor!=0){
                            myStudent.appendCourse(kursyDoWyboru.get(wybor-1));
                        }else{
                            break;
                        }
                    }

                    //Tworzymy tablice z istniejącymi indeksami
                    ArrayList<String> indeksy = new ArrayList<>();
                    for (Osoba osoba : uczelnia.osoby) {
                        if (osoba instanceof Student) {
                            indeksy.add(((Student) osoba).getNumer_indeksu());
                        }
                    }

                    //Dopoki nowy indeks nie jest unikalny generujemy nowy
                    while (true) {
                        String newIndeks = String.valueOf(new Random().nextInt(999999999));
                        if (!indeksy.contains(newIndeks)) {
                            myStudent.setNumer_indeksu(newIndeks);
                            break;
                        }
                    }
                    uczelnia.osoby.add(myStudent);
                    System.out.println("\nUTWORZONO NOWEGO STUDENTA:\n");
                    System.out.println(uczelnia.osoby.get(uczelnia.osoby.size() - 1));


                }
                case 3 -> {//Tworzenie pracownika administracji
                    uczelnia.setZapisObiektu(new ZapisObiektuPracownikAdministracji());
                    uczelnia.osoby.add((Pracownik_Administracyjny) uczelnia.zapisObiektu.saveObject());
                    System.out.println("\nUTWORZONO NOWEGO PRACOWNIKA ADMINISTRACJI\n");
                    System.out.println(uczelnia.osoby.get(uczelnia.osoby.size() - 1));
                }
                case 4 -> {//Tworzenie pracownika dydaktycznego
                    uczelnia.setZapisObiektu(new ZapisObiektuPracownikDydaktyczny());
                    uczelnia.osoby.add((Pracownik_Badawczo_Dydaktyczny) uczelnia.zapisObiektu.saveObject());
                    System.out.println("\nUTWORZONO NOWEGO PRACOWNIKA NAUKOWO DYDAKTYCZNEGO\n");
                    System.out.println(uczelnia.osoby.get(uczelnia.osoby.size() - 1));
                }
                case 5 -> {
                    try {
                        uczelnia.searchTool(uczelnia);
                    }catch (Exception ex){
                        System.out.println("Something wrong");
                    }
                }
                case 6 ->{
                    uczelnia.serialTool(uczelnia);
                }
            }

            if (breakTheLoop){
                break;
            }
        }

        scanner.close();
    }

    public void searchTool(Uczelnia uczelnia) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while(true){

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
            switch(scanner.nextInt()){
                case 0 ->{
                    return;
                }
                case 1 ->{
                    uczelnia.osoby.forEach(System.out::println);
                }
                case 2 ->{
                    uczelnia.kursy.forEach(System.out::println);
                }
                case 3 -> {
                    uczelnia.osoby.stream().filter(osoba -> osoba instanceof Student)
                            .forEach(System.out::println);
                }
                case 4 ->{
                    uczelnia.osoby.stream().filter(osoba -> osoba instanceof Pracownik_Uczelni)
                            .forEach(System.out::println);
                }
                case 5 ->{
                    uczelnia.osoby.stream().filter(osoba -> osoba instanceof Pracownik_Administracyjny)
                            .forEach(System.out::println);
                }
                case 6 ->{
                    uczelnia.osoby.stream().filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                            .forEach(System.out::println);}
                //IMIE
                case 7 ->{
                    scanner.nextLine();
                    System.out.println("Wprowadz imię:");
                    NarzedziaWyszukiwania.znajdzOsobyPoImieniu(uczelnia.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //NAZWISKO
                case 8 ->{
                    scanner.nextLine();
                    System.out.println("Wprowadz nazwisko:");
                    NarzedziaWyszukiwania.znajdzOsobyPoNazwisku(uczelnia.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //STAŻ PRACY
                case 9 ->{
                    System.out.println("Wprowadz staż pracy:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyWiekszymNiz(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 10 ->{
                    System.out.println("Wprowadz staż pracy:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyRownym(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 11 ->{
                    System.out.println("Wprowadz staż pracy:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStazuPracyMniejszymNiz(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                //NADGODZINY
                case 12 ->{
                    System.out.println("Wprowadz ilość nadgodzin:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachMniejszychNiz(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 13 ->{
                    System.out.println("Wprowadz ilość nadgodzin:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachRownych(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 14 ->{
                    System.out.println("Wprowadz ilość nadgodzin:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoNadgodzinachWiekszychNiz(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                //PENSJA
                case 15 ->{
                    System.out.println("Wprowadz pensję:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoPensjiMniejszejNiz(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 16 ->{
                    System.out.println("Wprowadz pensję:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoPensjiRownej(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 17 ->{
                    System.out.println("Wprowadz pensję:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoPensjiWiekszejNiz(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                //STANOWISKO
                case 18 ->{
                    scanner.nextLine();
                    System.out.println("Wprowadz stanowisko:");
                    NarzedziaWyszukiwania.znajdzPracownikowPoStanowisku(uczelnia.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //STUDENCI
                case 19 ->{
                    scanner.nextLine();
                    System.out.println("Wprowadz numer indeksu:");
                    Student student = NarzedziaWyszukiwania.znajdzStudentaPoIndeksie(uczelnia.osoby, scanner.nextLine());
                    if(student!=null){
                        System.out.println(student);
                    }else{
                        System.out.println("\nNIE ZNALEZIONO STUDENTA\n");
                    }
                }
                case 20 ->{
                    System.out.println("Wprowadz numer roku:");
                    NarzedziaWyszukiwania.znajdzStudentowPoRokuStudiow(uczelnia.osoby, scanner.nextInt()).forEach(System.out::println);
                }
                case 21 ->{
                    scanner.nextLine();
                    System.out.println("Wprowadz nazwę kierunku:");
                    NarzedziaWyszukiwania.znajdzStudentowPoKierunku(uczelnia.osoby, scanner.nextLine()).forEach(System.out::println);
                }
                //KURS
                case 22 ->{
                    scanner.nextLine();
                    System.out.println("Wprowadz nazwę:");
                    Kurs kurs = NarzedziaWyszukiwania.znajdzKursPoNazwie(uczelnia.kursy, scanner.nextLine());
                    if (kurs != null){
                        System.out.println(kurs);
                    }else {
                        System.out.println("\nNIE ZNALEZIONO KURSU\n");
                    }
                }
                case 23 ->{
                    int wybor =-1;
                    AtomicInteger counter = new AtomicInteger(0);
                    uczelnia.osoby.stream()
                            .filter(osoba -> osoba instanceof Pracownik_Badawczo_Dydaktyczny)
                            .forEach(osoba -> System.out.println("["+counter.incrementAndGet()+"] - "+osoba.getImie()+" "+ osoba.getNazwisko()));

                    do {
                        System.out.println("WYBIERZ PROWADZĄCEGO:");
                        try {
                            wybor = scanner.nextInt();
                        } catch (InputMismatchException ex) {
                            scanner.next();
                        }

                    } while (wybor < 1 || wybor > counter.get());

                    int c = 0;
                    for (Osoba osoba : uczelnia.osoby) {
                        if (osoba instanceof Pracownik_Badawczo_Dydaktyczny) {
                            c++;
                            if (c == wybor) {
                                NarzedziaWyszukiwania.znajdzKursyPoProwadzacym(uczelnia.kursy, (Pracownik_Badawczo_Dydaktyczny) osoba).forEach(System.out::println);
                            }
                        }
                    }

                }
                case 24 ->{
                    System.out.println("Wprowadz liczbę punktów ECTS:");
                    NarzedziaWyszukiwania.znajdzKursyPoECTS(uczelnia.kursy, scanner.nextInt()).forEach(System.out::println);
                }

            }
            Thread.sleep(2000);
        }
    }

    public void serialTool(Uczelnia uczelnia){
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("\nWYBIERZ OPCJE WYSZUKIWANIA:");
            System.out.println("[0] - WYJDŹ Z OPCJI SERIALIZACJI");
            System.out.println("[1] - serializuj osoby");
            System.out.println("[2] - wyświetl osoby z pliku po deserializacji");
            System.out.println("[3] - serializuj kursy");
            System.out.println("[4] - wyświetl kursy z pliku po deserializacji");
            System.out.println();

            switch(scanner.nextInt()){
                case 0 ->{
                    return;
                }
                case 1 ->{
                    SerializacjaOsob.serializacja(uczelnia.osoby, "Osoby.ser");
                }
                case 2 ->{
                    if(SerializacjaOsob.deserializacja(uczelnia.osoby,"Osoby.ser")!=null){
                        uczelnia.osoby = SerializacjaOsob.deserializacja(uczelnia.osoby,"Osoby.ser");
                    }else{
                        System.out.println("Wystąpił problem w czasie odczytu osób");
                    }
                }
                case 3 ->{
                    SerializacjaOsob.serializacja(uczelnia.kursy, "Kursy.ser");
                }
                case 4 ->{
                    if(SerializacjaOsob.deserializacja(uczelnia.kursy,"Kursy.ser")!=null){
                        uczelnia.kursy = SerializacjaOsob.deserializacja(uczelnia.kursy,"Kursy.ser");
                    }else{
                        System.out.println("Wystąpił problem w czasie odczytu kursów");
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Uczelnia uczelnia = new Uczelnia();
        startInteraction(uczelnia);
    }
}


