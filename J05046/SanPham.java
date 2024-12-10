package J05046;

public class SanPham {
    private static int dem = 0;
    private String mahang;
    private String tenhang;
    private int soluong;
    private int gia;

    public SanPham(String tenhang, int soluong, int gia) {
        dem++;
        this.mahang = String.format("%s%02d", chuanHoa(tenhang), dem);
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getGia() {
        return gia;
    }

    public int chietKhau() {
        int tien = getGia() * getSoluong();
        if (getSoluong() > 10) {
            return tien * 5 / 100;
        }
        else if (getSoluong() >= 8) {
            return tien * 2 / 100;
        }
        else if (getSoluong() >= 5) {
            return tien / 100;
        }
        else return 0;
    }

    public int thanhTien() {
        return getGia() * getSoluong() - chietKhau();
    }

    public String chuanHoa(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0)));
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return mahang + " " + tenhang + " " + chietKhau() + " " + thanhTien();
    }
}
