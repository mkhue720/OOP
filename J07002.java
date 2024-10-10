import java.util.*;
import java.io.*;
public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long S = 0;
        while (sc.hasNext()) {
            try {
                String s = sc.next();
                int n = Integer.parseInt(s);
                S += n;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(S);
    }
}
