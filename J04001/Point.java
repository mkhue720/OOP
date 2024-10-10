package J04001;

public class Point {
    private double x;
    private double y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }
    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.getX(), 2) + Math.pow(p1.y - p2.getY(), 2));
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
