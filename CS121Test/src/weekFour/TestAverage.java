package weekFour;
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("How many students are in your class?");
        int numStudents = scr.nextInt();

        System.out.println("How many tests per student?");
        int numTests = scr.nextInt();

        for(int i = 0; i < numStudents; i++){
            double sum = 0;
            for(int b=0; b<numTests; b++){
                System.out.printf("Enter their test %d's score:\n", b+1);
                sum += scr.nextInt();
            }

            System.out.printf("Student number %d's average:\n", i+1);
            System.out.println(sum/numTests);

        }
    }
}
