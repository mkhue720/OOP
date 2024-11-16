package J05022;
import java.util.*;
public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List <SinhVien> ds = new ArrayList<>();
        List <SinhVien> res = new ArrayList<>();
        while (N -- > 0) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            ds.add(new SinhVien(msv, ten, lop, email));
        }

        int M = Integer.parseInt(sc.nextLine());
        while (M -- > 0) {
            String loc = sc.nextLine().trim();
            res.clear();
            for (SinhVien i : ds) {
                if (i.getLop().equals(loc)) {
                    res.add(i);
                }
            }
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", loc);
            for (SinhVien sv : res) {
                System.out.println(sv);
            }
        }
//        Collections.sort(ds, Comparator.comparing(SinhVien::getMsv));
    }
}
