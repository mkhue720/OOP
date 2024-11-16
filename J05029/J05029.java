package J05029;
import java.util.*;
public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> ds = new ArrayList<>();
        List<DoanhNghiep> res = new ArrayList<>();
        while (N-- > 0) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int soluong = Integer.parseInt(sc.nextLine().trim());
            ds.add(new DoanhNghiep(ma, ten, soluong));
        }
        int M = Integer.parseInt(sc.nextLine().trim());
        while (M-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            res.clear();
            for (DoanhNghiep i :ds) {
                if (i.getSoluong() >= a && i.getSoluong() <= b){
                    res.add(i);
                }
            }
            Collections.sort(res, (dn1, dn2) -> {
                if (dn1.getSoluong() != dn2.getSoluong()) {
                    return dn2.getSoluong() - dn1.getSoluong();
                } else {
                    return dn1.getMa().compareTo(dn2.getMa());
                }
            });
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
            for (DoanhNghiep dn : res) {
                System.out.println(dn);
            }
        }
    }
}
