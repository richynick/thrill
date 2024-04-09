package bankDemo;

public class LoanManager {
    public static void main(String[] args) throws CloneNotSupportedException {
        CustomerManager customerManager = new CustomerManager();
        Customer customer = customerManager.getCustomer(2);
    }
}
