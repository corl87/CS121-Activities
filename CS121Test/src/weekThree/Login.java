package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String user, pw;
        user = JOptionPane.showInputDialog("Enter your username: ");
        pw = JOptionPane.showInputDialog("Enter your password: ");

        if(user.equals("Kyle Dille")){
            if(pw.equals("BSU123!")){
                JOptionPane.showMessageDialog(null, "Welcome to CS121! ");
            }
            else{
                JOptionPane.showMessageDialog(null, "Password incorrect");
            }
        }
        else{
            if(pw.equals("BSU123!")){
                JOptionPane.showMessageDialog(null, "Username not correct");
            }
            else{
                JOptionPane.showMessageDialog(null, "Neither inputs are in our system");
            }
        }
    }
}








//1. Using someone else's work without giving them credit
//5. AI compiles many different human works together to create something that sounds human, yet it credits none of them.





