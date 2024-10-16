package J07056;

public class KhachHang {
    private String ten;
    private String loai;
    private int sodau;
    private int socuoi;
    private static int idCounter = 0;
    private String maKh;

    public KhachHang(String ten, String line) {
        idCounter++;
        this.maKh = String.format("KH%02d", idCounter);
        this.ten = chuanHoa(ten);
        String[] parts = line.split(" ");
        this.loai = parts[0];
        this.sodau = Integer.parseInt(parts[1]);
        this.socuoi = Integer.parseInt(parts[2]);
    }

    public static String chuanHoa(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1).toLowerCase());
            result.append(" ");
        }
        return result.toString().trim();
    }

    public int tinhTienTrongDM() {
        int dinhmuc = 0;
        if (loai.equals("A")) dinhmuc = 100;
        else if (loai.equals("B")) dinhmuc = 500;
        else if (loai.equals("C")) dinhmuc = 200;

        int sodien = socuoi - sodau;
        return Math.min(sodien, dinhmuc) * 450;
    }

    public int tinhTienVuotDM() {
        int dinhmuc = 0;
        if (loai.equals("A")) dinhmuc = 100;
        else if (loai.equals("B")) dinhmuc = 500;
        else if (loai.equals("C")) dinhmuc = 200;

        int sodien = socuoi - sodau;
        if (sodien > dinhmuc) {
            return (sodien - dinhmuc) * 1000;
        }
        return 0;
    }

    public int tinhVAT() {
        return tinhTienVuotDM() * 5/100;
    }

    public double tongTien() {
        return tinhTienTrongDM() + tinhTienVuotDM() + tinhVAT();
    }

    @Override
    public String toString() {
        return maKh + " " + ten + " " + tinhTienTrongDM() + " " + tinhTienVuotDM() + " " + tinhVAT() + " " + String.format("%.0f", tongTien());
    }
}
