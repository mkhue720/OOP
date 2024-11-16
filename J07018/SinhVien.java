package J07018;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SinhVien {
    private static int dem = 0;
    private String msv;
    private String ten;
    private String lop;
    private LocalDate ns;
    private double diem;

    public SinhVien(String ten, String lop, String ns, double diem) {
        dem++;
        this.msv = String.format("B20DCCN%03d", dem);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.ns = LocalDate.parse(ns, inputFormat);
        this.diem = diem;
    }

    @Override
    public String toString() {
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return msv + " " + ten + " " + lop + " " + ns.format(outputFormat) + " " + String.format("%.2f", diem);
    }

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
        return result.toString();
    }
}
