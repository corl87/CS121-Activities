package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number to test: ");
        int num = Integer.parseInt(scr.nextLine());

        if(num%2==0){
            System.out.println("Your number is even!");
        }
        else{
            System.out.println("Your number is odd!");
        }
    }
}
