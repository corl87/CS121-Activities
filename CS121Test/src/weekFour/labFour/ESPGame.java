package weekFour.labFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random rand = new Random();
        int wins = 0;
        String answer;
        for(int i=0; i < 10; i++){
            System.out.println("What color has the computer chosen?");
            String guess = scr.nextLine();
            int random = rand.nextInt(5);
            switch(random){
                case 0:
                    answer = "red";
                    System.out.println("red");
                    break;
                case 1:
                    answer = "green";
                    System.out.println("green");
                    break;
                case 2  :
                    answer = "blue";
                    System.out.println("blue");
                    break;
                case 3:
                    answer = "orange";
                    System.out.println("orange");
                    break;
                case 4:
                    answer = "yellow";
                    System.out.println("yellow");
                    break;
                default:
                    answer = "N/A";
            };
            if(answer.equals(guess)){
                wins++;
            }
        }
        System.out.printf("You got %d correct", wins);
    }
}
