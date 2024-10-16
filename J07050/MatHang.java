package J07050;

public class MatHang {
    private static int dem = 0;
    private String maHang;
    private String tenHang;
    private String nhomHang;
    private double giaMua;
    private double giaBan;

    public MatHang(String tenHang, String nhomHang , double giaMua , double giaBan) {
        dem++;
        this.maHang = String.format("MH%02d", dem);
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loiNhuan() {
        return  giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", loiNhuan());
    }

}
