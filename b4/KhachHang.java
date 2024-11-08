package b4;
import java.text.*;
import java.util.*;
public class KhachHang {
    private static int dem = 0;
    private String makh;
    private String ten;
    private String dc;
    private String masp;
    private int sl;
    private Date ngaymua;
    private Date ngayhetbh;
    private double tongtien;

    public KhachHang(String makh, String ten, String dc, String masp, int sl, Date ngaymua, Date ngayhetbh, double tongtien) {
        dem++;
        this.makh = String.format("KH0%d",dem);
        this.ten = ten;
        this.dc = dc;
        this.masp = masp;
        this.sl = sl;
        this.ngaymua = ngaymua;
        this.tongtien = tongtien;
    }

    public String getMakh() {
        return makh;
    }

    public String getNgayHetbh() {
        return ngayhetbh.toString();
    }
}

