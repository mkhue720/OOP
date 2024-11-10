package J05009;

public class ThiSinh {
    private static int dem = 0;
    private String ma;
    private String ten;
    private String ns;
    private double mon1;
    private double mon2;
    private double mon3;

    public ThiSinh(String ten, String ns, double mon1, double mon2, double mon3) {
        dem++;
        this.ma = String.format("%d", dem);
        this.ten = ten;
        this.ns = ns;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public String getMa() {
        return ma;
    }

    public Double tongDiem() {
        return mon1 + mon2 + mon3;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ns + " " + tongDiem();
    }
}
