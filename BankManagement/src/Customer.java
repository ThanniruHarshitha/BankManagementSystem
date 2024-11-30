
public class Customer {
	private String name;
    private String email;
    private String password;
    private double balance;

    public Customer(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = 0.0; // Initial balance
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
