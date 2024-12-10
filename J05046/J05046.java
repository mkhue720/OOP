package J05046;
import java.util.*;
public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<SanPham> ds = new ArrayList<>();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            int soluong = Integer.parseInt(sc.nextLine().trim());
            int gia = Integer.parseInt(sc.nextLine().trim());
            ds.add(new SanPham(ten, soluong, gia));
        }
        for (SanPham sanPham : ds) {
            System.out.println(sanPham);
        }
    }
}
