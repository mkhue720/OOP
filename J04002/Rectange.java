package J04002;

public class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange(double width, double height) {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return (width + height) * 2;
    }

    public String getFormattedColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public boolean check() {
        return width > 0 && height > 0;
    }
}