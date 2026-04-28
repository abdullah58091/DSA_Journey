
   
    class Account {
    private String name;
    private String email;
    private String password;
    private double balance;

    // Constructor
    public Account(String name, String email, double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    // Set Password
    public void setPassword(String password) {
        if (password.length() >= 4) {
            this.password = password;
        } else {
            System.out.println(" Password too short!");
        }
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount);
        } else {
            System.out.println(" Invalid amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(" Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Show Balance
    public void showBalance() {
        System.out.println(" Balance: " + balance);
    }

    // toString
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Balance: " + balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {

        // Create accounts
        Account acc1 = new Account("Abdullah", "abdullah@gmail.com", 1000);
        Account acc2 = new Account("Aman", "aman@gmail.com", 500);

        acc1.setPassword("abcd");
        acc2.setPassword("1234");

        // Operations
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.showBalance();

        System.out.println();

        acc2.deposit(200);
        acc2.withdraw(800);
        acc2.showBalance();

        System.out.println();

        // Multiple accounts (Array)
        Account[] users = new Account[2];
        users[0] = acc1;
        users[1] = acc2;

        // Print all users
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}

