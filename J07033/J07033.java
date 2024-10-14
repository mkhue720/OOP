package J07033;
import java.util.*;
import java.io.*;
public class J07033 {
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
        List<SinhVien> SinhViens = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int N = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < N; i++) {
            String msv = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            ten = chuanHoa(ten);
            String lop = sc.nextLine().trim();
            String mail = sc.nextLine().trim();
            SinhViens.add(new SinhVien(msv, ten, lop, mail));
        }
        Collections.sort(SinhViens, Comparator.comparing(SinhVien::getMsv));
        for (SinhVien sv : SinhViens) {
            System.out.println(sv);
        }
    }
}