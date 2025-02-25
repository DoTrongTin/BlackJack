public class Card {
    private String suit; 
    private String rank;  

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        if (rank.equals("A")) return 11; 
        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) return 10;
        return Integer.parseInt(rank);
    }

    public String getRank() {
        return rank;
    }
    public String getSuits() {
        return suit;
    }
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

