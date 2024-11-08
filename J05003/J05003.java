package J05003;

import java.util.*;
public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            double diem = Double.parseDouble(sc.nextLine().trim());
            SinhVien sv = new SinhVien(ten, lop, ns, diem);
            ds.add(sv);
        }
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
        sc.close();
    }
}
