import java.util.*;
import java.math.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- > 0) {
            BigInteger n = sc.nextBigInteger();
            if (n.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
