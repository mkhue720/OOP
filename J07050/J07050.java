package J07050;
import java.util.*;
import java.io.*;
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        List<MatHang> mh = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String tenHang = sc.nextLine().trim();
            String nhomHang = sc.nextLine().trim();
            double giaMua = Double.parseDouble(sc.nextLine().trim());
            double giaBan = Double.parseDouble(sc.nextLine().trim());
            mh.add(new MatHang(tenHang, nhomHang, giaMua, giaBan));
        }
        Collections.sort(mh, (mh1, mh2) -> Double.compare(mh2.loiNhuan(), mh1.loiNhuan()));
        for (MatHang m : mh) {
            System.out.println(m);
        }
    }
}
