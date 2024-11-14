//WA
package J05018;
import java.util.*;
public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<HocSinh> ds = new ArrayList<>();
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
            sc.nextLine();
            HocSinh hs = new HocSinh(ten, toan, tv, nn, ly, hoa, sinh, su, dia, gdcd, cn);
            ds.add(hs);
        }
        Collections.sort(ds, (hs1, hs2) -> {
            if (hs1.diemTB() != hs2.diemTB()) {
                return Float.compare(hs2.diemTB(), hs1.diemTB());
            } else{
                return hs1.getMsv().compareTo(hs2.getMsv());
            }
        });

        for(HocSinh hs : ds) {
            System.out.println(hs);
        }
    }
}
