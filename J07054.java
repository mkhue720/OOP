import java.io.*;
import java.util.*;
class SinhVien {
    String maSV;
    String hoTen;
    double diemTB;

    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
}

public class J07054 {
    public static String chuanHoa(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> danhSach = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            int c = Integer.parseInt(sc.nextLine());
            double d = (a * 3 + b * 3 + c * 2) / 8.0;
            danhSach.add(new SinhVien(String.format("SV%02d", i), chuanHoa(s), d));
        }
        sc.close();
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv2.diemTB != sv1.diemTB) {
                    return Double.compare(sv2.diemTB, sv1.diemTB);
                }
                return sv1.maSV.compareTo(sv2.maSV);
            }
        });

        int rank = 1;
        for (int i = 0; i < danhSach.size(); i++) {
            if (i > 0 && danhSach.get(i).diemTB == danhSach.get(i - 1).diemTB) {
                System.out.printf("%s %s %.2f %d\n", danhSach.get(i).maSV, danhSach.get(i).hoTen, danhSach.get(i).diemTB, rank);
            } else {
                rank = i + 1;
                System.out.printf("%s %s %.2f %d\n", danhSach.get(i).maSV, danhSach.get(i).hoTen, danhSach.get(i).diemTB, rank);
            }
        }
    }
}
