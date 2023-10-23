import java.io.File;
import java.io.IOException;

public class FileInteraction {
    public static void main(String[] args) throws IOException {
        File dataDir = new File("data");
        File inputFile = new File("data/input.txt");
        File demoFile = new File("data/Demo.java");
        File sub1 = new File("data/sub1");
        File outputFile = new File("data/sub1/output.txt");
        File studentDataFile = new File("data/sub1/student.dat");
        File sub2 = new File("data/sub2");

        if (dataDir.mkdir()) {
            inputFile.createNewFile();
            demoFile.createNewFile();
            if (sub1.mkdir()) {
                outputFile.createNewFile();
                studentDataFile.createNewFile();
            }
            sub2.mkdir();
        }

        System.out.println("Thông tin thư mục:");
        displayFolderInfo("", dataDir);


    }

    private static void displayFolderInfo(String prefix, File file) {
        System.out.println(prefix + file.getName());
        if (file.isDirectory()) {
            for (File sub : file.listFiles()) {
                displayFolderInfo(prefix+"-", sub);
            }
        }
    }
}
