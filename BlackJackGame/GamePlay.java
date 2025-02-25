  
    public class GamePlay  {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();


        player.drawCard(deck);
        player.drawCard(deck);
        dealer.drawCard(deck);
        dealer.drawCard(deck);

        System.out.println("Your hand: " + player.getHand());
        System.out.println("Dealer's hand: [" + dealer.getHand().getCards().get(0) + ", ?]");
        

        if(player.getHand().isXiBang()){
            System.out.println("You win (Xi Bang)!");
            return;
        }
        else if(player.getHand().isBlackJack() && !dealer.getHand().isBlac

        while (!player.isBusted() && player.wantsToHit()) {
            player.drawCard(deck);
            System.out.println("Your hand: " + player.getHand());
        }

        if (player.isBusted()) {
            System.out.println("You lose (Busted)!");
            return;
        }

       
        dealer.play(deck);
        System.out.println("Dealer's hand: " + dealer.getHand());

     
        if (dealer.isBusted() || player.getScore() > dealer.getScore()) {
            System.out.println("You win!");
        } else if (player.getScore() == dealer.getScore()) {
            System.out.println("Tie!");
        } else {
            System.out.println("You lose!");
        }
    }
}