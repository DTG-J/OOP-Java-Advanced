package polimorphism.shapes;

import java.text.DecimalFormat;

public class MainShapes {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Rectangle rectangle = new Rectangle(4.0, 5.2);
        System.out.println(decimalFormat.format(rectangle.CalculateArea()));
        System.out.println( rectangle.CalculatePerimeter());

        Circle circle = new Circle(4.2);
        System.out.println(decimalFormat.format(circle.CalculateArea()));
        System.out.println(decimalFormat.format(circle.CalculatePerimeter()));
    }

}
