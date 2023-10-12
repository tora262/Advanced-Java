import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaiTap3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader reader = new BufferedReader(fileReader);


        StringBuilder paragraphBuilder = new StringBuilder();

        // reader.ready() trả về true nếu như còn đọc được tiếp, trả ra false nếu không đọc được tiếp
        while (reader.ready()) {
            paragraphBuilder.append(reader.readLine())
                    .append("\n");
        }

        String[] words = paragraphBuilder.toString().split(" ");
        Set<String> results = new HashSet<>();

        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    results.add(words[i]);
                }
            }
        }

        System.out.println("Các từ được lặp lại trong file là:");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
