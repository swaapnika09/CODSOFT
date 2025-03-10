import java.util.Random;
import java.util.Scanner;
public class codsoft_1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain=true;
        int roundsWon=0;  
        int attemptsLeft=5;
        System.out.println("Welcome to the Number Guessing Game!");
        while(playAgain){
            int numberToGuess=random.nextInt(100)+1;
            System.out.println("\nI have chosen a number between 1 and 100. Can you guess it?");
            System.out.println("You have "+attemptsLeft+" attempts");
            while(attemptsLeft>0){
                System.out.println("Enter your Guess");
                int userGuess=scanner.nextInt();
                attemptsLeft--;
                if(userGuess==numberToGuess){
                    System.out.println("Congratulations! You guessed the correct number."); 
                    roundsWon++;
                    break;
                }else if(userGuess>numberToGuess){
                    System.out.println("Too high! Try again."); 
                }else{
                    System.out.println("Too low! Try again."); 
                }
                if(attemptsLeft>0){
                    System.out.println("Attempts left:"+attemptsLeft); 
                }else{
                    System.out.println("You're out of attempts! The number was "+numberToGuess); 
                }
            }
            System.out.println("\nRounds won:"+roundsWon);
            System.out.println("Do you want to play again?(yes/no):");
            String response =scanner.next().toLowerCase();
            playAgain=response.equals("yes");
        }
        System.out.println("Thanks for playing! Your total rounds won:"+roundsWon);
        scanner.close(); 
    }
}
