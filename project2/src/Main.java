import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scr.nextInt();
        if(isSquare(number)){
            System.out.println("Yes it is a square");
        }else{
            System.out.println("no it is not a square");
        }
    }

    static boolean isSquare(int num) {
        for (int i = 0; i < num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }


}