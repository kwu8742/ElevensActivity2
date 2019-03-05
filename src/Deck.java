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
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    }

    public Card deal() {
	    double randomDouble = Math.Random();	
	    int randomInt = (int)(randomDouble * 52);
	    
	    List<Card>cards = new ArrayList2<card>();
	    while(ArrayList2.length < 52)
	    {
		ArrayList2.add(ArrayList.get(randomInt));
	    	ArrayList.remove(randomInt);
	    }
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
