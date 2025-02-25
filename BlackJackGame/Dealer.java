public class Dealer {
    private Hand hand;

    public Dealer() {
        hand = new Hand();
    }

    public void drawCard(Deck deck) {
        hand.addCard(deck.drawCard());
    }

    public void play(Deck deck) {
        while (hand.getScore() < 17) {
            drawCard(deck);
        }
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

