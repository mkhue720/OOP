package J05034;

public class SinhVien {
    private static int dem = 0;
    private int stt;
    private String msv;
    private String ten;
    private String lop;
    private String email;
    private String doanhnghiep;

    public SinhVien(String msv, String ten, String lop, String email, String doanhnghiep) {
        dem++;
        this.stt = dem;
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhnghiep = doanhnghiep;
    }

    public String getTen() {
        return ten;
    }

    public String getDoanhnghiep() {
        return doanhnghiep;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %s", stt, msv, ten, lop, email, doanhnghiep);
    }
}
