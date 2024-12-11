public class Account{
    // Instance variables
    private double balance;
    protected int accountNumber;
    protected int numberOfAccounts = 1000;

    // Constructor class with double balance parameter to allow cents
    // Could use a float to conserve space but clients bank balances may exceed the float limit
    public Account(double balance) {
        numberOfAccounts++;
        accountNumber = numberOfAccounts;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return(accountNumber);
    }

    //Implemented the required methods
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited: " + amount + "\nBalance after deposit: " + balance);
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("ERROR: Unable to withdraw more than current balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawn $"+ amount+"\nRemaining balance: ");
            System.out.printf("Withdrawn $%s Remaining balance: $%.2f", amount, balance);
        }
    }

    // Formatting toString for my purposes
    @Override
    public String toString(){
        return(String.format("Account %s Current balance: $%.2f\n\n", accountNumber, balance));
    }
}