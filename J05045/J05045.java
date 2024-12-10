package J05045;
import java.util.*;
public class J05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            String chucvu = sc.nextLine().trim();
            int luong = Integer.parseInt(sc.nextLine());
            int ngay = Integer.parseInt(sc.nextLine());
            ds.add(new NhanVien(ten, chucvu, luong, ngay));
        }

        Collections.sort(ds, (nv1, nv2) -> {
            if (nv1.conLai() != nv2.conLai()) {
                return nv2.conLai() - nv1.conLai();
            } else {
                return nv1.getMa().compareTo(nv2.getMa());
            }
        });

        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
