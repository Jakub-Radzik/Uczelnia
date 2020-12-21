package Sortowanie;

import Klasy.Kurs;
import Klasy.Osoba;
import Klasy.Pracownik_Uczelni;

import java.util.Comparator;

public class NarzedziaSortowania {
    private static OsobaCompareImie ComparatorImie;
    private static OsobaCompareNazwisko ComparatorNazwisko;
    private static OsobaCompareNazwiskoImie ComparatorNazwiskoImie;
    private static OsobaCompareWiek ComparatorWiek;
    private static PracownikComparePensja ComparatorPensja;
    private static PracownikCompareStaz ComparatorStaz;
    private static StudentCompareKursy ComparatorKursy;
    private static OsobaCompareNazwiskoWiek ComparatorNazwiskoWiek;

    public NarzedziaSortowania() {
        createComparators();
    }

    public static OsobaCompareImie getComparatorImie() {
        return ComparatorImie;
    }

    public static OsobaCompareNazwisko getComparatorNazwisko() {
        return ComparatorNazwisko;
    }

    public static OsobaCompareNazwiskoImie getComparatorNazwiskoImie() {
        return ComparatorNazwiskoImie;
    }

    public static OsobaCompareWiek getComparatorWiek() {
        return ComparatorWiek;
    }

    public static PracownikComparePensja getComparatorPensja() {
        return ComparatorPensja;
    }

    public static PracownikCompareStaz getComparatorStaz() {
        return ComparatorStaz;
    }

    public static StudentCompareKursy getComparatorKursy() {
        return ComparatorKursy;
    }

    public static OsobaCompareNazwiskoWiek getComparatorNazwiskoWiek() {
        return ComparatorNazwiskoWiek;
    }

    private void createComparators() {
        ComparatorImie = new OsobaCompareImie();
        ComparatorNazwisko = new OsobaCompareNazwisko();
        ComparatorNazwiskoImie = new OsobaCompareNazwiskoImie();
        ComparatorWiek = new OsobaCompareWiek();
        ComparatorPensja = new PracownikComparePensja();
        ComparatorStaz = new PracownikCompareStaz();
        ComparatorKursy = new StudentCompareKursy();
        ComparatorNazwiskoWiek = new OsobaCompareNazwiskoWiek();
    }

    class OsobaCompareImie implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return o1.getImie().compareTo(o2.getImie());
        }
    }

    class OsobaCompareNazwisko implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return o1.getNazwisko().compareTo(o2.getNazwisko());
        }
    }

    class OsobaCompareNazwiskoImie implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            String p1 = o1.getNazwisko() + " " + o1.getImie();
            String p2 = o2.getNazwisko() + " " + o2.getImie();
            return p1.compareTo(p2);
        }
    }

    class OsobaCompareNazwiskoWiek implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            if (o1.getNazwisko() == o2.getNazwisko()) {
                return Integer.compare(o1.getWiek(), o2.getWiek());
            }
            return o1.getNazwisko().compareTo(o2.getNazwisko());
        }
    }

    class OsobaCompareWiek implements Comparator<Osoba> {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return Integer.compare(o1.getWiek(), o2.getWiek());
        }
    }

    class PracownikComparePensja implements Comparator<Pracownik_Uczelni> {
        @Override
        public int compare(Pracownik_Uczelni o1, Pracownik_Uczelni o2) {
            return Double.compare(o1.getPensja(), o2.getPensja());
        }
    }

    static class PracownikCompareStaz implements Comparator<Pracownik_Uczelni> {
        public PracownikCompareStaz() {
        }

        @Override
        public int compare(Pracownik_Uczelni o1, Pracownik_Uczelni o2) {
            return Integer.compare(o1.getStazPracy(), o2.getStazPracy());
        }
    }

    class StudentCompareKursy implements Comparator<Kurs> {
        @Override
        public int compare(Kurs o1, Kurs o2) {
            return o1.getNazwaKursu().compareTo(o2.getNazwaKursu());
        }
    }
}
