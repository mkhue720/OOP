package J05007;
import java.text.*;
import java.util.*;
public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> ds = new ArrayList<>();
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            String gioitinh = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            String diachi = sc.nextLine().trim();
            String thue = sc.nextLine().trim();
            String ngayki = sc.nextLine().trim();
            NhanVien nv = new NhanVien(ten, gioitinh, ns, diachi, thue, ngayki);
            ds.add(nv);
        }
        Collections.sort(ds, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getNgaySinh().compareTo(nv2.getNgaySinh());
            }
        });
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
