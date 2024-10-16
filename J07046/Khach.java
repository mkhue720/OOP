package J07046;
import java.time.*;
public class Khach {
    private static int dem = 0;
    private String maKh;
    private String tenKh;
    private String maPhong;
    private LocalDate ngayDen;
    private LocalDate ngayDi;

    public Khach(String tenKh, String maPhong, LocalDate ngayDen, LocalDate ngayDi) {
        dem++;
        this.maKh = String.format("KH%02d", dem);
        this.tenKh = tenKh;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public int tinhNgay() {
        return (int) (ngayDi.toEpochDay() - ngayDen.toEpochDay());
    }

    @Override
    public String toString() {
        return maKh + " " + tenKh + " " + maPhong + " " + tinhNgay();
    }
}
