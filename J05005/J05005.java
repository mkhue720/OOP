package J05005;

import java.util.*;
public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        while(n-- > 0) {
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            double gpa = Double.parseDouble(sc.nextLine().trim());
            SinhVien sv = new SinhVien(ten, lop, ns, gpa);
            ds.add(sv);
        }
        Collections.sort(ds, Comparator.comparing(SinhVien::getGpa).reversed());
        for (SinhVien sv: ds) {
            System.out.println(sv);
        }
    }
}
