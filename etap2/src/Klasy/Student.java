package Klasy;

import java.io.Serializable;
import java.util.List;

public class Student extends Osoba implements Serializable{
    private String numer_indeksu;
    private List<Kurs> listaKursow;
    private int rokStudiow;
    private String kierunek;
    private boolean jestUczestnikiemErasmusa;
    private boolean jestStudentemIstopnia;
    private boolean jestStudentemStacjonarnym;


    public Student(String imie, String nazwisko, String pesel, int wiek, String plec, String numer_indeksu, List<Kurs> listaKursow, boolean jestUczestnikiemErasmusa, boolean jestStudentemIstopnia, boolean jestStudentemStacjonarnym, int rokStudiow, String kierunek) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.numer_indeksu = numer_indeksu;
        this.listaKursow = listaKursow;
        this.jestUczestnikiemErasmusa = jestUczestnikiemErasmusa;
        this.jestStudentemIstopnia = jestStudentemIstopnia;
        this.jestStudentemStacjonarnym = jestStudentemStacjonarnym;
        this.rokStudiow = rokStudiow;
        this.kierunek = kierunek;
    }

    public Student() {
    }



    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public String getNumer_indeksu() {
        return numer_indeksu;
    }

    public void setNumer_indeksu(String numer_indeksu) {
        this.numer_indeksu = numer_indeksu;
    }

    public List<Kurs> getListaKursow() {
        return listaKursow;
    }

    public void setListaKursow(List<Kurs> listaKursow) {
        this.listaKursow = listaKursow;
    }

    public boolean isJestUczestnikiemErasmusa() {
        return jestUczestnikiemErasmusa;
    }

    public void setJestUczestnikiemErasmusa(boolean jestUczestnikiemErasmusa) {
        this.jestUczestnikiemErasmusa = jestUczestnikiemErasmusa;
    }

    public boolean isJestStudentemIstopnia() {
        return jestStudentemIstopnia;
    }

    public void setJestStudentemIstopnia(boolean jestStudentemIstopnia) {
        this.jestStudentemIstopnia = jestStudentemIstopnia;
    }

    public boolean isJestStudentemStacjonarnym() {
        return jestStudentemStacjonarnym;
    }

    public void setJestStudentemStacjonarnym(boolean jestStudentemStacjonarnym) {
        this.jestStudentemStacjonarnym = jestStudentemStacjonarnym;
    }

    @Override
    public String toString() {
        StringBuilder kursyTxt = new StringBuilder();
        if (listaKursow != null) {
            for (Kurs kurs : listaKursow) {
                kursyTxt.append(kurs.toString()).append("\n");
            }
        }


        return super.toString() +
                "numer_indeksu='" + numer_indeksu + '\'' +
                ", rokStudiow=" + rokStudiow +
                ", kierunek=" + kierunek +
                ", jestUczestnikiemErasmusa=" + jestUczestnikiemErasmusa +
                ", jestStudentemIstopnia=" + jestStudentemIstopnia +
                ", jestStudentemStacjonarnym=" + jestStudentemStacjonarnym
                + "\nLISTA KURSÓW=\n" + kursyTxt;
    }
}
