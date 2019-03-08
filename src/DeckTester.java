public class DeckTester {

    public static void main(String[] args) {
        String[] ranks = {"Jack", "Queen", "King", "Seven", "Ten", "Ace", "Two", "Three", "Four", "Five", "Six", "Eight", "Nine"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] pointValues = {11, 12, 13, 7, 10, 1, 2, 3, 4, 5, 6, 8, 9};
        Deck one = new Deck(ranks, suits, pointValues);

        System.out.println(one.isEmpty());
        one.shuffle();
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());

        System.out.println(one.size());
        System.out.println(one.toString());
    }
}
