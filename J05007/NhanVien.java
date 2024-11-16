package J05007;
import java.util.*;
import java.text.*;
public class NhanVien {
    private static int dem = 0;
    private String ma;
    private String ten;
    private String gioitinh;
    private Date ns;
    private String diachi;
    private String thue;
    private String ngayki;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public NhanVien(String ten, String gioitinh, String ns, String diachi, String thue, String ngayki) throws ParseException {
        dem++;
        this.ma = String.format("%05d", dem);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ns = sdf.parse(ns);
        this.diachi = diachi;
        this.thue = thue;
        this.ngayki = ngayki;
    }

    public Date getNgaySinh() {
        return ns;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + sdf.format(ns) + " " + diachi + " " + thue + " " + ngayki;
    }
}
