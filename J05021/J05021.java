package J05021;
import java.util.*;
public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <SinhVien> ds = new ArrayList<>();
        Set<String> set = new HashSet<>();
        while (!sc.hasNextLine()) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            if(!set.contains(msv)) {
                ds.add(new SinhVien(msv, ten, lop, email));
                set.add(msv);
            }
        }

        Collections.sort(ds, Comparator.comparing(SinhVien::getMsv));
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
