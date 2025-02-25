import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    private Random random = new Random();
    
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"A"};
        cards = new ArrayList<>();
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        fisherYatesShuffle();
    }

    

    // Fisher-Yates Shuffle algorithm
    public void fisherYatesShuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Collections.swap(cards, i, j);
        }
    }


    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
}
