import java.util.ArrayList;

public class Bank {
    protected ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }
    public Customer pinSearch(String pin){
        Customer foundCustomer = null;
        for(Customer customer : customers){
            if(pin.equals(customer.getPin())){
                foundCustomer = customer;
                break;
            }
        }
        return(foundCustomer);
    }
    public String customerInfo(){
        String customerInfo = "";
        for(Customer customer : customers){
            customerInfo= String.format(customerInfo+customer.toString());
        }
        return customerInfo;
    }
}
