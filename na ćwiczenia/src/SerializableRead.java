import Klasy.Student;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableRead {
    public static void main(String[] args) {
        Student student;
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"));
            student = (Student) inputStream.readObject();
            inputStream.close();

            System.out.println(student.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
