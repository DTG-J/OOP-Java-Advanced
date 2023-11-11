package polimorphism.shapes;

public class Circle  implements Shape {
    private final Double	radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double CalculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double CalculateArea() {
        return Math.PI * radius * radius;
    }

}
