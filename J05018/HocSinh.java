package J05018;

public class HocSinh {
    private static int dem = 0;
    private String msv;
    private String ten;
    private float toan;
    private float tv;
    private float nn;
    private float ly;
    private float hoa;
    private float sinh;
    private float su;
    private float dia;
    private float gdcd;
    private float cn;

    public HocSinh(String ten, float toan, float tv, float nn, float ly, float hoa, float sinh, float su, float dia, float gdcd, float cn) {
        dem++;
        this.msv = String.format("HS%02d", dem);
        this.ten = ten;
        this.toan = toan;
        this.tv = tv;
        this.nn = nn;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
        this.cn = cn;
    }

    public float diemTB() {
        float dtb = (toan * 2 + tv * 2 + nn + ly + hoa + sinh + su + dia + gdcd + cn) / 12.0f;
        return (float) (Math.floor(dtb * 10) / 10.0f);
    }


    public String xepLoai() {
        String xl;
        float dtb = diemTB();
        if (dtb >= 9) {
            xl = "XUAT SAC";
        } else if (dtb >= 8) {
            xl = "GIOI";
        } else if (dtb >= 7) {
            xl = "KHA";
        } else if (dtb >= 5) {
            xl = "TB";
        } else {
            xl = "YEU";
        }
        return xl;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + diemTB() + " " + xepLoai();
    }
}
