package J07057;

import java.util.Objects;

public class ThiSinh {
    private static int dem = 0;
    private String ma;
    private String ten;
    private double thi;
    private String dantoc;
    private int kv;

    public ThiSinh(String ten, double thi, String dantoc, int kv) {
        dem++;
        this.ma = String.format("TS%02d", dem);
        this.ten = chuanHoa(ten);
        this.thi = thi;
        this.dantoc = chuanHoa(dantoc);
        this.kv = kv;
    }

    public String getMa() {
        return ma;
    }

    public double tinhDiem() {
        double diem = thi;
        switch (kv) {
            case 1:
                diem += 1.5;
                break;
            case 2:
                diem += 1.0;
                break;
            case 3:
                diem += 0.0;
                break;
            default:
                break;
        }
        if (!Objects.equals(dantoc, "Kinh")) {
            diem += 1.5;
        }
        return diem;
    }


    public String trangThai() {
        if (tinhDiem() >= 20.5) {
            return "Do";
        } else {
            return "Truot";
        }
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
        return result.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tinhDiem() + " " + trangThai();
    }
}
