package J07037;

public class DN {
    private String ma;
    private String ten;
    private int num;
    public DN(String ma, String ten, int num) {
        this.ma = ma;
        this.ten = ten;
        this.num = num;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + num;
    }
}
