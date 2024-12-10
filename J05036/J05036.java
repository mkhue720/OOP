package J05036;
import java.util.*;
public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<MatHang> ds = new ArrayList<>();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            String dv = sc.nextLine().trim();
            int nhap = Integer.parseInt(sc.nextLine().trim());
            int soluong = Integer.parseInt(sc.nextLine().trim());
            MatHang mh = new MatHang(ten, dv, nhap, soluong);
            ds.add(mh);
        }
        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
