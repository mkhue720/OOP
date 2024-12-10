package test;

public class SanPham {
    private static int dem = 0;
    private String mahang;
    private String tenhang;
    private int soluong;
    private int gia;

    public SanPham(String tenhang, int soluong, int gia) {
        dem++;
        this.mahang = chuanHoa(tenhang) + String.format("%02d", dem);
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
        int tien = gia * soluong;
        if (soluong > 10) {
            return tien * 5 / 100;
        } else if (soluong >= 8) {
            return tien * 2 / 100;
        } else if (soluong >= 5) {
            return tien / 100;
        } else {
            return 0;
        }
    }

    public int thanhTien() {
        return gia * soluong - chietKhau();
    }

    public String chuanHoa(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)));
        }
        return result.toString().substring(0, 2); // Lấy 2 ký tự đầu
    }

    @Override
    public String toString() {
        return mahang + " " + tenhang + " " + chietKhau() + " " + thanhTien();
    }
}
