package J07018;
import java.util.*;
import java.io.*;
public class J07018 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            double gpa = Double.parseDouble(sc.nextLine().trim());
            SinhVien sv = new SinhVien(ten, lop, ns, gpa);
            ds.add(sv);
        }
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
