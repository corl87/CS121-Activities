package weekThree;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner scr = new Scanner(System.in);
        int i = 0;

        System.out.println("enter the 3 side lengths");
        side1 = Integer.parseInt(scr.nextLine());
        side2 = Integer.parseInt(scr.nextLine());
        side3 = Integer.parseInt(scr.nextLine());

        if(side1 == side2){
            i = i+1;
        }
        if(side2 == side3){
            i = i+1;
        }
        if(side1 == side3){
            i = i+1;
        }

        if(i != 0){
            if(i==1){
                System.out.println("The triangle is Isosceles");
            }
            else{
                System.out.println("The triangle is Equilateral");
            }
        }
        else{
            System.out.println("The triangle is Scalene");
        }
    }
}
