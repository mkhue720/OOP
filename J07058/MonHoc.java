package J07058;

public class MonHoc {
    private String ma;
    private String ten;
    private String hinhthuc;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;
    }
}
