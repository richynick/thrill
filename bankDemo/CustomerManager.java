package bankDemo;

public class CustomerManager {
    public Customer getCustomer(int acctId) throws CloneNotSupportedException {
        Customer customer = fetchCustomer(acctId);
        Customer clone = customer.clone();
        if(clone != null && clone != customer){
            System.out.println("clone Successful");
        }
        return customer;
    }

    public Customer fetchCustomer(int Id){
        Customer customer = new Customer(2,"Oluchi", 400);
        return customer;
    }
}
