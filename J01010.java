import java.util.*;
public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String N = sc.nextLine();
            StringBuilder res = new StringBuilder();
            boolean check = true;
            for (char c : N.toCharArray()) {
                if (c == '0' || c == '1') {
                    res.append(c);
                } else if (c == '8' || c == '9') {
                    res.append('0');
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                String kq = res.toString().replaceFirst("^0+", "");
                if (kq.isEmpty()) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(kq);
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
