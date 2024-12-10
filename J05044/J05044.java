package J05044;
import java.util.*;
public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        List<NhanVien> loc = new ArrayList<>();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            String chucvu = sc.nextLine().trim();
            int luong = Integer.parseInt(sc.nextLine());
            int ngay = Integer.parseInt(sc.nextLine());
            ds.add(new NhanVien(ten, chucvu, luong, ngay));
        }
        String cv = sc.nextLine().trim();
        for (NhanVien nv : ds) {
            if (nv.getChucvu().equals(cv)) {
                loc.add(nv);
            }
        }
        for (NhanVien nv : loc) {
            System.out.println(nv);
        }
    }
}
