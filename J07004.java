import java.util.*;
import java.io.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] freq = new int[1000];
        while (sc.hasNext()) {
            try {
                int n = Integer.parseInt(sc.next());
                if (n >= 0 && n < 1000) {
                    freq[n]++;
                }
            } catch (NumberFormatException e) {
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
        sc.close();
    }
}
