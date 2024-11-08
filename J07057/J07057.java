package J07057;

import java.util.*;
import java.io.*;
public class J07057 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<ThiSinh> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            int thi = Integer.parseInt(sc.nextLine().trim());
            String dantoc = sc.nextLine().trim();
            int kv = Integer.parseInt(sc.nextLine().trim());
            ds.add(new ThiSinh(ten, thi, dantoc, kv));
        }

        Collections.sort(ds, Comparator.comparing(ThiSinh::tinhDiem).reversed().thenComparing(ThiSinh::getMa));
        for (ThiSinh d : ds) {
            System.out.println(d);
        }
    }
}
