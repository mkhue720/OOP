package J05028;
import java.util.*;
public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> ds = new ArrayList<>();
        while (N-- > 0) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int soluong = Integer.parseInt(sc.nextLine().trim());
            ds.add(new DoanhNghiep(ma, ten, soluong));
        }
        Collections.sort(ds, (dn1, dn2) -> {
            if (dn1.getSoluong() != dn2.getSoluong()) {
                return dn2.getSoluong() - dn1.getSoluong();
            } else {
                return dn1.getMa().compareTo(dn2.getMa());
            }
        });
        for (DoanhNghiep dn : ds) {
            System.out.println(dn);
        }
    }
}
