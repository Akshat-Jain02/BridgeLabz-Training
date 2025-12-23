import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate the choices of computer
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner of a single game
    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate wins and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage);

        return stats;
    }

    // Method to display game results and final statistics
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\t\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" +
                    games[i][0] + "\t\t" +
                    games[i][1] + "\t\t" +
                    games[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player\t\tWins\tWinning %");
        System.out.println("----------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();

        String[][] gameResults = new String[n][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}
