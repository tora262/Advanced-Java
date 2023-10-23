package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    /*
    chương trình -> H E L L O  J A V A -> FileWriter -> File
     */
    public static void main(String[] args) throws IOException {
        File outputFile = new File("src/fileio/output.txt");
        outputFile.createNewFile();
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.newLine();
        writer.write("Hello Java");
        writer.newLine();
        writer.write("Hello Python");
        writer.flush();
        writer.close();
    }
}
