import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("student.dat");
        DataInputStream inputStream = new DataInputStream(fileInputStream);
        String language = inputStream.readUTF();
        double PI = inputStream.readDouble();
        boolean status = inputStream.readBoolean();
        System.out.println(language);
        System.out.println(status);
        System.out.println(PI);
    }
}