package weekTwo;
import java.util.Scanner;
import javax.swing.*;
public class WordGame {
    //main + tab
    public static void main(String[] args) {
        String name;
        String place;
        String time;
        String enemy;

        //JOption pane

        //prompt user
        name = JOptionPane.showInputDialog("Enter in your name: ");
        place = JOptionPane.showInputDialog("Enter a location: ");
        time = JOptionPane.showInputDialog("Enter a number: ");
        enemy = JOptionPane.showInputDialog("Enter another persons name: ");


        //String.format() to generate a message
        String message = String.format("Our story begins with %s, stranded miles from civilization.\n" +
                "They come across a %s and stop for a while.\n" +
                "Taking in the Scenery, they wait for %s minutes, then start again. \n" +
                "You blame %s and return to civilization just to spite them"
                , name,place,time,enemy);
        //Display message in dialog box
        JOptionPane.showMessageDialog(null, message);

    }
}
