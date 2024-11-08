package J07055;

public class BangDiem {
    private static int dem = 0;
    private String msv;
    private String ten;
    private int luyentap;
    private int thuchanh;
    private int thi;
    public BangDiem(String ten, int luyentap, int thuchanh, int thi) {
        dem ++;
        this.msv = String.format("SV%02d", dem);
        this.ten = chuanHoa(ten);
        this.luyentap = luyentap;
        this.thuchanh = thuchanh;
        this.thi = thi;
    }

    public String getTen() {
        return ten;
    }

    public double diemTB() {
        return luyentap * 0.25 + thuchanh * 0.35 + thi * 0.40;
    }

    public String xepLoai() {
        if(diemTB() < 5) {
            return "KEM";
        } else if (diemTB() < 6.5) {
            return "TRUNG BINH";
        } else if (diemTB() < 8) {
            return "KHA";
        } else {
            return "GIOI";
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
        return msv + " " + ten + " " + String.format("%.2f", diemTB()) + " " + xepLoai();
    }
}
