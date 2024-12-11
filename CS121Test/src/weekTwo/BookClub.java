package weekTwo;

import javax.swing.*;

public class BookClub {
    public static void main(String[] args) {
        int books;
        books = Integer.parseInt(JOptionPane.showInputDialog("How many books have been purchased?"));
        if(books == 0){
            JOptionPane.showMessageDialog(null, "You have earned 0 points");
        }
        if(books == 1){
            JOptionPane.showMessageDialog(null, "You have earned 5 points");
        }
        if(books == 2){
            JOptionPane.showMessageDialog(null, "You have earned 15 points");
        }
        if(books == 3){
            JOptionPane.showMessageDialog(null, "You have earned 30 points");
        }
        if(books >= 4){
            JOptionPane.showMessageDialog(null, "You have earned 60 points");
        }
    }
}
