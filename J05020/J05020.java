package J05020;
import java.util.*;
public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <SinhVien> ds = new ArrayList<>();
        Set<String> set = new HashSet<>();
        while (n-- > 0) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            if(!set.contains(msv)) {
                ds.add(new SinhVien(msv, ten, lop, email));
                set.add(msv);
            }
        }

        Collections.sort(ds, (sv1, sv2) -> {
            int tmp = sv1.getLop().compareTo(sv2.getLop());
            if (tmp != 0) {
                return sv1.getLop().compareTo(sv2.getLop());
            } else {
                return sv1.getMsv().compareTo(sv2.getMsv());
            }
        });
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
