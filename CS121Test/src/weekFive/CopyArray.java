package weekFive;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("how many elements in your array?");
        final int arrayLength = scr.nextInt();

        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];
        int[] array3 = new int[arrayLength];
        int[] array4 = new int[arrayLength];

        for(int i=0; i<arrayLength; i++){
            System.out.printf("What should element %d be?\n", i+1);
            array1[i] = scr.nextInt();
        }
        System.out.println("Array 1: ");
        for(int a : array1){
            System.out.print(a + " ");
        }
        System.out.println("\nArray 2");
        for(int i=0;i<arrayLength;i++){
            array2[i]= array1[i];
        }
        for(int a : array2){
            System.out.print(a + " ");
        }
        System.out.println("\nArray 3:");
        for(int i=0;i<arrayLength;i++){
            array3[i]= array1[i]*array1[i];
        }
        for(int a : array3){
            System.out.print(a + " ");
        }
        System.out.println("\nArray 4");
        for(int i=0;i<arrayLength;i++){
            array4[arrayLength-i-1]= array1[i];
        }
        for(int a : array4){
            System.out.print(a + " ");
        }
    }
}
