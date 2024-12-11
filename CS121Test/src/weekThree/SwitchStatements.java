package weekThree;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("What day of the week is it?");
        String day = scr.nextLine();

        System.out.println("You need to be up for: ");
        switch(day){
            case "Monday", "Wednesday", "Friday":
                System.out.println("CS121 at 10am");
                break;
            case "Tuesday":
                System.out.println("ENG104 at 2pm");
                break;
            case "Thursday":
                System.out.println("CS121 lab at 9:30am");
                break;
            case "Saturday", "Sunday":
                System.out.println("Nothing. Sleep in");
                break;
            default:
                System.out.println("invalid input, try caps for first letter");
        }
    }
}
