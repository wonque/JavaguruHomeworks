package homework9.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", area=" + calculateArea() +
                '}';
    }
}
