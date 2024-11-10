package J04012;
import java.util.*;
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine().trim();
        int luongcoban = Integer.parseInt(sc.nextLine().trim());
        int cong = Integer.parseInt(sc.nextLine().trim());
        String chucvu = sc.nextLine().trim();
        NhanVien nv = new NhanVien(ten, luongcoban, cong, chucvu);
        System.out.println(nv);
        sc.close();
    }
}
