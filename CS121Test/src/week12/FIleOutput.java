package week12;


import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FIleOutput {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String courses;
        String credits;
        String scores;

        output.println("courses credits scores");
        for(int i=1;i<=3;i++){
            courses = JOptionPane.showInputDialog(String.format("Enter the name of course number %d:",i));
            credits = JOptionPane.showInputDialog("How many credit hours");
            scores = JOptionPane.showInputDialog("What is your score");
            output.println(courses + " " + credits + " " + scores);
        }
        output.close();
    }
}
