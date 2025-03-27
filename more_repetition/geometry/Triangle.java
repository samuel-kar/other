package repetera.objects.geometry;

public class Triangle {

    private double height;
    private double width;

    public Triangle() {
        height = 0;
        width = 0;
    }

    public Triangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return ((width * height) /2);
    }
}
