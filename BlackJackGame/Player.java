import java.util.Scanner;

public class Player {
    private Hand hand;
    private Scanner scanner;

    public Player() {
        hand = new Hand();
        scanner = new Scanner(System.in);
    }

    public void drawCard(Deck deck) {
        hand.addCard(deck.drawCard());
    }

    public boolean wantsToHit() {
        System.out.print("Bạn có muốn rút bài? (y/n): ");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y");
    }

    public int getScore() {
        return hand.getScore();
    }

    public boolean isBusted() {
        return hand.getScore() > 21;
    }

    public Hand getHand() {
        return hand;
    }
}
