import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mohammed Alfarra
 */
public class RPSGame
{
    char userChoice, computerChoice;

    public RPSGame()
    {
        userChoice = 'R';
        computerChoice = 'R';
    }

    public char getUserChoice()
    {
        return userChoice;
    }

    public char getComputerChoice()
    {
        return computerChoice;
    }

    public void setUserChoice(char aUserChoice)
    {
        userChoice = aUserChoice;
    }

    public void setComputerChoice(char aComputerChoice)
    {
        computerChoice = aComputerChoice;
    }

    public String toString()
    {
        return "User Choice: " + userChoice + " Computer Choice: " + computerChoice;
    }

    public void computerPlay()
    {
        Random myRan = new Random();
        int numComputerChoice = myRan.nextInt(1,4);
        switch (numComputerChoice) {
            case 1 -> computerChoice = 'R';
            case 2 -> computerChoice = 'P';
            case 3 -> computerChoice = 'S';
        }
    }

    public void userPlay()
    {
        Scanner keyboard = new Scanner(System.in);
        String strUserChoice;
        System.out.println("What is your choice - Rock, Paper, or Scissors ?");
        strUserChoice = keyboard.nextLine();
        strUserChoice = strUserChoice.toUpperCase();
        userChoice = strUserChoice.charAt(0);

    }

    public String determineWinner()
    {
        String winner = " ";
        if (userChoice == 'S' && computerChoice == 'R') {
            System.out.println("The computer won.");
            winner = "computer";
        }
        else if (userChoice == 'S' && computerChoice == 'P'){
            System.out.println("The user won.");
            winner = "user";
        }
        else if (userChoice == 'S' && computerChoice == 'S') {
            System.out.println("It's a tie. No one won.");
            winner = "tie";
        }

        else if (userChoice == 'R' && computerChoice == 'R') {
            System.out.println("It's a tie. No one won.");
            winner = "tie";
        }
        else if (userChoice == 'R' && computerChoice == 'P') {
            System.out.println("The computer won.");
            winner = "computer";
        }
        else if (userChoice == 'R' && computerChoice == 'S') {
            System.out.println("The user won.");
            winner = "user";
        }

        else if (userChoice == 'P' && computerChoice == 'R') {
            System.out.println("The user won.");
            winner = "user";
        }
        else if (userChoice == 'P' && computerChoice == 'P') {
            System.out.println("It's a tie. No one won.");
            winner = "tie";
        }
        else if (userChoice == 'P' && computerChoice == 'S') {
            System.out.println("The computer won.");
            winner = "computer";
        }
        else {
            System.out.println("Please enter a valid choice.");
            winner = "invalid";
        }
        return winner;
    }
}