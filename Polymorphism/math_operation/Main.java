package polimorphism.math_operation;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println(math.add(2, 3));
        System.out.println(math.add(1, 2, 4));
        System.out.println(math.add(4, 6, 7 ,9));
    }
}
