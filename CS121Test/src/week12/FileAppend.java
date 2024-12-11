package week12;

import javax.swing.*;
import java.io.*;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter("mycourses.txt",true);
            PrintWriter output = new PrintWriter(fileWriter);

            String courses = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter the number of credits");
            String score = JOptionPane.showInputDialog("Enter score");

            output.println(courses+" "+credits+" "+score);
            fileWriter.close();
            output.close();
        }catch(FileNotFoundException e){
            System.err.println("File not found");
        }
    }
}
