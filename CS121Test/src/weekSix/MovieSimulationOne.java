package weekSix;
import java.util.Scanner;

public class MovieSimulationOne {
    public static void display(int movies, String[] movieNames, String[] movieTypes, int[] openSeats, float[] moviePrice){
        System.out.printf("Movie %-18s %-5s %-5s %-5s\n", "Name", "Type", "Seats", "Price");
        for(int i = 0; i < movies; i++) {
            System.out.printf("Movie %d: %-15s %-5s %-5s %-5s \n", i+1, movieNames[i], movieTypes[i], openSeats[i], moviePrice[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("How many movies are you showing?");
        final int movies = scr.nextInt();
        scr.nextLine(); // Eats the blank line breaking the rest of the program

        String[] movieNames = new String[movies];
        String [] movieTypes = new String[movies];
        int[] openSeats = new int[movies];
        float[] moviePrice = new float[movies];

        for(int i = 0; i < movies; i++){
            System.out.printf("name of movie %d: \n", i+1);
            movieNames[i] = scr.nextLine();
            System.out.println("2D or 3D?");
            movieTypes[i] = scr.nextLine();
            System.out.println("How many seats are available?");
            openSeats[i] = scr.nextInt();
            scr.nextLine();
            System.out.println("How much does a ticket cost?");
            moviePrice[i] = scr.nextFloat();
            scr.nextLine();
        }
        display(movies, movieNames, movieTypes, openSeats, moviePrice);

    }
}
