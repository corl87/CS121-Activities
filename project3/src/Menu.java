import java.util.Scanner;

public class Menu {
    Bank bank = new Bank();
    Scanner scr = new Scanner(System.in);
    public void runMenu(){
        while(true) {
            System.out.println("*********** MENU ***********\nPlease make a selection:\n1) Access Account\n2) Open a New Account\n3) Close All Accounts\n4) Exit");
            String selection = scr.nextLine();
            if(selection.equals("1")){
                accessAccount();
            }else if(selection.equals("2")){
                openNewAccount();
            }else if(selection.equals("3")){
                closeAccounts();
            }
            else if(selection.equals("4")){
                System.out.println("Exiting...");
                break;
            }else{
                System.out.println("Invalid entry");
            }
        }
    }
    private void accessAccount(){
        String selection;
        System.out.println("Please enter your PIN");
        selection = scr.nextLine();
        Customer customer = bank.pinSearch(selection);
        if(customer == null){
            System.out.println("Invalid pin");
            return;
        }else{
            //TODO Print all accounts and ask which one they want to edit
            System.out.println(customer.allAccountInfo());
            System.out.println("Enter the number of the account you wish to access");
            selection = scr.nextLine();
            Account account = customer.pickAccount(Integer.parseInt(selection));
            System.out.println("Please make a selection:\n1) Make a deposit\n2) Make a withdrawal\n3) See account balance\n4) Close account\n5) Exit");
            selection = scr.nextLine();
            if(selection.equals("1")){
                System.out.println("How much would you like to deposit in the account?");
                account.deposit(Double.parseDouble(scr.nextLine()));
            }else if(selection.equals("2")){
                System.out.println("How much would you like to withdraw from the account?");
                account.withdraw(Double.parseDouble(scr.nextLine()));
            }else if(selection.equals("3")){
                System.out.println(account.toString());
            }else if(selection.equals("4")){
                customer.closeAccount(account);
            }else{
                System.out.println("Exiting...");
                return;
            }
        }
    }
    private void closeAccounts(){
        System.out.println("input your PIN to delete all accounts");
        Customer customer = bank.pinSearch(scr.nextLine());
        if(customer !=null){
            bank.removeCustomer(customer);
            System.out.println("Customer removed from bank registry");
        }else{
            return;
        }

    }
    private void openNewAccount(){
        Customer customer;
        System.out.println("Are you a new customer?");
        if(scr.nextLine().equals("yes")){
            customer = createNewCustomer();
        }else{
            System.out.println("Enter your pin");
            customer = bank.pinSearch((scr.nextLine()));
            if(customer==null){
                return;
            }
        }
        System.out.println("Enter the initial deposit for the account");
        Account account = new Account(Double.parseDouble(scr.nextLine()));
        customer.addAccount(account);
        System.out.println("New account opened: "+account.getAccountNumber());
    }


    private Customer createNewCustomer(){
        System.out.println("Please enter the following on separate lines:\nFirst Name\nLast Name\nDesired PIN");
        Customer newCustomer = new Customer(scr.nextLine(),scr.nextLine(),scr.nextLine());
        bank.addCustomer(newCustomer);
        return newCustomer;
    }
}
