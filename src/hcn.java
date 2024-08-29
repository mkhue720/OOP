import java.util.*;
public class hcn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a<=0 || b<=0) {
            System.out.println(0);
        } else {
            System.out.print((a+b)*2);
            System.out.print(" ");
            System.out.println(a*b);
        }
    }
}
