package weekOne;

public class Firstcodewithme {
    public static void main(String[] args) {
        //declaring variables
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;
        //Initialize variables
        age = 19;
        gpa = 3.9;
        letterGrade = 'A';
        csMajor = true;
        name = "Dille";
        String favoriteColor = "Purple";
        System.out.print("Hello, ");
        System.out.println("This is my first project for CS121!");
        //  "%.2f" stops the display at the second digit
        System.out.printf("The age of the person is: %d     ",age);
        System.out.printf("The gpa is %.2f      ", gpa);
        System.out.printf("The letter grade is: %c%n", letterGrade);
        System.out.printf("You are in computer science? %b%n", csMajor);
        System.out.printf("The name of this person is: %s", name);
    }
}
