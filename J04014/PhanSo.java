package J04014;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void toiGian() {
        int gcd = gcd(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void inPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
