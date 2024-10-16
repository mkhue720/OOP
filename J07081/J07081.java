package J07081;
import java.util.*;
import java.io.*;

public class J07081 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        List<SV> svList = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine().trim());
        while (N-- > 0) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            svList.add(new SV(ma, ten, sdt, email));
        }

        Collections.sort(svList, new Comparator<SV>() {
            @Override
            public int compare(SV sv1, SV sv2) {
                int tmp = sv1.getTen().compareTo(sv2.getTen());
                if (tmp != 0) return tmp;
                tmp = sv1.getHo().compareTo(sv2.getHo());
                if (tmp != 0) return tmp;
                tmp = sv1.getDem().compareTo(sv2.getDem());
                if (tmp != 0) return tmp;
                return sv1.getMa().compareTo(sv2.getMa());
            }
        });
        for (SV sv : svList) {
            System.out.println(sv);
        }
    }
}
