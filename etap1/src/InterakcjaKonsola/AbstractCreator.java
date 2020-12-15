package InterakcjaKonsola;

import Klasy.Osoba;
import Klasy.Pracownik_Uczelni;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class AbstractCreator {

    protected static String checkStringHasOnlyLetters(String description){
        Scanner scanner = new Scanner(System.in);
        String txt;
        do{
            System.out.println("Wprowadź "+description+":");
            txt = scanner.nextLine();
        }while((txt).chars().anyMatch(Character::isDigit)); //Sprawdzam czy istnieją cyfry bo może posiadać spacje które nie są literami
        return txt;
    }
    protected static String checkStringHasOnlyNumbers(String description){
        Scanner scanner = new Scanner(System.in);
        String txt;
        do{
            System.out.println("Wprowadź "+description+":");
            txt = scanner.nextLine();
        }while(!(txt).chars().allMatch(Character::isDigit) || txt.length()!=11);
        return txt;
    }
    protected static int isIntegerAndCorrect(String description){
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        do {
            System.out.println("Wprowadź "+description+":");
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException ex) {
                scanner.next();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (number<0 && !Integer.valueOf(number).toString().chars().allMatch(Character::isDigit));
        return number;
    }
    protected static String isGenderValid(){
        Scanner scanner = new Scanner(System.in);
        String gender;
        while (true){
            System.out.println("Wprowadź plec [M/K]:");
            gender = scanner.nextLine();
            if((gender).chars().allMatch(Character::isLetter)){
                if (gender.toLowerCase().startsWith("m")){
                    return "M";
                }else if(gender.toLowerCase().startsWith("k")){
                    return "K";
                }
            }
        }
    }


    protected static Osoba personCreator(Osoba person) {
        Scanner scanner = new Scanner(System.in);
        person.setImie(checkStringHasOnlyLetters("imię"));
        person.setNazwisko(checkStringHasOnlyLetters("nazwisko"));
        person.setPesel(checkStringHasOnlyNumbers("PESEL"));
        person.setPlec(isGenderValid());
        person.setWiek(isIntegerAndCorrect("wiek"));
        return person;
    }

    protected static Osoba workerCreator(Pracownik_Uczelni worker) {
        Scanner scanner = new Scanner(System.in);

        worker.setStanowisko(checkStringHasOnlyLetters("stanowisko"));
        worker.setStazPracy(isIntegerAndCorrect("staż pracy"));
        worker.setPensja(isIntegerAndCorrect("pensję"));

//        System.out.println("Podaj pensje");
//        worker.setPensja(scanner.nextInt());
        return worker;
    }

}
