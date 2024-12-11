package weekTen.abstractClasses;

//difference between admin and user is blocked users vs banned users

public class User extends UserProfile{
    protected int blockedUsers;
    public User(){

    }
    public User(String userName, int followers, String profileID, int posts, int blockedUsers){
        super(userName,followers,profileID,posts);
        this.blockedUsers = blockedUsers;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Username: %s \nProfile ID: %s \nFollower Count: %d \nNumber of posts: %d \nBlocked users: %s\n\n\n",userName,profileID,followers,posts,blockedUsers);
    }

    @Override
    public void login() {
        System.out.println("Login successful!");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Direct Message sent: "+ message);
    }

}
