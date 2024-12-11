package weekTen.abstractClasses;

//difference between admin and user is blocked users vs banned users

public class Admin extends UserProfile{
    protected int bannedUsers;
    public Admin(){

    }
    public Admin(String userName, int followers, String profileID, int posts, int bannedUsers){
        super(userName,followers,profileID,posts);
        this.bannedUsers = bannedUsers;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Username: %s \nProfile ID: %s \nFollower Count: %d \nNumber of posts: %d \nBanned Users: %d\n\n\n",userName,profileID,followers,posts,bannedUsers);
    }
    //Implement the methods from interface
    @Override
    public void login(){
        System.out.println("Login successful");
    }


    @Override
    public void sendMessage(String message){
        System.out.println("Message posted: "+message);
    }

}
