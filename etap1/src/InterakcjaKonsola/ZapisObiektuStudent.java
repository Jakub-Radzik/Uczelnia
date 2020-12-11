package InterakcjaKonsola;

import Klasy.Osoba;
import Klasy.Student;

import java.util.Arrays;
import java.util.Scanner;

public class ZapisObiektuStudent implements ZapisObiektu{
    @Override
    public Student saveObject() {

        Scanner scanner = new Scanner(System.in);
        Student myStudent = new Student();

        System.out.println("Wprowadź imię:");
        myStudent.setImie(scanner.nextLine());
        System.out.println("Wprowadź nazwisko:");
        myStudent.setImie(scanner.nextLine());
        System.out.println("Wprowadź PESEL:");
        myStudent.setPesel(scanner.nextLine());
        System.out.println("Wprowadź plec [M/K]:");
        myStudent.setPlec(scanner.nextLine());
        System.out.println("Wprowadź wiek:");
        myStudent.setWiek(scanner.nextInt());
        System.out.println("Wprowadź rok studiów:");
        myStudent.setRokStudiow(scanner.nextInt());

        System.out.println("Czy student jest uczestnikiem erasmusa? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")){
            myStudent.setJestUczestnikiemErasmusa(true);
        }else {
            myStudent.setJestUczestnikiemErasmusa(false);
        }

        System.out.println("Czy student jest studentem 1 stopnia? [T/N]:");
        if(scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")){
            myStudent.setJestStudentemIstopnia(true);
        }else {
            myStudent.setJestStudentemIstopnia(false);
        }

        System.out.println("Czy student jest studentem stacjonarnym? [T/N]:");
        if(scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")){
            myStudent.setJestStudentemStacjonarnym(true);
        }else {
            myStudent.setJestStudentemStacjonarnym(false);
        }

        return myStudent;
    }
}
