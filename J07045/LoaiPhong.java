package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String ma;
    private String ten;
    private int gia;
    private double phipv;

    public LoaiPhong(String line) {
        String[] parts = line.split(" ");
        this.ma = parts[0];
        this.ten = parts[1];
        this.gia = Integer.parseInt(parts[2]);
        this.phipv = Double.parseDouble(parts[3]);
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.ten.compareTo(other.ten); 
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + String.format("%.2f", phipv);
    }
}
