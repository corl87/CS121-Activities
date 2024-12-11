package weekTwo;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        Scanner scr = new Scanner(System.in);
        System.out.println("Input your first 3 test scores in a row");
        score1 = Double.parseDouble(scr.nextLine());
        score2 = Double.parseDouble(scr.nextLine());
        score3 = Double.parseDouble(scr.nextLine());

        average = (score1 + score2 + score3) /3;
        if(average>=90){
            System.out.println("Your final grade is A");
        }
        else if(average>=80){
            System.out.println("Your final grade is B");
        }
        else if(average>=70){
            System.out.println("Your final grade is C");
        }
        else if(average>=60){
            System.out.println("Your final grade is D");
        }
        else if(average>=50){
            System.out.println("Your final grade is F");
        }
    }
}
