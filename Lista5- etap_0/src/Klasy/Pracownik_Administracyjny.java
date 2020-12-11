package Klasy;

public class Pracownik_Administracyjny extends Pracownik_Uczelni{
    private int liczba_nadgodzin;

    public Pracownik_Administracyjny(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, double pensja, int liczba_nadgodzin) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja);
        this.liczba_nadgodzin = liczba_nadgodzin;
    }

    public int getLiczba_nadgodzin() {
        return liczba_nadgodzin;
    }

    public void setLiczba_nadgodzin(int liczba_nadgodzin) {
        this.liczba_nadgodzin = liczba_nadgodzin;
    }

    @Override
    public String toString() {
        return super.toString()+ "liczba_nadgodzin=" + liczba_nadgodzin;
    }
}
