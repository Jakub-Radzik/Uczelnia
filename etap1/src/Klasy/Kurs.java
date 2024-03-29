package Klasy;

public class Kurs {
    private String nazwaKursu;
    private Pracownik_Badawczo_Dydaktyczny prowadzacy;
    private int ects;

    public Kurs(String nazwaKursu, Pracownik_Badawczo_Dydaktyczny prowadzacy, int ects) {
        this.nazwaKursu = nazwaKursu;
        this.prowadzacy = prowadzacy;
        this.ects = ects;
    }

    public Kurs() {

    }

    public String getNazwaKursu() {
        return nazwaKursu;
    }

    public void setNazwaKursu(String nazwaKursu) {
        this.nazwaKursu = nazwaKursu;
    }

    public Pracownik_Badawczo_Dydaktyczny getProwadzacy() {
        return prowadzacy;
    }

    public void setProwadzacy(Pracownik_Badawczo_Dydaktyczny prowadzacy) {
        this.prowadzacy = prowadzacy;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    @Override
    public String toString() {
        return "Klasy.Kurs{" +
                "nazwaKursu='" + nazwaKursu + '\'' +
                ", prowadzacy=" + prowadzacy.getImie() + " " + prowadzacy.getNazwisko() +
                ", ects=" + ects +
                '}';
    }
}
