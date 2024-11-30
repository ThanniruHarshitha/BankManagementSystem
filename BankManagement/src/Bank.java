import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void registerCustomer(String name, String email, String password) {
        Customer customer = new Customer(name, email, password);
        customers.add(customer);
        System.out.println("Customer registered: " + name);
    }

    public Customer findCustomer(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        }
        return null;
    }

    public void deposit(String email, double amount) {
        Customer customer = findCustomer(email);
        if (customer != null) {
            customer.setBalance(customer.getBalance() + amount);
            System.out.println("Deposited " + amount + " to account of " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void withdraw(String email, double amount) {
        Customer customer = findCustomer(email);
        if (customer != null) {
            if (customer.getBalance() >= amount) {
                customer.setBalance(customer.getBalance() - amount);
                System.out.println("Withdrew " + amount + " from account of " + customer.getName());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void calculateInterest() {
        for (Customer customer : customers) {
            double interest = customer.getBalance() * 0.05; // 5% monthly interest
            customer.setBalance(customer.getBalance() + interest);
            System.out.println("Interest added to account of " + customer.getName() + ": " + interest);
        }
    }
}