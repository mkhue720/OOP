package J07010;
import java.util.*;
import java.io.*;
import java.text.*;
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        List<SV> sv = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String ngaySinhStr = sc.nextLine().trim();
            Date ngaySinh = SV.chuanHoaNgaySinh(ngaySinhStr);
            double gpa = Double.parseDouble(sc.nextLine().trim());
            sv.add(new SV(ten, lop, ngaySinh, gpa));
        }
        for (SV i : sv) {
            System.out.println(i);
        }
    }
}
