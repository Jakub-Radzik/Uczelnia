import Klasy.Student;

import java.util.Scanner;

public class GetUserFromScanner {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        student.setImie(scanner.nextLine());
        System.out.println("Podaj nazwisko: ");
        student.setNazwisko(scanner.nextLine());;
        System.out.println("Podaj plec: ");
        student.setPlec(scanner.nextLine());
        System.out.println("Podaj pesel: ");
        student.setPesel(scanner.nextLine());
        System.out.println("Podaj wiek: ");
        student.setWiek(scanner.nextInt());
        scanner.close();

        student.setNumer_indeksu("123456");
        student.setRokStudiow(1);
        student.setJestStudentemIstopnia(true);
        student.setJestStudentemStacjonarnym(true);
        student.setJestUczestnikiemErasmusa(true);
        student.setListaKursow(null);

        System.out.println(student.toString());
    }
}
