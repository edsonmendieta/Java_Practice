import java.util.*;

public class CardChoice {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter a card: ");
      String userRank = console.next();
      String userSuit = console.next();
      
      String ranks = "123456789JQKA";
      String suits = "CDHS";
      
      String cardRank = "";
      String cardSuit = "";
      
      for (int i = 0; i < ranks.length(); i++) { // identifies card rank
         if (userRank.charAt(0) == ranks.charAt(i)) {
            cardRank += ranks.charAt(i);
         }
      }
      
      if (cardRank.charAt(0) == '1' && userRank.length() > 1) { // identifies a rank of 10
         cardRank = "10";
      }
      
      
      if (cardRank.charAt(0) == 'J') {
         cardRank = "Jack";
      } else if (cardRank.charAt(0) == 'Q') {
         cardRank = "Queen";
      } else if (cardRank.charAt(0) == 'K') {
         cardRank = "King";
      } else if (cardRank.charAt(0) == 'A') {
         cardRank = "Ace";
      }
      
      if (userSuit.charAt(0) == 'C') {
         cardSuit = "Clubs";
      } else if (userSuit.charAt(0) == 'D') {
         cardSuit = "Diamonds";
      } else if (userSuit.charAt(0) == 'H') {
         cardSuit = "Hearts";
      } else if (userSuit.charAt(0) == 'S') {
         cardSuit = "Spades";
      }
      
      System.out.print(cardRank + " of " + cardSuit);
      
   } //main()
   
}