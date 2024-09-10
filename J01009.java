import java.util.*;
public class J01009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long s = 1;
        long tmp = 0;
        for (int b = 1; b<= a; b++) {
            s *= b;
            tmp += s;
        }
        System.out.println(tmp);
    }
}
