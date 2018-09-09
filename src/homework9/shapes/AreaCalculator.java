package homework9.shapes;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AreaCalculator {

    public static double generateRandomDouble() {
        return ThreadLocalRandom.current().nextDouble(0, 190.40);
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(AreaCalculator.generateRandomDouble());
        Rectangle rectangle = new Rectangle(AreaCalculator.generateRandomDouble(), AreaCalculator.generateRandomDouble());
        Square square = new Square(AreaCalculator.generateRandomDouble());
        RegularPolygon regularPolygon = new RegularPolygon(5, AreaCalculator.generateRandomDouble());
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(regularPolygon);

        double sumOfAreas = 0;
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
            System.out.println();
            sumOfAreas += shapes.get(i).calculateArea();
        }
        System.out.println(Math.round(sumOfAreas));
    }

}
