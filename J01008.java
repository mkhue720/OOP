import java.util.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt(); 
            int sqr = (int) Math.sqrt(n); 
            boolean check = true;
            System.out.print("Test " + (i + 1) + ": ");
            for (int j = 2; j <= sqr; j++) {
                if (n % j == 0) {
                    int dem = 0;
                    while (n % j == 0) {
                        dem++;
                        n /= j;
                    }
                    if (check) {
                        System.out.print(j + "(" + dem + ")");
                        check = false;
                    } else {
                        System.out.print(" " + j + "(" + dem + ")");
                    }
                    sqr = (int) Math.sqrt(n); 
                }
            }
            if (n > 1) {
                if (check) {
                    System.out.print(n + "(1)");
                } else {
                    System.out.print(" " + n + "(1)");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
