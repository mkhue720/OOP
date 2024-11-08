package nhieuclass;

public class KhachHang {
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;
    private static int dem = 1;

    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = String.format("KH%03d", dem++);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }
}

