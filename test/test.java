package test;
import java.util.*;


class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<SanPham> ds = new ArrayList<>();
        while (N-- > 0) {
            String tenhang = sc.nextLine().trim();
            int soluong = Integer.parseInt(sc.nextLine().trim());
            int gia = Integer.parseInt(sc.nextLine().trim());
            ds.add(new SanPham(tenhang, soluong, gia));
        }

        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
}
