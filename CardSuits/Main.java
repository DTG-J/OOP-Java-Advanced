package OOPJavaAdvanced.CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardSuits[] cardSuits = CardSuits.values();
        System.out.println("Card Suits:");
        for (CardSuits cardSuit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());

        }
    }

    //Card Suits:
    //Ordinal value: 0; Name value: CLUBS
    //Ordinal value: 1; Name value: DIAMONDS
    //Ordinal value: 2; Name value: HEARTS
    //Ordinal value: 3; Name value: SPADES
}
