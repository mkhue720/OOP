package J05010;
import java.util.*;
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> ds = new ArrayList<>();
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            String nhom = sc.nextLine().trim();
            double mua = Double.parseDouble(sc.nextLine().trim());
            double ban = Double.parseDouble(sc.nextLine().trim());
            MatHang mh = new MatHang(ten, nhom, mua, ban);
            ds.add(mh);
        }
        Collections.sort(ds, (ds1, ds2) -> Double.compare(ds2.loiNhuan(), ds1.loiNhuan()));
        for(MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
