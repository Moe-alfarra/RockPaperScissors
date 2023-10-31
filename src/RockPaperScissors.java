import java.util.Scanner;


public class RockPaperScissors {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean playAgain = true;
        int userWins = 0;
        String result;

        while (playAgain){
            RPSGame aGame = new RPSGame();
            aGame.computerPlay();
            aGame.userPlay();
            result = aGame.determineWinner();
            if(result.equalsIgnoreCase("user")) {
                userWins ++;}
            System.out.println(aGame);

            System.out.println("Do you want to play again? (True = yes; False = no)");
            playAgain = keyboard.nextBoolean();
            keyboard.nextLine();
        }

        System.out.println("Thanks for playing!");
        System.out.println("You won " + userWins + " games.");
    }


}
