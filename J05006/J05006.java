package J05006;
import java.util.*;
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            String gioitinh = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            String diachi = sc.nextLine().trim();
            String thue = sc.nextLine().trim();
            String ngayki = sc.nextLine().trim();
            NhanVien nv = new NhanVien(ten, gioitinh, ns, diachi, thue, ngayki);
            System.out.println(nv);
        }
    }
}
