package J07055;

import java.util.*;
import java.io.*;
public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        List<BangDiem> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            int luyentap = Integer.parseInt(sc.nextLine().trim());
            int thuchanh = Integer.parseInt(sc.nextLine().trim());
            int thi = Integer.parseInt(sc.nextLine().trim());
            ds.add(new BangDiem(ten, luyentap, thuchanh, thi));
        }

        ds.sort((k1, k2) -> Double.compare(k2.diemTB(), k1.diemTB()));
        for (BangDiem sv : ds) {
            System.out.println(sv);
        }
    }
}
