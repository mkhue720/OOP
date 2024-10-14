import java.util.Scanner;

public class J01013 {
    public static final int MAX = 2000000;
    public static int[] a = new int[MAX + 1];
    public static void check() {
        for (int i = 2; i <= MAX; i++) {
            if (a[i] == 0) {
                for (int j = i; j <= MAX; j += i) {
                    int temp = j;
                    while (temp % i == 0) {
                        a[j] += i;
                        temp /= i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(); 
        int N = sc.nextInt();
        long res = 0;  
        while (N-- > 0) {
            int num = sc.nextInt();
            res += a[num]; 
        }
        System.out.println(res);
        sc.close();
    }
}
