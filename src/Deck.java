import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> cards;
    private int size;

    public Deck(String[] ranks, String[] suits, int[] values) {
        this.cards = new ArrayList<>();
        for (int i = 0; i < suits.length; i ++) {
            for (int j = 0; j < ranks.length; j ++) {
                this.cards.add(new Card(ranks[j],suits[i], values[j]));
            }
        }
        this.size = this.cards.size();
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public int size() {
        return this.size;
    }

    public void shuffle() {
        int card;
        Card tempCard;
        for(int n = 0; n < size; n++)
        {
            card = (int)(Math.random() * (size - 1) + 1);
            tempCard = cards.get(card);
            cards.set(card, cards.get(n));
            cards.set(n, tempCard);
        }
    }
    public Card deal() {
        if(!this.isEmpty()) {
            this.size--;
            return cards.get(size);
        }
        return null;
    }

    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
