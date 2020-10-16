/*
Author Brandon Lenz
Date 10/15/2020
Testing comment
Card Shuffle
*/

import java.util.ArrayList;

public class CardShuffle {

    // Allows the user to shuffle a deck of cards and print the result

    public static void main(String[] args) {
        String deckofCards[] = {"Ace of Hearts" ,"Two of Hearts" ,"Three of Hearts" ,"Four of Hearts" ,"Five of Hearts" ,"Six of Hearts" ,"Seven of Hearts" ,"Eight of Hearts" ,"Nine of Hearts" ,"Ten of Hearts" ,"Jack of Hearts" ,"Queen of Hearts" ,"King of Hearts" ,"Ace of Diamonds" ,"Two of Diamonds" ,"Three of Diamonds" ,"Four of Diamonds" ,"Five of Diamonds" ,"Six of Diamonds" ,"Seven of Diamonds" ,"Eight of Diamonds" ,"Nine of Diamonds" ,"Ten of Diamonds" ,"Jack of Diamonds" ,"Queen of Diamonds" ,"King of Diamonds" ,"Ace of Clubs" ,"Two of Clubs" ,"Three of Clubs" ,"Four of Clubs" ,"Five of Clubs" ,"Six of Clubs" ,"Seven of Clubs" ,"Eight of Clubs" ,"Nine of Clubs" ,"Ten of Clubs" ,"Jack of Clubs" ,"Queen of Clubs" ,"King of Clubs" ,"Ace of Spades" ,"Two of Spades" ,"Three of Spades" ,"Four of Spades" ,"Five of Spades" ,"Six of Spades" ,"Seven of Spades" ,"Eight of Spades" ,"Nine of Spades" ,"Ten of Spades" ,"Jack of Spades" ,"Queen of Spades" ,"King of Spades"};
        
        ArrayList<String> unshuffledCards = new ArrayList<String>();
        ArrayList<String> shuffledCards = new ArrayList<String>();

        for (int i = 0; i < deckofCards.length; i++){
            unshuffledCards.add(deckofCards[i]);
        }

        for (int i = 0; i < deckofCards.length; i++){
            double ranNum = Math.random() * (deckofCards.length - i);
            int ranInt = (int)ranNum;
            shuffledCards.add(unshuffledCards.get(ranInt));
            unshuffledCards.remove(ranInt);
        }

        System.out.println(shuffledCards);

    }
}