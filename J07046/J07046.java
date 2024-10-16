package J07046;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class J07046 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        List<Khach> kh = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (N-- > 0) {
            String tenKh = sc.nextLine().trim();
            String maPhong = sc.nextLine().trim();
            LocalDate ngayDen  = LocalDate.parse(sc.nextLine().trim(), dtf);
            LocalDate ngayDi  = LocalDate.parse(sc.nextLine().trim(), dtf);
            kh.add(new Khach(tenKh, maPhong, ngayDen, ngayDi));
        }
        Collections.sort(kh, (kh1, kh2) -> Integer.compare((kh2.tinhNgay()), kh1.tinhNgay()));
        for (Khach khach : kh) {
            System.out.println(khach);
        }
    }
}
