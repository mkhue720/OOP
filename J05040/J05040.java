package J05040;
import java.util.*;
public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<NhanVien>();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            int luong = Integer.parseInt(sc.nextLine());
            int ngay = Integer.parseInt(sc.nextLine());
            String chucvu = sc.nextLine().trim();
            ds.add(new NhanVien(ten, luong, ngay, chucvu));
        }
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
