package J07048;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int gia;
    private int baohanh;

    public SanPham(String maSP, String tenSP, int gia, int baohanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.baohanh = baohanh;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + gia + " " + baohanh;
    }
}
