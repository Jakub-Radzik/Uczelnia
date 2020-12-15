package Serializacja;

import Klasy.Osoba;

import java.io.*;
import java.util.ArrayList;

public class SerializacjaOsob{

    //Poprzez użycie wyrażenie try-catch-with resources nie musimy się martwic o zamykanie strumieni

    public static void serializacja(ArrayList<Osoba> osoby){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Osoby.ser"));){
            os.writeObject(osoby);
            System.out.println("Serializacja pomyślna");
        }catch (FileNotFoundException fex){
            System.out.println("FIle not found");
            fex.printStackTrace();
        }catch (Exception ex){
            System.out.println("IDK WHAT");
            ex.printStackTrace();
        }
    }

    public static void deserializacja(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Osoby.ser"))){
            ArrayList<Osoba> osoby = (ArrayList<Osoba>) in.readObject();
            System.out.println("DESERIALIZACJA");
            for (Osoba osoba: osoby) {
                System.out.println("=============================================================================================");
                System.out.println(osoba.toString());
                System.out.println();
            }
        }catch (FileNotFoundException fex){
            System.out.println("NO file");
            fex.printStackTrace();
        }catch (Exception ex){
            System.out.println("Inny problem");
            ex.printStackTrace();
        }

    }
}
