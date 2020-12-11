package InterakcjaKonsola;

import Klasy.Osoba;
import Klasy.Student;

public class ZapisObiektuStudent implements ZapisObiektu{
    @Override
    public Student saveObject() {
        System.out.println("nothing for now");
        return new Student();
    }
}
