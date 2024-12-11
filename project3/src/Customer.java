import java.util.ArrayList;

public class Customer {

    protected String firstName;
    protected String lastName;
    protected String pin;
    protected ArrayList<Account> accountArrayList = new ArrayList<>();

    public Customer(String firstName, String lastName, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getPin(){
        return pin;
    }

    public void addAccount(Account account){
        accountArrayList.add(account);
    }
    public void closeAccount(Account account){
        accountArrayList.remove(account);
        System.out.println("Removed selected account");
    }
    public Account pickAccount(int accountNumber){
        Account findNum = null;
        for(Account account : accountArrayList){
            if(account.getAccountNumber()==accountNumber){
                findNum = account;
                break;
            }
        }
        return(findNum);
    }

    public String allAccountInfo(){
        String allInfo = "";
        for(Account account : accountArrayList){
            allInfo = allInfo+ account.toString();
            break;
        }
        return allInfo;
    }
    @Override
    public String toString(){
        return(String.format("Name: %s %s\n", firstName, lastName));
    }


}
