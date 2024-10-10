import java.io.*;
import java.util.*;

class SV {
    String maSV;
    String hoTen;
    String lop;
    String email;
    String soDienThoai;

    public SV(String maSV, String hoTen, String lop, String email, String soDienThoai) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.soDienThoai = "0" + soDienThoai; // Bổ sung số 0 vào đầu số điện thoại
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + email + " " + soDienThoai;
    }
}

public class DanhSachLL {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            List<SV> danhSach = new ArrayList<>();

            while (sc.hasNextLine()) {
                // Kiểm tra nếu file còn dòng để đọc
                if (!sc.hasNextLine()) break;
                String maSV = sc.nextLine().trim();

                if (!sc.hasNextLine()) break;
                String hoTen = sc.nextLine().trim();

                if (!sc.hasNextLine()) break;
                String lop = sc.nextLine().trim();

                if (!sc.hasNextLine()) break;
                String email = sc.nextLine().trim();

                if (!sc.hasNextLine()) break;
                String soDienThoai = sc.nextLine().trim();

                SV sv = new SV(maSV, hoTen, lop, email, soDienThoai);
                danhSach.add(sv);
            }
            sc.close();

            // Sắp xếp danh sách theo lớp, nếu cùng lớp thì sắp xếp theo mã sinh viên
            Collections.sort(danhSach, new Comparator<SV>() {
                @Override
                public int compare(SV sv1, SV sv2) {
                    int cmp = sv1.lop.compareTo(sv2.lop);
                    if (cmp != 0) {
                        return cmp;
                    }
                    return sv1.maSV.compareTo(sv2.maSV);
                }
            });

            // Xuất kết quả
            for (SV sv : danhSach) {
                System.out.println(sv);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
