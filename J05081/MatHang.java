package J05081;

public class MatHang {
    private static int dem = 0;
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang(String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        dem++;
        this.maMatHang = String.format("MH%03d", dem);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int loiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public void display() {
        System.out.printf("%s %s %s %d %d %d\n",
                this.maMatHang,
                this.tenMatHang,
                this.donViTinh,
                this.giaMua,
                this.giaBan,
                this.loiNhuan());
    }
}
