package J05023;

import java.util.*;

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();
        while (N-- > 0) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            ds.add(new SinhVien(msv, ten, lop, email));
        }

        int M = Integer.parseInt(sc.nextLine());
        while (M-- > 0) {
            int nam = Integer.parseInt(sc.nextLine());
            int khoa = nam - 2000;

            System.out.printf("DANH SACH SINH VIEN KHOA %d:\n", nam);
            for (SinhVien sv : ds) {
                if (Integer.parseInt(sv.getKhoa()) == khoa) {
                    System.out.println(sv);
                }
            }
        }
    }
}