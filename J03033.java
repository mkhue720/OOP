import java.util.*;
import java.math.*;
public class J03033 {
    public static BigInteger UCLN(BigInteger a, BigInteger  b) {
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger temp = b;
            b = a.mod(b);
            a = temp;
        }
        return a;
    }

    public static BigInteger BCNN(BigInteger a, BigInteger b) {
        BigInteger res = UCLN(a, b);
        return (a.divide(res)).multiply(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextLong();
        while (n-- > 0) {
            BigInteger  a = sc.nextBigInteger();
            BigInteger  b = sc.nextBigInteger();
            System.out.println(BCNN(a, b));
        }
    }
}
