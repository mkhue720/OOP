package J05006;

public class NhanVien {
    private static int dem = 0;
    private String ma;
    private String ten;
    private String gioitinh;
    private String ns;
    private String diachi;
    private String thue;
    private String ngayki;

    public NhanVien(String ten, String gioitinh, String ns, String diachi, String thue, String ngayki) {
        dem++;
        this.ma = String.format("%05d", dem);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ns = ns;
        this.diachi = diachi;
        this.thue = thue;
        this.ngayki = ngayki;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + ns + " " + diachi + " " + thue + " " + ngayki;
    }
}
