package Klasy;

public class Pracownik_Badawczo_Dydaktyczny extends Pracownik_Uczelni{
    private int dorobekNaukowy;

    public Pracownik_Badawczo_Dydaktyczny(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko, int stazPracy, double pensja, int dorobek_naukowy) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, stazPracy, pensja);
        this.dorobekNaukowy = dorobek_naukowy;
    }

    public int getDorobekNaukowy() {
        return dorobekNaukowy;
    }

    public void setDorobekNaukowy(int dorobekNaukowy) {
        this.dorobekNaukowy = dorobekNaukowy;
    }

    @Override
    public String toString() {
        return super.toString()+"dorobekNaukowy=" + dorobekNaukowy;
    }
}
