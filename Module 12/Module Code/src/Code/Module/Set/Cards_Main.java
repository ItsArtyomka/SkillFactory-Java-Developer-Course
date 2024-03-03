package Code.Module.Set;

import java.util.HashSet;
import java.util.Set;

public class Cards_Main {

    public static void main(String[] args) {
        // Creating the card set.
        Set<Card> set = new HashSet<>();

        //---Creating the cards---
        // Hearts
        set.add(new Card("6", "Hearts"));
        set.add(new Card("7", "Hearts"));
        set.add(new Card("8", "Hearts"));
        set.add(new Card("9", "Hearts"));
        set.add(new Card("10", "Hearts"));
        set.add(new Card("Jack", "Hearts"));
        set.add(new Card("Queen", "Hearts"));
        set.add(new Card("King", "Hearts"));
        set.add(new Card("Ace", "Hearts"));

        // Diamonds
        set.add(new Card("6", "Diamonds"));
        set.add(new Card("7", "Diamonds"));
        set.add(new Card("8", "Diamonds"));
        set.add(new Card("9", "Diamonds"));
        set.add(new Card("10", "Diamonds"));
        set.add(new Card("Jack", "Diamonds"));
        set.add(new Card("Queen", "Diamonds"));
        set.add(new Card("King", "Diamonds"));
        set.add(new Card("Ace", "Diamonds"));

        // Clubs
        set.add(new Card("6", "Clubs"));
        set.add(new Card("7", "Clubs"));
        set.add(new Card("8", "Clubs"));
        set.add(new Card("9", "Clubs"));
        set.add(new Card("10", "Clubs"));
        set.add(new Card("Jack", "Clubs"));
        set.add(new Card("Queen", "Clubs"));
        set.add(new Card("King", "Clubs"));
        set.add(new Card("Ace", "Clubs"));

        // Spades
        set.add(new Card("6", "Spades"));
        set.add(new Card("7", "Spades"));
        set.add(new Card("8", "Spades"));
        set.add(new Card("9", "Spades"));
        set.add(new Card("10", "Spades"));
        set.add(new Card("Jack", "Spades"));
        set.add(new Card("Queen", "Spades"));
        set.add(new Card("King", "Spades"));
        set.add(new Card("Ace", "Spades"));

        // Extra cards that don't get included because it's a HashSet,
        // It only contains unique values(card object in this case).
//        set.add(new Card("King", "Clubs"));
//        set.add(new Card("Queen", "Hearts"));
//        set.add(new Card("6", "Diamonds"));
//        set.add(new Card("9", "Spades"));

        // Output
        System.out.println(set.size()); // 36
    }
}