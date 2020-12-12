package Klasy;

import java.io.Serializable;

public abstract class Pracownik_Uczelni extends Osoba implements Serializable{
    private String stanowisko;
    private int stazPracy;
    private double pensja;

    public Pracownik_Uczelni(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, double pensja) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.stanowisko = stanowisko;
        this.stazPracy = stazPracy;
        this.pensja = pensja;
    }

    public Pracownik_Uczelni() {
        super();
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() +
                "stanowisko='" + stanowisko + '\'' +
                ", stazPracy=" + stazPracy +
                ", pensja=" + pensja + " ";
    }
}
