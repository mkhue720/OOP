package J05023;

public class SinhVien {
    private String msv;
    private String ten;
    private String lop;
    private String email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public String getKhoa() {
        return msv.substring(1, 3);
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }
}