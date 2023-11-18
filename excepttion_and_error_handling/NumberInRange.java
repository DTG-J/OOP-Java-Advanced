package excepttion_and_error_handling;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersRange = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int startNum = numbersRange[0];
        int endNum = numbersRange[1];

        System.out.printf("Range: [%d...%d]\n", startNum, endNum);

        String input = scanner.nextLine();


        while (!ValidInput(input, startNum, endNum)) {
            input = scanner.nextLine();
        }


   }

    private static boolean ValidInput(String input, int startNum, int endNum) {

        Optional<Integer> number = Optional.empty();
        try {
            number = Optional.of(Integer.parseInt(input));
        } catch (NumberFormatException ignored) {
        }

        boolean numberIsValid = number.isPresent()
                && number.get() >= startNum
                && number.get() <= endNum;

        String output = numberIsValid ? String.format("Valid number: %d", number.get())
                : String.format("Invalid number: %s", input);

        System.out.println(output);
        return numberIsValid;

    }
}
