import  java.util.*;
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int dem = 0;
        for (int i = 0; i < n.length(); i++) {
            char so = n.charAt(i);
            if (so == '4' || so == '7') {
                dem++;
            }
        }
        if(dem == 4 || dem == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
