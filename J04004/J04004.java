package J04004;

import java.util.*;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo1 = sc.nextLong();
        long mauSo1 = sc.nextLong();
        long tuSo2 = sc.nextLong();
        long mauSo2 = sc.nextLong();
        long tuSo3 = tuSo1*mauSo2 + tuSo2*mauSo1;
        long mauSo3 = mauSo1*mauSo2;
        PhanSo phanSo3 = new PhanSo(tuSo3, mauSo3);
        phanSo3.toiGian();
        phanSo3.inPhanSo();
    }
}
