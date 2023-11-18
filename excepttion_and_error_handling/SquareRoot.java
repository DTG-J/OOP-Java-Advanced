package excepttion_and_error_handling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = -1;
        try {
            number = Integer.parseInt(input);
        }catch (NumberFormatException ignored){
        }

        if (number >= 0){
            double sqrtNum = Math.sqrt(number);
            System.out.printf("%.2f\n", sqrtNum);

        } else { System.out.print("Invalid\n");
        }
        System.out.println("Goodbye");

    }
   /* public static boolean numIsValid (String input){
        for (char c:input.toCharArray()) {
            if (Character.isDigit(c) && Integer.parseInt(input) >= 0){
                return true;
            }
        }
        return false;
    }*/
}
