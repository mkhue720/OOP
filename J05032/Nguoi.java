package J05032;
import java.util.*;
public class Nguoi {
    private String name;
    private String dob; // dd/mm/yyyy

    public Nguoi(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        String[] parts = dob.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getTime();
    }
}
