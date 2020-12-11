import Klasy.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableStudent {
    public static void main(String[] args) {
        Student student = new Student("Jakub", "Radzik", "12345678901", 15, "M", "260366", null, true, true,true,1);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            outputStream.writeObject(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
