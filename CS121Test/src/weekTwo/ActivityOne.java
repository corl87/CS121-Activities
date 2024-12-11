package weekTwo;
import java.util.Scanner;
import javax.swing.*;

public class ActivityOne {
    public static void main(String[] args) {
        String year;
        year = JOptionPane.showInputDialog("What year are you in? ");
        Scanner scr = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scr.nextLine();
        System.out.println("your name is " + name);

        String message = String.format("You are in your %s year of school", year);

        JOptionPane.showMessageDialog(null, message);
    }
}
