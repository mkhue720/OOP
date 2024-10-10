import java.util.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int m = sc.nextInt(); 
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            boolean isCheck = true;
            for (int i = 0; i < m / 2; i++) {
                if (a[i] != a[m - i - 1]) {
                    isCheck = false;
                    break;
                }
            }
            if (isCheck) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
