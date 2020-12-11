package InterakcjaKonsola;

import Klasy.Pracownik_Administracyjny;
import Klasy.Pracownik_Badawczo_Dydaktyczny;
import Klasy.Pracownik_Uczelni;

import java.util.Scanner;

public class ZapisObiektuPracownikDydaktyczny implements ZapisObiektu{
    @Override
    public Object saveObject() {
        Scanner scanner = new Scanner(System.in);
        Pracownik_Badawczo_Dydaktyczny pracownik = new Pracownik_Badawczo_Dydaktyczny();
        AbstractCreator.personCreator(pracownik);
        AbstractCreator.workerCreator(pracownik);
        System.out.println("Podaj dorobek naukowy");
        pracownik.setDorobekNaukowy(scanner.nextInt());
        return pracownik;
    }
}
