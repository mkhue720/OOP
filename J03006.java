import java.util.Scanner;

public class J03006 {
    static String check(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            char y=s.charAt(n-i-1);
            if(x!=y) return "NO";
            if((x-'0')%2 != 0) return "NO";
        }
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