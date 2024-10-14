package J07058;

import java.util.*;
import java.io.*;
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        List<MonHoc> MonHocs = new ArrayList<>();
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int N = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < N; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String hinhthuc = sc.nextLine().trim();
            MonHocs.add(new MonHoc(ma, ten, hinhthuc));
        }
        Collections.sort(MonHocs, Comparator.comparing(MonHoc::getMa));
        for (MonHoc MonHoc : MonHocs) {
            System.out.println(MonHoc);
        }
    }
}
