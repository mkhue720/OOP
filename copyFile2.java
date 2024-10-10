import java.util.*;
import java.io.*;
public class copyFile2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(new File("A.docx"));
        FileOutputStream out = new FileOutputStream(new File("B.docx"));
        int t = 0;
        while (true) {
            t = in.read();
            if (t == -1) break;
            out.write(t);
        }
        out.close();
    }
}
