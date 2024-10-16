package J07056;
import java.io.*;
import java.util.*;
public class J07056 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<KhachHang> dsKhachHang = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String thongTin = sc.nextLine();
            dsKhachHang.add(new KhachHang(ten, thongTin));
        }
        dsKhachHang.sort((k1, k2) -> Double.compare(k2.tongTien(), k1.tongTien()));
        for (KhachHang kh : dsKhachHang) {
            System.out.println(kh);
        }
    }
}
