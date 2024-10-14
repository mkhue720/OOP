package J07037;
import java.util.*;
import java.io.*;
public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        List<DN> DNs = new ArrayList<>();
        Scanner sc = new Scanner(new File("DN.in"));
        int N = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < N; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int num = Integer.parseInt(sc.nextLine().trim());
            DNs.add(new DN(ma, ten, num));
        }
        Collections.sort(DNs, Comparator.comparing(DN::getMa));
        for (DN DN : DNs) {
            System.out.println(DN);
        }
    }
}
