package weekFive.labFive;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("How many floors does the hotel have?");
        int floors = scr.nextInt();
        float totalRooms = 0; float totalFullRooms = 0;

        for(int i=0; i<floors; i++) {
            System.out.println("number of rooms on floor " + (i + 1));
            totalRooms += scr.nextInt();
            System.out.println("How many of them are occupied?");
            totalFullRooms += scr.nextInt();
        }
            float occupancy = totalFullRooms/totalRooms;

            System.out.println("Floors: " + floors);
            System.out.println("Rooms: " + totalRooms);
            System.out.println("Occupied rooms: " + totalFullRooms);
            System.out.println("Empty rooms:" + (totalRooms-totalFullRooms));
            System.out.printf("Occupancy, %.2f%%", occupancy);

    }
}
