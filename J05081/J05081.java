package J05081;
import java.util.*;

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<MatHang> danhSachMatHang = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            sc.nextLine();
            MatHang mh = new MatHang(tenMatHang, donViTinh, giaMua, giaBan);
            danhSachMatHang.add(mh);
        }
        Collections.reverse(danhSachMatHang);
        for (MatHang mh : danhSachMatHang) {
            mh.display();
        }
        sc.close();
    }
}
