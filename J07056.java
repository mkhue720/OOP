import java.io.*;
import java.util.*;

class KhachHang {
    String maKH;
    String hoten;
    long trongdm;
    long ngoaidm;
    long nop;
    public KhachHang(String maKH, String hoten, long trongdm, long ngoaidm, long nop) {
        this.maKH = maKH;
        this.hoten = hoten;
        this.trongdm = trongdm;
        this.ngoaidm = ngoaidm;
        this.nop = nop;
    }

}

public class J07056 {
    public static String chuanHoa(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maKH = sc.nextLine();
            String hoten = sc.nextLine();
            long trongdm = Long.parseLong(sc.nextLine());
            long ngoaidm = Long.parseLong(sc.nextLine());
            long nop = Long.parseLong(sc.nextLine());
            
        }
    }
}