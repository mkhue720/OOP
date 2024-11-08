package b1;
import java.util.*;
import java.io.*;
public class b1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<DanhSach> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            ds.add(new DanhSach(ma, ten, lop, email, sdt));
        }
        Collections.sort(ds, new Comparator <DanhSach>() {
            @Override
            public int compare(DanhSach o1, DanhSach o2) {
                int tmp = o1.getLop().compareTo(o2.getLop());
                if (tmp != 0) return tmp;
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (DanhSach d : ds) {
            System.out.println(d);
        }
    }
}
