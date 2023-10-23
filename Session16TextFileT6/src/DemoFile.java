import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("src/data.txt");
        if (dataFile.createNewFile()) {
            System.out.println("Tạo file thành công");
            return;
        }
        System.out.println("Tạo file không thành công");

        File inputDir = new File("input");
        if (inputDir.mkdir()) {
            System.out.println("Tạo folder input thành công");
            return;
        }
        System.out.println("Tạo folder thất bại");

        File subFolder = new File("src/sub");
        if (subFolder.mkdir()) {
            File inputFile = new File("src/sub/input.txt");
            inputFile.createNewFile();
        }

        File srcDir = new File("src");
        File[] subArr = srcDir.listFiles();
        System.out.println("Folder " + srcDir.getName() + " có các tệp và thư mục con sau:");
        for (File sub : subArr) {
            System.out.println(sub.getName());
        }
    }
}