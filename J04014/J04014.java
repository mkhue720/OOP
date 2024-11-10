//WA
package J04014;

import java.util.*;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int tuSo1 = sc.nextInt();
            int mauSo1 = sc.nextInt();
            int tuSo2 = sc.nextInt();
            int mauSo2 = sc.nextInt();
            int tuSo3 = tuSo1*mauSo2 + tuSo2*mauSo1;
            int mauSo3 = mauSo1*mauSo2;
            PhanSo phanSoC = new PhanSo(tuSo3 * tuSo3, mauSo3 * mauSo3);
            phanSoC.toiGian();
            phanSoC.inPhanSo();
            PhanSo phanSoA = new PhanSo(tuSo1, mauSo1);
            PhanSo phanSoB = new PhanSo(tuSo2, mauSo2);
            PhanSo phanSoD = new PhanSo(
                    phanSoA.getTuSo() * phanSoB.getTuSo() * phanSoC.getTuSo(),
                    phanSoA.getMauSo() * phanSoB.getMauSo() * phanSoC.getMauSo()
            );
            phanSoD.toiGian();
            phanSoD.inPhanSo();
        }
    }
}
