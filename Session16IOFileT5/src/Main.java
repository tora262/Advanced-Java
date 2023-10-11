import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        File outputFolder = new File("output");
        outputFolder.mkdir();
        File fileTest = new File("output/ouput.txt");
        fileTest.createNewFile();

        File file = new File("hello.txt");
        file.createNewFile();

        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        File subFolder = new File("output/subfolder");
        subFolder.mkdir();

        listFile(file);

        listFile(outputFolder);

    }

    private static void listFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            System.out.println("Các file và thư mục con trong thư mục này là:");
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        } else {
            System.out.println(file.getName() + " là file chứ không phải là thư mục");
        }
    }
}