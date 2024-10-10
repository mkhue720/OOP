import java.util.*;
import java.io.*;
public class copyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("A.java"));
        PrintWriter out = new PrintWriter(new File("B.java"));
        while(sc.hasNextLine()) {
            out.println(sc.nextLine());
        }
        out.close();
    }
}
