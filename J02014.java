import java.util.*;
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while (N-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int trai = 0;
            int tong = 0;
            int tmp = -1;
            boolean check = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                tong += arr[i];
            }
            for (int i = 0; i < n; i++) {
                if (trai == tong - trai - arr[i]) {
                    tmp = i + 1;
                    break;
                }
                trai += arr[i];
            }
            System.out.println(tmp);
        }
    }
}
