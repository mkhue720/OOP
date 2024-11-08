package J07073;
import java.util.*;
import java.io.*;
public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<MonHoc> mh = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int sotc = Integer.parseInt(sc.nextLine().trim());
            String lythuyet = sc.nextLine().trim();
            String thuchanh = sc.nextLine().trim();
            mh.add(new MonHoc(ma, ten, sotc, lythuyet, thuchanh));
        }
        Collections.sort(mh, Comparator.comparing(MonHoc::getMa));
        for (MonHoc i:mh) {
            System.out.println(i);
        }
    }
}
