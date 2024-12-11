package weekNine;

public class Main {
    public static void main(String[] args) {
        RegularProfile user1 = new RegularProfile("billy", "I like video games", 2, 3);
        VIPProfile user2 = new VIPProfile("ADMIN", "I WILL BAN!!!!11!!", "gold");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
