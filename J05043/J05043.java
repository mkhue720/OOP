package J05043;
import java.util.*;
public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<NhanVien>();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            String chucvu = sc.nextLine().trim();
            int luong = Integer.parseInt(sc.nextLine());
            int ngay = Integer.parseInt(sc.nextLine());
            ds.add(new NhanVien(ten, chucvu, luong, ngay));
        }
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
