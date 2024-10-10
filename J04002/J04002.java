package J04002;
import java.util.*;
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        Rectange rec = new Rectange(width, height, color);
        if(rec.check()) {
            System.out.printf("%.0f %.0f %s\n", rec.findPerimeter(), rec.findArea(), rec.getFormattedColor());
        } else {
            System.out.println("INVALID");
        }
    }
}
