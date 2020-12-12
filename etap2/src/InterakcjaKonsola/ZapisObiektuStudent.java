package InterakcjaKonsola;

import Klasy.Student;

import java.util.Scanner;

public class ZapisObiektuStudent implements ZapisObiektu {
    @Override
    public Student saveObject() {

        Scanner scanner = new Scanner(System.in);
        Student myStudent = new Student();
        AbstractCreator.personCreator(myStudent);
        System.out.println("Wprowadź rok studiów:");
        myStudent.setRokStudiow(scanner.nextInt());

        System.out.println("Czy student jest uczestnikiem erasmusa? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")) {
            myStudent.setJestUczestnikiemErasmusa(true);
        } else {
            myStudent.setJestUczestnikiemErasmusa(false);
        }

        System.out.println("Czy student jest studentem 1 stopnia? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")) {
            myStudent.setJestStudentemIstopnia(true);
        } else {
            myStudent.setJestStudentemIstopnia(false);
        }

        System.out.println("Czy student jest studentem stacjonarnym? [T/N]:");
        if (scanner.nextLine().toLowerCase().equals("t") || scanner.nextLine().toLowerCase().equals("tak")) {
            myStudent.setJestStudentemStacjonarnym(true);
        } else {
            myStudent.setJestStudentemStacjonarnym(false);
        }

        return myStudent;
    }
}
