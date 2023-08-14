package E5_16;

import java.util.Scanner;
public class CardRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ente the card notation : ");
        String cardNotation = in.next();

        Card card = new Card(cardNotation);
        String description = card.getDescription();
        System.out.println(description);
    }
}
