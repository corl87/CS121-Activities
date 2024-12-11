package weekFour;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int guess, num, tries;
        String inGuess;
        tries = 0;
        Random rand = new Random();
        Scanner scr = new Scanner(System.in);
        System.out.println("What is your guess?");
        inGuess = scr.nextLine();
        guess = Integer.parseInt(inGuess);

        num = rand.nextInt(100) + 1;
        while(!inGuess.equals("q")){
            if(guess != num) {
                tries += 1;
                if (guess > num) {
                    System.out.println("Too big!");
                }
                if (guess < num) {
                    System.out.println("Too small!");
                }
                System.out.println("Guess again!");
                inGuess = scr.nextLine();
                //kept getting error from trying to cast a char as an int, so now I check first
                if(Character.isDigit(inGuess.charAt(0))){
                    guess = Integer.parseInt(inGuess);
                }
            }else{
                break;
            }
        }
        System.out.printf("The number was %d, ", num);
        System.out.printf("You got it with %d tries", tries);
    }
}
