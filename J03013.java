import java.util.*;
import java.math.*;

public class J03013{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            int max = Math.max(a.toString().length(), b.toString().length());
            String ans = a.subtract(b).abs().toString();
            while(ans.length()<max) ans = "0" + ans;
            System.out.println(ans);
        }
    }
}