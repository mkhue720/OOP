import java.util.*;

public class ptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            double x = -b / a;
            System.out.printf("%.2f%n", x);
        }
    }
}
