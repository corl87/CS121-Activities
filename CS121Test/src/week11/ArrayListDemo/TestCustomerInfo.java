package week11.ArrayListDemo;
import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        SystemManagement system = new SystemManagement();
        Scanner scr = new Scanner(System.in);

        while(true){
            System.out.println("Enter name or q to quit");
            String input = scr.nextLine();
            if(input.equals("q")){
                break;
            }
            system.add(input, 1);
            System.out.println("enter the contestant number");
            system.add(scr.nextLine(), 2);
            System.out.println("enter their home address");
            system.add(scr.nextLine(), 3);
        }
        system.printFor();
    }
}
