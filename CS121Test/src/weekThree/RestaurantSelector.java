package weekThree;

import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {
        String vegetarian, vegan, noGluten, message = "";
        vegetarian = JOptionPane.showInputDialog("are you a vegetarian?");
        vegan = JOptionPane.showInputDialog("are you a vegan?");
        noGluten = JOptionPane.showInputDialog("are you gluten free?");

        if(vegetarian.equals("yes")&&vegan.equals("yes")&&noGluten.equals("yes")){
            message = message.concat("The Chef's Kitchen\n");
            message = message.concat("Corner Cafe\n");
        }
        if(vegetarian.equals("yes")&&vegan.equals("no")&&noGluten.equals("yes")){
            message = message.concat("Joe's Gourmet Burgers\n");
            message = message.concat("Corner Cafe\n");
            message = message.concat("Main Street Pizza Company\n");
        }
        if(vegetarian.equals("yes")&&vegan.equals("no")&&noGluten.equals("no")){
            message = message.concat("Joe's Gourmet Burgers\n");
            message = message.concat("Corner Cafe\n");
            message = message.concat("Main Street Pizza Company\n");
            message = message.concat("Mama's Fine Italian\n");
        }

        if(vegetarian.equals("no")&&vegan.equals("no")&&noGluten.equals("no")){
            message = message.concat("Joe's Gourmet Burgers\n");
            message = message.concat("Main Street Pizza Company\n");
            message = message.concat("Corner Cafe\n");
            message = message.concat("Mama's Fine Italian\n");
            message = message.concat("The Chef's Kitchen\n");
        }

        JOptionPane.showMessageDialog(null, message);


    }
}
