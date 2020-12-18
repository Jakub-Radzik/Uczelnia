package Serializacja;

import java.io.*;
import java.util.ArrayList;

public class SerializacjaOsob{

    //Poprzez użycie wyrażenie try-catch-with resources nie musimy się martwic o zamykanie strumieni

    public static <T> void serializacja(ArrayList<T> list, String fileName){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));){
            os.writeObject(list);
            System.out.println("Serializacja pomyślna");
        }catch (FileNotFoundException fex){
            System.out.println("FIle not found");
            fex.printStackTrace();
        }catch (Exception ex){
            System.out.println("IDK WHAT");
            ex.printStackTrace();
        }
    }

    public static <T> ArrayList<T> deserializacja(ArrayList<T> t, String fileName){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            System.out.println("DESERIALIZACJA");
            return (ArrayList<T>) in.readObject();
        }catch (FileNotFoundException fex){
            System.out.println("NO file");
            fex.printStackTrace();
        }catch (Exception ex){
            System.out.println("Inny problem");
            ex.printStackTrace();
        }
        return null;
    }
}
