package weekTen.abstractClasses;

public class TestAbstractMethod {
    public static void main(String[] args) {
        User jonjabi = new User("Jonjabi",62,"1738",22, 1);
        jonjabi.displayDetails();
        Admin meta = new Admin("Meta",6000,"0001",0,5000);
        meta.displayDetails();
        
        jonjabi.login();
        meta.sendMessage("Watch what you post or I will ban you");

    }
}
