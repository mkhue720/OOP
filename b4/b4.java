//package b4;
//import java.util.*;
//import java.io.*;
//import java.text.*;
//public class b4 {
//    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        int N = Integer.parseInt(sc.nextLine());
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Map<String, SanPham> sp = new HashMap<>();
//        while (N-- > 0) {
//            String masp = sc.nextLine().trim();
//            String tensp = sc.nextLine().trim();
//            double giaban = Double.parseDouble(sc.nextLine().trim());
//            int bh = Integer.parseInt(sc.nextLine().trim());
//            sp.put(masp, new SanPham(masp, tensp, giaban, bh));
//        }
//
//        int M = Integer.parseInt(sc.nextLine().trim());
//        List<KhachHang> kh = new ArrayList<>();
//        while (N-- > 0) {
//            String ten = sc.nextLine().trim();
//            String dc = sc.nextLine().trim();
//            String masp = sc.nextLine().trim();
//            int sl = Integer.parseInt(sc.nextLine().trim());
//            Date ngaymua = sdf.parse(sc.nextLine().trim());
//            SanPham sanpham = sp.get(masp);
////            double tongtien = sl * sanpham.getGia();
//            Calendar c = Calendar.getInstance();
//            c.setTime(ngaymua);
//            c.add(Calendar.MONTH, sanpham.getBh());
//            Date ngayhetbh = c.getTime();
//            kh.add(new KhachHang(ten, dc, masp, sl, ngaymua));
//            Collections.sort(kh, new Comparator<b4.KhachHang>() {
//                @Override
//                public int compare(b4.KhachHang o1, b4.KhachHang o2) {
//                    int tmp = o1.getNgayHetbh;
//                }
//            });
//        }
//    }
//}
