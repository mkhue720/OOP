import java.util.*;

public class J03005 {
    // Hàm chuẩn hóa phần tên (viết hoa chữ cái đầu của mỗi từ)
    public static String chuanHoaTen(String s) {
        s = s.trim(); // Loại bỏ khoảng trắng thừa
        String[] words = s.split("\\s+"); // Tách các từ bằng khoảng trắng
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))); // Viết hoa chữ cái đầu
                result.append(word.substring(1).toLowerCase()); // Phần còn lại viết thường
                result.append(" "); // Thêm khoảng trắng vào sau mỗi từ
            }
        }
        return result.toString().trim(); // Trả về chuỗi đã chuẩn hóa và loại bỏ khoảng trắng cuối
    }

    // Hàm xử lý đưa họ tên về dạng chuẩn
    public static String chuanHoaHoTen(String s) {
        s = s.trim(); // Loại bỏ khoảng trắng thừa
        String[] words = s.split("\\s+"); // Tách chuỗi thành các từ bằng khoảng trắng

        // Kiểm tra xem chuỗi có ít nhất 2 từ hay không
        if (words.length < 2) {
            return chuanHoaTen(s); // Trả về nếu không có ít nhất 2 từ
        }

        String ho = words[words.length - 1].toUpperCase(); // Lấy phần họ và viết hoa
        String ten = chuanHoaTen(String.join(" ", Arrays.copyOf(words, words.length - 1))); // Phần tên đệm và tên

        return ten + ", " + ho; // Trả về chuỗi theo định dạng yêu cầu
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng tên cần xử lý
        int n = Integer.parseInt(sc.nextLine());

        // Vòng lặp đọc các chuỗi và xử lý
        while (n-- > 0) {
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) {
                System.out.println(chuanHoaHoTen(s));
            }
        }

        sc.close();
    }
}
