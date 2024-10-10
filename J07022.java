import java.util.*;
import java.io.*;
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = "";
        List<String> ds = new ArrayList<>();
        while (sc.hasNext()) {
            try {
                s  = sc.next();
                int n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                ds.add(s);
            }
        }
        Collections.sort(ds);
        for (String t : ds) {
            System.out.print(t + " ");
        }
    }
}
