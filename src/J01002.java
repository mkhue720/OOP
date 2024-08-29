import java.util.*;
public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long S = 0;
        long array[] = new long [n];
        if (n>10) {
            System.exit(1);
        } else {
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                S = array[i] * (array[i] + 1) / 2;
                System.out.println(S);
            }

        }
    }
}
