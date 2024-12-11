package weekSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner scr = new Scanner(System.in);

    public static double getLength(){
        System.out.println("What is the length of your rectangle?");
        return(scr.nextDouble());
    }
    public static double getWidth(){
        System.out.println("What is the width of your rectangle?");
        return(scr.nextDouble());
    }
    public static double getArea(double W, double L){
        return(W*L);
    }
    public static void displayData(double W, double L, double area){
        System.out.println("The width of your rectangle is "+ W);
        System.out.println("The length of your rectangle is "+ L);
        System.out.println("The area of your rectangle is " + area);

    }


    public static void main(String[] args) {
        double width = getWidth();
        double length = getLength();
        displayData(length, width, getArea(width,length));
        scr.close();
    }
}
