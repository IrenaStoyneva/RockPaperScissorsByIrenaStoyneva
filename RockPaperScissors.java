import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ROCK = "rock";
        String PAPER = "paper";
        String SCISSORS = "scissors";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid input. Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);

        String computerMove = "";

        switch (computerRandomNumber) {
            case 0:
                computerMove = "rock";
                break;
            case 1:
                computerMove = "paper";
                break;
            case 2:
                computerMove = "scissors";
                break;
        }
        System.out.printf("The computer choose %s.%n", computerMove);


        if (playerMove.equals("rock") && computerMove.equals("scissors") || playerMove.equals("paper") && computerMove.equals("rock") ||
                playerMove.equals("scissors") && computerMove.equals("paper")) {
            System.out.println("You win.");
        } else if (computerMove.equals("rock") && playerMove.equals("scissors") || computerMove.equals("scissors") && playerMove.equals("paper") ||
                computerMove.equals("paper") && playerMove.equals("rock")) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }


    }

}