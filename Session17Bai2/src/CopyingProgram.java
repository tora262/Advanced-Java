import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CopyingProgram {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("source/source.dat");
        File destDir = new File("dest");

        File destFile = new File("dest/dest.dat");
        if (destDir.exists()) {
            destDir.delete();
        }

        if (sourceFile.exists() && destDir.mkdir() && destFile.createNewFile()) {
            System.out.println("File is copying...");
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);

            byte[] b = new byte[50];
            int readByte;
            inputStream.available();
            while ((readByte = inputStream.read(b)) != -1) {
                System.out.println("Reading: " + readByte);
                outputStream.write(b);
                b = new byte[readByte];
            }
            inputStream.close();
            outputStream.close();
            System.out.println("Copy complete!");
        } else {
            System.out.println("Occur error when copying");
        }
    }
}