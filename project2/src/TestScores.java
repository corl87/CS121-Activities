import java.util.Random;
import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scr = new Scanner(System.in);
        final int SIZE = rand.nextInt(7)+3;
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        System.out.println(SIZE + " Tests expected");

        for(int i = 0; i < SIZE; i++){
            System.out.println("Test "+(i+1)+" score:");
            testScores[i]= scr.nextInt();
        }
        for(int i=0; i<SIZE; i++){
            letterGrades[i]= getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
    }
    static char getLetterGrade(int grade){
        if(grade >=90){
            return('A');
        } else if (grade >=80) {
            return('B');
        } else if (grade >=70) {
            return('C');
        } else if (grade >= 60) {
            return('D');
        } else{
            return('F');
        }
    }
    static void printGrades(int[]testScores, char[]letterGrades){
        System.out.printf("%-15s %s\n", "Score", "Grade");
        for(int i = 0; i<testScores.length; i++){
            System.out.printf("  %-16s%s\n", testScores[i], letterGrades[i]);
        }
    }
    static void printHighestScore(int[]testScores){
        int bigNum = testScores[0];
        for (int testScore : testScores) {
            if (bigNum < testScore) {
                bigNum = testScore;
            }
        }
        System.out.println("The highest score is: "+ bigNum);
    }
    static void printLowestScore(int[]testScores){
        int smallNum = testScores[0];
        for (int testScore : testScores) {
            if (smallNum > testScore) {
                smallNum = testScore;
            }
        }
        System.out.println("The lowest score is: "+ smallNum);
    }
    static void printAverageScore(int[]testScores){
        double total = 0;
        for (int testScore : testScores) {
            total += testScore;
        }
        System.out.printf("The average score is: %.1f", (total/testScores.length));
    }
}
