package J07073;

public class MonHoc {
    private String ma;
    private String ten;
    private int sotc;
    private String lythuyet;
    private String thuchanh;

    public MonHoc(String ma, String ten, int sotc, String lythuyet, String thuchanh) {
        this.ma = ma;
        this.ten = ten;
        this.sotc = sotc;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sotc + " " + lythuyet + " " + thuchanh;
    }
}
