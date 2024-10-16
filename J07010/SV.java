package J07010;
import java.text.*;
import java.util.*;

public class SV {
    private static int dem = 0;
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private double gpa;

    public SV(String ten, String lop, Date ngaysinh, double gpa) {
        dem++;
        this.ma = String.format("B20DCCN%03d", dem);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gpa = gpa;
    }

    public static Date chuanHoaNgaySinh(String ngaySinh) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/M/yyyy");
        return inputFormat.parse(ngaySinh);
    }

    public String getNgaySinh() {
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        return outputFormat.format(ngaysinh);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + getNgaySinh() + " " + String.format("%.2f", gpa);
    }
}
