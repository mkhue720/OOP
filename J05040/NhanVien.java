package J05040;

public class NhanVien {
    private static int dem = 0;
    private String ma;
    private String ten;
    private int luong;
    private int ngay;
    private String chucvu;

    public NhanVien(String ten, int luong, int ngay, String chucvu) {
        dem ++;
        this.ma = String.format("NV%02d", dem);
        this.ten = ten;
        this.luong = luong;
        this.ngay = ngay;
        this.chucvu = chucvu;
    }

    public long luongThang() {
        return (long)luong * ngay;
    }

    public long thuong() {
        if (ngay >= 25) {
            return luongThang() * 20 /100;
        } else if (ngay >= 22) {
            return luongThang() * 10 /100;
        } else {
            return 0;
        }
    }

    public int phuCap() {
        if (chucvu.equals("GD")) {
            return 250000;
        } else if (chucvu.equals("PGD")) {
            return 200000;
        } else if (chucvu.equals("TP")) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public long thucLinh() {
        return (long)(luongThang() + thuong() + phuCap());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + thucLinh();
    }
}
