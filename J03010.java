import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Đọc số lượng họ tên
        sc.nextLine(); // Đọc dòng còn lại sau số lượng họ tên

        // Mảng để lưu các email
        String[] emails = new String[n];
        // Mảng để đếm số lần xuất hiện của các email
        int[] emailCounts = new int[n];
        int emailCountIndex = 0;

        for (int i = 0; i < n; i++) {
            String fullName = sc.nextLine().trim();
            String[] parts = fullName.split("\\s+");
            if (parts.length == 0) {
                continue;
            }

            // Tạo tên email cơ bản
            String lastName = parts[0].toLowerCase();
            StringBuilder emailBuilder = new StringBuilder();
            emailBuilder.append(lastName);

            // Thêm chữ cái đầu của các tên đệm (nếu có)
            for (int j = 1; j < parts.length; j++) {
                emailBuilder.append(parts[j].charAt(0));
            }
            emailBuilder.append("@ptit.edu.vn");

            String email = emailBuilder.toString();

            // Kiểm tra trùng lặp và thêm số thứ tự
            boolean found = false;
            for (int k = 0; k < emailCountIndex; k++) {
                if (emails[k].equals(email)) {
                    emailCounts[k]++;
                    email = lastName + emailCounts[k] + "@ptit.edu.vn";
                    found = true;
                    break;
                }
            }

            if (!found) {
                emailCounts[emailCountIndex] = 0;
                emails[emailCountIndex] = email;
                emailCountIndex++;
            }

            // Thay thế email gốc nếu có trùng lặp
            if (emailCounts[emailCountIndex - 1] > 0) {
                email = lastName + emailCounts[emailCountIndex - 1] + "@ptit.edu.vn";
            }
        }

        // In kết quả
        for (int i = 0; i < emailCountIndex; i++) {
            System.out.println(emails[i]);
        }

        sc.close(); // Đóng Scanner
    }
}
