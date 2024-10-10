import java.util.Scanner;

public class J03008 {
    static String check(String s){
        int n=s.length();
        String nt = "2357";
        for(int i=0;i<n;i++){
            if(nt.indexOf(s.charAt(i))==-1) return "NO";
            if(s.charAt(i)!=s.charAt(n-1-i)) return "NO";
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