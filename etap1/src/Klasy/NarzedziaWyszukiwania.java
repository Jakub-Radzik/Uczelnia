package Klasy;

import java.util.ArrayList;

public class NarzedziaWyszukiwania {

    //Znajdowanie Pracownika lub Studenta po imieniu i nazwisku
    public static ArrayList<Osoba> znajdzOsobyPoImieniu(ArrayList<Osoba> osoby, String imie) {
        ArrayList<Osoba> zwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getImie().equals(imie)) {
                zwrot.add(osoba);
            }
        }
        return zwrot;
    }

    public static ArrayList<Osoba> znajdzOsobyPoNazwisku(ArrayList<Osoba> osoby, String nazwisko) {
        ArrayList<Osoba> zwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getNazwisko().equals(nazwisko)) {
                zwrot.add(osoba);
            }
        }
        return zwrot;
    }

    //PRACOWNICY
    //STAŻ
    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoStazuPracyWiekszymNiz(ArrayList<Osoba> pracownicyUczelni, int staz) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : pracownicyUczelni) {
            if (osoba instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) osoba).getStazPracy() > staz) {
                pracownicyZwrot.add((Pracownik_Uczelni) osoba);
            }
        }
        return pracownicyZwrot;
    }

    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoStazuPracyMniejszymNiz(ArrayList<Osoba> pracownicyUczelni, int staz) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : pracownicyUczelni) {
            if (osoba instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) osoba).getStazPracy() < staz) {
                pracownicyZwrot.add((Pracownik_Uczelni) osoba);
            }
        }
        return pracownicyZwrot;
    }

    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoStazuPracyRownym(ArrayList<Osoba> pracownicyUczelni, int staz) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : pracownicyUczelni) {
            if (osoba instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) osoba).getStazPracy() == staz) {
                pracownicyZwrot.add((Pracownik_Uczelni) osoba);
            }
        }
        return pracownicyZwrot;
    }

    //NADGODZINY
    public static ArrayList<Pracownik_Administracyjny> znajdzPracownikowPoNadgodzinachWiekszychNiz(ArrayList<Osoba> osoby, int nadgodzin) {
        ArrayList<Pracownik_Administracyjny> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba instanceof Pracownik_Administracyjny && ((Pracownik_Administracyjny) osoba).getLiczba_nadgodzin() > nadgodzin) {
                pracownicyZwrot.add((Pracownik_Administracyjny) osoba);
            }
        }
        return pracownicyZwrot;
    }

    public static ArrayList<Pracownik_Administracyjny> znajdzPracownikowPoNadgodzinachMniejszychNiz(ArrayList<Osoba> osoby, int nadgodzin) {
        ArrayList<Pracownik_Administracyjny> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba instanceof Pracownik_Administracyjny && ((Pracownik_Administracyjny) osoba).getLiczba_nadgodzin() < nadgodzin) {
                pracownicyZwrot.add((Pracownik_Administracyjny) osoba);
            }
        }
        return pracownicyZwrot;
    }

    public static ArrayList<Pracownik_Administracyjny> znajdzPracownikowPoNadgodzinachRownych(ArrayList<Osoba> osoby, int nadgodzin) {
        ArrayList<Pracownik_Administracyjny> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba instanceof Pracownik_Administracyjny && ((Pracownik_Administracyjny) osoba).getLiczba_nadgodzin() == nadgodzin) {
                pracownicyZwrot.add((Pracownik_Administracyjny) osoba);
            }
        }
        return pracownicyZwrot;
    }

    //PENSJA
    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoPensjiWiekszejNiz(ArrayList<Osoba> osoby, int pensja) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba pracownik : osoby) {
            if (pracownik instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) pracownik).getPensja() > pensja) {
                pracownicyZwrot.add((Pracownik_Uczelni) pracownik);
            }
        }
        return pracownicyZwrot;
    }

    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoPensjiMniejszejNiz(ArrayList<Osoba> osoby, int pensja) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba pracownik : osoby) {
            if (pracownik instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) pracownik).getPensja() < pensja) {
                pracownicyZwrot.add((Pracownik_Uczelni) pracownik);
            }
        }
        return pracownicyZwrot;
    }

    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoPensjiRownej(ArrayList<Osoba> osoby, int pensja) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba pracownik : osoby) {
            if (pracownik instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) pracownik).getPensja() == pensja) {
                pracownicyZwrot.add((Pracownik_Uczelni) pracownik);
            }
        }
        return pracownicyZwrot;
    }

    //STANOWISKO
    public static ArrayList<Pracownik_Uczelni> znajdzPracownikowPoStanowisku(ArrayList<Osoba> osoby, String stanowisko) {
        ArrayList<Pracownik_Uczelni> pracownicyZwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba instanceof Pracownik_Uczelni && ((Pracownik_Uczelni) osoba).getStanowisko().toLowerCase().equals(stanowisko.toLowerCase())) {
                pracownicyZwrot.add((Pracownik_Uczelni) osoba);
            }
        }
        return pracownicyZwrot;
    }

    //STDUENCI
    //NUMER INDEKSU
    public static Student znajdzStudentaPoIndeksie(ArrayList<Osoba> osoby, String indeks) {
        for (Osoba osoba : osoby) {
            if (osoba instanceof Student && ((Student) osoba).getNumer_indeksu().equals(indeks)) {
                return (Student) osoba;
            }
        }
        return null;
    }

    //Rok
    public static ArrayList<Student> znajdzStudentowPoRokuStudiow(ArrayList<Osoba> osoby, int rok) {
        ArrayList<Student> zwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba instanceof Student && ((Student) osoba).getRokStudiow() == rok) {
                zwrot.add((Student) osoba);
            }
        }
        return zwrot;
    }
    //Kierunek
    public static ArrayList<Student> znajdzStudentowPoKierunku(ArrayList<Osoba> osoby, String kierunek) {
        ArrayList<Student> zwrot = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba instanceof Student && ((Student) osoba).getKierunek().toLowerCase().equals(kierunek.toLowerCase())) {
                zwrot.add((Student) osoba);
            }
        }
        return zwrot;
    }

    //KURS

    public static Kurs znajdzKursPoNazwie(ArrayList<Kurs> kursy, String nazwa) {
        for (Kurs kurs : kursy) {
            if (kurs.getNazwaKursu().toLowerCase().equals(nazwa.toLowerCase())) {
                return kurs;
            }
        }
        return null;
    }

    public static ArrayList<Kurs> znajdzKursyPoProwadzacym(ArrayList<Kurs> kursy, Osoba prowadzadcy) {
        ArrayList<Kurs> zwrot = new ArrayList<>();
        for (Kurs kurs : kursy) {
            if (kurs.getProwadzacy().equals(prowadzadcy)) {
                zwrot.add(kurs);
            }
        }
        return zwrot;
    }

    public static ArrayList<Kurs> znajdzKursyPoECTS(ArrayList<Kurs> kursy, int ects) {
        ArrayList<Kurs> zwrot = new ArrayList<>();
        for (Kurs kurs : kursy) {
            if (kurs.getEcts() == ects) {
                zwrot.add(kurs);
            }
        }
        return zwrot;
    }

}
