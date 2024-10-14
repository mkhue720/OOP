package J07051;

import java.time.LocalDate;
public class KhachHang {
    private static int dem = 0;
    private String makh;
    private String tenkh;
    private String sophong;
    private LocalDate ngaynhan;
    private LocalDate ngaytra;
    private int dichvu;

    public KhachHang(String tenkh, String sophong, LocalDate ngaynhan, LocalDate ngaytra, int dichvu) {
        dem++;
        this.makh = String.format("KH%02d", dem);
        this.tenkh = tenkh;
        this.sophong = sophong;
        this.ngaynhan = ngaynhan;
        this.ngaytra = ngaytra;
        this.dichvu = dichvu;
    }

    public int tinhNgayO() {
        return (int) (ngaytra.toEpochDay() - ngaynhan.toEpochDay()) + 1;
    }

    public int tinhTien() {
        int sotang = Integer.parseInt(String.valueOf(sophong.charAt(0)));
        int tien = 0;
        switch (sotang) {
            case 1:
                tien = 25 * tinhNgayO() + this.dichvu;
                break;
            case 2:
                tien = 34 * tinhNgayO() + this.dichvu;
                break;
            case 3:
                tien = 50 * tinhNgayO() + this.dichvu;
                break;
            case 4:
                tien = 80 * tinhNgayO() + this.dichvu;
                break;
            default:
                tien = 0;
                break;
        }
        return tien;
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
        return makh + " " + chuanHoa(tenkh) + " " + sophong + " " + tinhNgayO() + " " + tinhTien();
    }
}
