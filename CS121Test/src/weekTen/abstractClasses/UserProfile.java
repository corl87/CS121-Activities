package weekTen.abstractClasses;

//abstract class be Vehicle
public abstract class UserProfile {
    //Instance variable (fields)
    protected String userName;
    protected int followers;
    protected String profileID;
    protected int posts;
    //default constructor
// null or 0
    public UserProfile(){
    }
    //parameterized constructor
    public UserProfile(String userName, int followers, String profileID, int posts){
        this.userName = userName;
        this.followers = followers;
        this.profileID = profileID;
        this.posts = posts;
    }
    //Setters and Getters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String make) {
        this.userName = make;
    }
    //Include my Abstract Method
//Method signature
//abstract class
// include keyword
    public abstract void displayDetails();

    //Implement the methods from interface
    public void login(){
        System.out.println("Login failed");
    }

    public abstract void sendMessage(String message);
}
