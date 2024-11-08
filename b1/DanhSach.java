package b1;

public class DanhSach {
    private String ma;
    private String ten;
    private String lop;
    private String email;
    private String sdt;

    public DanhSach(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    public String getLop() {
        return lop;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email + " 0" + sdt;
    }
}
