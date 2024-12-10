package J05034;
import java.util.*;
public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        List<SinhVien> res = new ArrayList<>();
        while (N-- > 0) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String doanhnghiep = sc.nextLine().trim();
            ds.add(new SinhVien(msv, ten, lop, email, doanhnghiep));
        }
        int Q = Integer.parseInt(sc.nextLine().trim());
        while (Q-- > 0) {
            String find = sc.nextLine().trim();
            res.clear();
            for (SinhVien i : ds) {
                if (i.getDoanhnghiep().equals(find)) {
                    res.add(i);
                }
            }
            Collections.sort(res, Comparator.comparing(SinhVien::getTen));
            for (SinhVien i : res) {
                System.out.println(i);
            }
        }
    }
}
