package J07033;

public class SinhVien {
    private String msv;
    private String ten;
    private String lop;
    private String mail;

    public SinhVien(String msv, String ten, String lop, String mail) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + mail;
    }
}
