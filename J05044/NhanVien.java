package J05044;

public class NhanVien {
    private static int dem = 0;
    private String ma;
    private String ten;
    private int luong;
    private int ngay;
    private String chucvu;

    public NhanVien(String ten, String chucvu, int luong, int ngay) {
        dem ++;
        this.ma = String.format("NV%02d", dem);
        this.ten = ten;
        this.luong = luong;
        this.ngay = ngay;
        this.chucvu = chucvu;
    }

    public String getChucvu() {
        return chucvu;
    }

    public int luongThang() {
        return luong * ngay;
    }

    public int phuCap() {
        if (chucvu.equals("GD")) {
            return 500;
        } else if (chucvu.equals("PGD")) {
            return 400;
        } else if (chucvu.equals("TP")) {
            return 300;
        } else if (chucvu.equals("KT")) {
            return 250;
        } else {
            return 100;
        }
    }

    public int thucLinh() {
        return (luongThang()  + phuCap());
    }

    public int tamUng() {
        int ung = thucLinh() * 2 / 3;
        if (ung < 25000) {
            return (int) Math.round(ung / 1000.0) * 1000;
        } else {
            return 25000;
        }
    }

    public int conLai() {
        return thucLinh() - tamUng();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCap() + " " + luongThang() +  " " + tamUng() + " " + conLai();
    }
}
