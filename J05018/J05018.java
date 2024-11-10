package J05018;
import java.util.*;
public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        while (N-- > 0) {
            String ten = sc.nextLine().trim();
            float toan = sc.nextFloat();
            float tv = sc.nextFloat();
            float nn = sc.nextFloat();
            float ly = sc.nextFloat();
            float hoa = sc.nextFloat();
            float sinh = sc.nextFloat();
            float su = sc.nextFloat();
            float dia = sc.nextFloat();
            float gdcd = sc.nextFloat();
            float cn = sc.nextFloat();
            HocSinh hs = new HocSinh(ten, toan, tv, nn, ly, hoa, sinh, su, dia, gdcd, cn);
            System.out.println(hs);
        }
    }
}
