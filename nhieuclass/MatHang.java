package nhieuclass;

public class MatHang {
    private String maMH, tenMH, donViTinh;
    private int giaMua, giaBan;
    private static int dem = 1;

    public MatHang(String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = String.format("MH%03d", dem++);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
}

