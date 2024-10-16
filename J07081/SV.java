package J07081;

public class SV {
    private String ma;
    private String ten;
    private String sdt;
    private String email;

    public SV(String ma, String ten, String sdt, String email) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        String[] parts = ten.trim().split("\\s+");
        return parts[parts.length - 1];
    }

    public String getHo() {
        String[] parts = ten.trim().split("\\s+");
        return parts[0];
    }

    public String getDem() {
        String[] parts = ten.trim().split("\\s+");
        StringBuilder tenDem = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            tenDem.append(parts[i]).append(" ");
        }
        return tenDem.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + email;
    }
}
