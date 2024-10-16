package J07048;
import java.util.*;
import java.io.*;
public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        List<SanPham> sp = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        while(N-- > 0) {
            String maSP = sc.nextLine().trim();
            String tenSP = sc.nextLine().trim();
            int gia = Integer.parseInt(sc.nextLine().trim());
            int baohanh = Integer.parseInt(sc.nextLine().trim());
            sp.add(new SanPham(maSP, tenSP, gia, baohanh));
        }
        Collections.sort(sp, Comparator.comparing(SanPham::getGia).reversed().thenComparing(SanPham::getMaSP));
        for(SanPham sp1 : sp) {
            System.out.println(sp1);
        }
    }
}
