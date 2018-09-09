package homework9.shapes;

public class RegularPolygon extends Shape{

    private int numberOfSides;
    private double sideLength;

    public RegularPolygon (int numberOfSides, double sideLength){
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return (0.25*numberOfSides*sideLength*sideLength/Math.tan(Math.PI/numberOfSides));
    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "numberOfSides=" + numberOfSides +
                ", sideLength=" + sideLength + ", area=" +calculateArea() +
                '}';
    }
}
