package J05010;

public class MatHang {
    private static int dem = 0;
    private String ma;
    private String ten;
    private String nhom;
    private double mua;
    private double ban;

    public MatHang(String ten, String nhom, double mua, double ban) {
        dem++;
        this.ma = String.format("%d", dem);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }

    public double loiNhuan() {
        return ban - mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan());
    }
}
