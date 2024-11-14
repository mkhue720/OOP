import java.util.*;
public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String N = sc.nextLine();
            boolean check = true;
            int tong = 0;
            for (int i = 0; i < N.length(); i++) {
                tong += N.charAt(i) - '0';
            }
            if (tong % 10 != 0) {
                check = false;
            }
            for (int i = 0; i < N.length() - 1; i++) {
                int truoc = N.charAt(i) - '0';
                int sau = N.charAt(i + 1) - '0';
                if (Math.abs(truoc - sau) != 2) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
