package OOPJavaAdvanced;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        printRhombus(size);
    }

    private static void printRhombusLine(int size, int i) {
        for (int space = 1; space <= size - i; space++) {
            System.out.print(" ");

        }
        for (int star = 1; star <= i; star++) {
            System.out.print("* ");

        }
        System.out.println();
    }

    private static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printRhombusLine(size, i);

        }
        for (int i = size - 1; i >= 1 ; i--) {
            printRhombusLine(size, i);


        }
    }
}
