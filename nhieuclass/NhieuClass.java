package nhieuclass;

import java.util.*;
import java.io.*;

public class NhieuClass {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scKH = new Scanner(new File("KH.in"));
        Scanner scMH = new Scanner(new File("MH.in"));
        Scanner scHD = new Scanner(new File("HD.in"));
        int N = Integer.parseInt(scKH.nextLine());
        List<KhachHang> khachHangList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String tenKH = scKH.nextLine();
            String gioiTinh = scKH.nextLine();
            String ngaySinh = scKH.nextLine();
            String diaChi = scKH.nextLine();
            khachHangList.add(new KhachHang(tenKH, gioiTinh, ngaySinh, diaChi));
        }
        int M = Integer.parseInt(scMH.nextLine());
        List<MatHang> matHangList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String tenMH = scMH.nextLine();
            String donViTinh = scMH.nextLine();
            int giaMua = Integer.parseInt(scMH.nextLine());
            int giaBan = Integer.parseInt(scMH.nextLine());
            matHangList.add(new MatHang(tenMH, donViTinh, giaMua, giaBan));
        }
        int K = Integer.parseInt(scHD.nextLine());
        List<HoaDon> hoaDonList = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            String maKH = scHD.next();
            String maMH = scHD.next();
            int soLuong = scHD.nextInt();

            KhachHang kh = null;
            MatHang mh = null;

            for (KhachHang k : khachHangList) {
                if (k.getMaKH().equals(maKH)) {
                    kh = k;
                    break;
                }
            }

            for (MatHang m : matHangList) {
                if (m.getMaMH().equals(maMH)) {
                    mh = m;
                    break;
                }
            }

            hoaDonList.add(new HoaDon(kh, mh, soLuong));
        }

        for (HoaDon hd : hoaDonList) {
            System.out.println(hd);
        }
    }
}

