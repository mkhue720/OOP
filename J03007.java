import java.util.Scanner;

public class J03007 {
    static String check(String s){
        int n=s.length();
        long S = 0;
        for(int i=0; i<n; i++){
            char x=s.charAt(i);
            char y=s.charAt(n-i-1);
            S += (x - '0');
            if(x != y) return "NO";
        }
        if(S % 10 != 0) return "NO";
        if(s.charAt(0) != '8' || s.charAt(n-1) != '8') return "NO";
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(check(s));
        }
        sc.close();
    }
}