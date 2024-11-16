package J05031;

public class SinhVien {
    private String msv;
    private String ten;
    private String lop;
    private double diem1, diem2, diem3;

    public SinhVien(String msv, String ten, String lop, double diem1, double diem2, double diem3) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f", msv, ten, lop, diem1, diem2, diem3);
    }
}
