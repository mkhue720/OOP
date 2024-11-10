package J04004;

public class PhanSo {
    private long tuSo;
    private long mauSo;
    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void toiGian() {
        long gcd = gcd(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }
    public void inPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
