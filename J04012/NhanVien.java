package J04012;

public class NhanVien {
    private static int dem = 0;
    private String msv;
    private String ten;
    private int luongcoban;
    private int cong;
    private String chucvu;

    public NhanVien (String ten, int luongcoban, int cong, String chucvu) {
        dem++;
        this.msv = String.format("NV%02d", dem);
        this.ten = ten;
        this.luongcoban = luongcoban;
        this.cong = cong;
        this.chucvu = chucvu;
    }

    public int Luong() {
        return luongcoban * cong;
    }

    public int LuongThuong() {
        int luong = Luong();
        int thuong = 0;
        if (cong >= 25) {
            thuong = (int) (luong * 0.20);
        } else if (cong >= 22) {
            thuong = (int) (luong * 0.10);
        }
        return thuong;
    }

    public int PhuCap() {
        int tmp = 0;
        if (chucvu.equals("GD")) {
            tmp = 250000;
        }
        else if (chucvu.equals("PGD")) {
            tmp = 200000;
        }
        else if (chucvu.equals("TP")) {
            tmp = 180000;
        }
        else if (chucvu.equals("NV")) {
            tmp = 150000;
        }
        return tmp;
    }

    public int ThuNhap() {
        return Luong() + LuongThuong() + PhuCap();
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + Luong() + " " + LuongThuong() + " " + PhuCap() + " " + ThuNhap();
    }
}
