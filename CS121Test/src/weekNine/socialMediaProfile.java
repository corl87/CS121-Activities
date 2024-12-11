package weekNine;

public class socialMediaProfile {
    String username, bio;
    socialMediaProfile(String username, String bio){
        this.username = username;
        this.bio = bio;
    }
    public String toString(){

        return(String.format("Username: %s  |  bio:  %s \n", username, bio));
    }

}

class RegularProfile extends socialMediaProfile{
    int numPosts, followerCount;
    String username, bio;
    RegularProfile(String username, String bio, int posts, int followers) {
        super(username, bio);
        numPosts = posts;
        followerCount = followers;
        this.username = username;
        this.bio = bio;
    }

    public String toString(){
        return(String.format("Username: %s  |  Bio: %s  |  Posts: %s \n", username, bio, numPosts));
    }

}
class VIPProfile extends socialMediaProfile{
    String vipBadge;

    VIPProfile(String username, String bio, String vipBadge) {
        super(username, bio);
        this.vipBadge = vipBadge;
    }

    public String toString(){
        return(String.format("Username: %s  |  Bio: %s  |  VIP Badge: %s \n", username, bio, vipBadge));
    }

}
