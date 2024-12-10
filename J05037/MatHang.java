package J05037;

public class MatHang {
    private static int dem = 0;
    private String mahang;
    private String ten;
    private String dv;
    private int nhap;
    private int soluong;

    public MatHang(String ten, String dv, int nhap, int soluong) {
        dem++;
        this.mahang = String.format("MH%02d", dem);
        this.ten = ten;
        this.dv = dv;
        this.nhap = nhap;
        this.soluong = soluong;
    }

    public long phiVanChuyen() {
        return Math.round(nhap * soluong * 0.05);
    }

    public long thanhTien() {
        return Math.round(nhap * soluong + phiVanChuyen());
    }

    public long giaBan() {
        double phi = thanhTien() * 1.02 / soluong;
        return (long)Math.ceil(phi / 100) * 100;
    }

    @Override
    public String toString() {
        return mahang + " " + ten + " " + dv + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}
