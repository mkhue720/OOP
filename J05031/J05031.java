package J05031;
import java.util.*;
public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            double diem1 = Double.parseDouble(sc.nextLine().trim());
            double diem2 = Double.parseDouble(sc.nextLine().trim());
            double diem3 = Double.parseDouble(sc.nextLine().trim());
            ds.add(new SinhVien(msv, ten, lop, diem1, diem2, diem3));
        }

        Collections.sort(ds, Comparator.comparing(SinhVien::getTen));

        int id = 1;
        for (SinhVien sv : ds) {
            System.out.println(id + " " + sv);
            id++;
        }
    }
}
