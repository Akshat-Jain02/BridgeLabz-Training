import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize deck
    static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle deck
    static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    static String[][] distributeCards(String[] deck, int players) {
        int totalCards = deck.length;

        if (totalCards % players != 0) {
            System.out.println("Cards cannot be distributed evenly.");
            return null;
        }

        int cardsPerPlayer = totalCards / players;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    // Method to print players and cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King", "Ace"
        };

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        //Create deck
        String[] deck = initializeDeck(suits, ranks);

        //Shuffle deck
        shuffleDeck(deck);

        // Distribute cards
        String[][] playerCards = distributeCards(deck, players);

        // Print cards
        if (playerCards != null) {
            printPlayers(playerCards);
        }

        sc.close();
    }
}
