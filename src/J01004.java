import java.util.*;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int j = 0; j < a; j++) {
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("NO");
            } else if (n == 2) {
                System.out.println("YES");
            } else if (n % 2 == 0) {
                System.out.println("NO");
            } else {
                boolean kq = true;
                for (int i = 3; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        kq = false;
                    }
                }
                if (kq) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
