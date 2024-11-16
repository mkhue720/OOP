package J05028;

public class DoanhNghiep {
    private String ma;
    private String ten;
    private int soluong;

    public DoanhNghiep(String ma, String ten, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong;
    }
}
