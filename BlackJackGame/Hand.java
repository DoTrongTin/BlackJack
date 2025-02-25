import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getScore() {
        int score = 0;
        int aceCount = 0;

        for (Card card : cards) {
            score += card.getValue();
            if (card.getValue() == 11) aceCount++;
        }

       
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }

        // ✨ Thêm phương thức này để sửa lỗi
        public List<Card> getCards() {
            return cards;
        }

        public boolean isBlackJack() {
            return cards.size() == 2 && getScore() == 21;
        }

        public boolean isXiBang() {
            return cards.size() == 2 && cards.get(0).getRank().equals("A") && cards.get(1).getRank().equals("A");
        }

        public boolean isNguLinh() {
            return cards.size() == 5 && getScore() <= 21;
        }
        
    @Override
    public String toString() {
        return cards.toString() + " (Total: " + getScore() + ")";
    }
}
