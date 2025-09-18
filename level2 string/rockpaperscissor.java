import java.util.Scanner;

public class RockPaperScissorsDemo {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("Rock") && computer.equals("Scissors") ||
            user.equals("Paper") && computer.equals("Rock") ||
            user.equals("Scissors") && computer.equals("Paper")) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(String[] results) {
        int userWins = 0, computerWins = 0, draws = 0;
        for (String res : results) {
            if (res.equals("User")) userWins++;
            else if (res.equals("Computer")) computerWins++;
            else draws++;
        }
        int totalGames = results.length;
        double userPercent = ((double)userWins / totalGames) * 100;
        double com
