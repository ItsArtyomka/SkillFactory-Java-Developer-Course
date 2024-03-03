package Code.Module.Set;

import java.util.Objects;

public final class Card {
    // Variables
    private final String rank;
    private final String suit;

    // Card Object Constructor.
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Overriding methods for HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(rank, card.rank) && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
