package nhieuclass;

public class HoaDon {
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;
    private static int dem = 1;

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = String.format("HD%03d", dem++);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public int thanhTien() {
        return matHang.getGiaBan() * soLuong;
    }

    @Override
    public String toString() {
        return maHD + " " + khachHang.getTenKH() + " " + khachHang.getDiaChi() + " " +
                matHang.getTenMH() + " " + matHang.getDonViTinh() + " " +
                matHang.getGiaMua() + " " + matHang.getGiaBan() + " " +
                soLuong + " " + thanhTien();
    }
}

