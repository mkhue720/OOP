import java.io.*;
import java.util.*;
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words = line.split("\\s+");
            for (String word : words) {
                set.add(word.toLowerCase());
            }
        }
        for (String word : set) {
            System.out.println(word);
        }
    }
}
