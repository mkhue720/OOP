import java.util.*;

public class test {
    static final long mod = 1000000007;
    static long Power(long a, long b){
        long so = 1;
        a %= mod;
        while(b>0){
            if(b % 2 == 1){
                so = (so*a) % mod;
            }
            a = (a*a)%mod;
            b/=2;
        }
        return so;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            sc.nextLine();
            long so = Power(a, b);
            System.out.println(so);
        }
        sc.close();
    }
}