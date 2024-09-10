import java.util.*;
import java.math.*;
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String aStr = sc.nextLine().trim();
            String bStr = sc.nextLine().trim();

            BigInteger a = new BigInteger(aStr);
            BigInteger b = new BigInteger(bStr);
            BigInteger c = a.subtract(b).abs();

            String cStr = c.toString();
            int maxLength = Math.max(aStr.length(), bStr.length());
            while (cStr.length() < maxLength) {
                cStr = "0" + cStr;
            }
            System.out.println(cStr);
        }
    }
}
