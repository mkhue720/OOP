package J07072;
import java.io.*;
import java.util.*;

public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<DanhSach> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ten = sc.nextLine().trim();
            ds.add(new DanhSach(DanhSach.chuanHoa(ten)));
        }
        Collections.sort(ds, new Comparator<DanhSach>() {
            @Override
            public int compare(DanhSach ten1, DanhSach ten2) {
                int tmp = ten1.getTen().compareTo(ten2.getTen());
                if (tmp != 0) return tmp;
                tmp = ten1.getHo().compareTo(ten2.getHo());
                if (tmp != 0) return tmp;
                tmp = ten1.getDem().compareTo(ten2.getDem());
                if (tmp != 0) return tmp;
                return 0;
            }
        });
        for (DanhSach d : ds) {
            System.out.println(d);
        }
    }
}
