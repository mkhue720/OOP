package J07051;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class J07051 {
    public static void main(String[] args) throws FileNotFoundException {
        List<KhachHang> KhachHangs = new ArrayList<>();
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int N = Integer.parseInt(sc.nextLine().trim());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

        for (int i = 0; i < N; i++) {
            String tenkh = sc.nextLine().trim();
            String sophong = sc.nextLine().trim();
            LocalDate ngaynhan = LocalDate.parse(sc.nextLine().trim(), formatter);
            LocalDate ngaytra = LocalDate.parse(sc.nextLine().trim(), formatter);
            int dichvu = Integer.parseInt(sc.nextLine().trim());
            KhachHangs.add(new KhachHang(tenkh, sophong, ngaynhan, ngaytra, dichvu));
        }
        Collections.sort(KhachHangs, (kh1, kh2) -> Integer.compare(kh2.tinhTien(), kh1.tinhTien()));

        for (KhachHang kh : KhachHangs) {
            System.out.println(kh);
        }
    }
}
