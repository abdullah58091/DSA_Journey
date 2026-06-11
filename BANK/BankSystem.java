import java.util.ArrayList;
import java.util.Scanner;

// ─────────────────────────────────────────────
//  Account Class  (same as original + new features)
// ─────────────────────────────────────────────
class Account {

    // ── Fields (same as original) ──
    private String name;
    private String email;
    private String password;
    private double balance;

    // ── NEW Fields ──
    private int    accountNumber;                        // Unique account number
    private String accountType;                          // "Savings" or "Current"
    private boolean isLocked;                            // Account lock feature
    private int    wrongPasswordCount;                   // Wrong password tracker
    private ArrayList<String> transactionHistory;        // Transaction log (DSA - ArrayList)

    // ── Static counter (har naye account ko unique number milega) ──
    private static int accountCounter = 1001;

    // ────────────────────────────────
    //  Constructor (same as original)
    // ────────────────────────────────
    public Account(String name, String email, double balance) {
        this.name             = name;
        this.email            = email;
        this.balance          = balance;
        this.accountNumber    = accountCounter++;   // Auto-increment
        this.accountType      = "Savings";          // Default type
        this.isLocked         = false;
        this.wrongPasswordCount = 0;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account opened with balance: Rs." + balance);
    }

    // ────────────────────────────────
    //  Set Password  (same as original)
    // ────────────────────────────────
    public void setPassword(String password) {
        if (password.length() >= 4) {
            this.password = password;
            System.out.println("✅ Password set for " + name);
        } else {
            System.out.println("❌ Password too short! Minimum 4 characters.");
        }
    }

    // ── NEW: Verify password ──
    public boolean verifyPassword(String inputPassword) {
        if (isLocked) {
            System.out.println("🔒 Account is LOCKED! Contact bank.");
            return false;
        }
        if (this.password != null && this.password.equals(inputPassword)) {
            wrongPasswordCount = 0;  // Reset on success
            return true;
        } else {
            wrongPasswordCount++;
            System.out.println("❌ Wrong password! Attempt: " + wrongPasswordCount + "/3");
            if (wrongPasswordCount >= 3) {
                isLocked = true;
                System.out.println("🔒 Account LOCKED after 3 wrong attempts!");
            }
            return false;
        }
    }

    // ── NEW: Unlock account ──
    public void unlockAccount(String adminCode) {
        if (adminCode.equals("ADMIN123")) {
            isLocked = false;
            wrongPasswordCount = 0;
            System.out.println("✅ Account unlocked for " + name);
        } else {
            System.out.println("❌ Invalid admin code!");
        }
    }

    // ────────────────────────────────
    //  Deposit  (same as original)
    // ────────────────────────────────
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            String log = "DEPOSIT  +Rs." + amount + "  | Balance: Rs." + balance;
            transactionHistory.add(log);
            System.out.println("✅ Deposited: Rs." + amount);
        } else {
            System.out.println("❌ Invalid amount!");
        }
    }

    // ────────────────────────────────
    //  Withdraw  (same as original)
    // ────────────────────────────────
    public void withdraw(double amount) {
        if (isLocked) {
            System.out.println("🔒 Account is LOCKED! Cannot withdraw.");
            return;
        }
        if (amount <= 0) {
            System.out.println("❌ Invalid amount!");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            String log = "WITHDRAW -Rs." + amount + "  | Balance: Rs." + balance;
            transactionHistory.add(log);
            System.out.println("✅ Withdrawn: Rs." + amount);
        } else {
            System.out.println("❌ Insufficient balance! Available: Rs." + balance);
        }
    }

    // ────────────────────────────────
    //  Show Balance  (same as original)
    // ────────────────────────────────
    public void showBalance() {
        System.out.println("💰 Balance [" + name + "]: Rs." + balance);
    }

    // ── NEW: Transfer money to another account ──
    public void transfer(Account receiver, double amount) {
        if (isLocked) {
            System.out.println("🔒 Your account is LOCKED! Cannot transfer.");
            return;
        }
        if (amount <= 0) {
            System.out.println("❌ Invalid transfer amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("❌ Insufficient balance for transfer!");
            return;
        }
        // Sender pe se kaato
        this.balance -= amount;
        String senderLog = "TRANSFER -Rs." + amount + " to " + receiver.name +
                           " | Balance: Rs." + this.balance;
        this.transactionHistory.add(senderLog);

        // Receiver ko do
        receiver.balance += amount;
        String receiverLog = "TRANSFER +Rs." + amount + " from " + this.name +
                             " | Balance: Rs." + receiver.balance;
        receiver.transactionHistory.add(receiverLog);

        System.out.println("✅ Rs." + amount + " transferred from " +
                           this.name + " → " + receiver.name);
    }

    // ── NEW: Show transaction history (DSA - ArrayList traverse) ──
    public void showHistory() {
        System.out.println("\n📋 Transaction History — " + name +
                           " (A/C: " + accountNumber + ")");
        System.out.println("─────────────────────────────────────────");
        if (transactionHistory.isEmpty()) {
            System.out.println("  No transactions yet.");
        } else {
            for (int i = 0; i < transactionHistory.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + transactionHistory.get(i));
            }
        }
        System.out.println("─────────────────────────────────────────");
    }

    // ── NEW: Set account type ──
    public void setAccountType(String type) {
        if (type.equals("Savings") || type.equals("Current")) {
            this.accountType = type;
            System.out.println("✅ Account type set to: " + type);
        } else {
            System.out.println("❌ Invalid type! Use 'Savings' or 'Current'.");
        }
    }

    // ── Getters ──
    public String getName()       { return name; }
    public double getBalance()    { return balance; }
    public int    getAccountNo()  { return accountNumber; }
    public boolean isLocked()     { return isLocked; }
    public String getEmail()      { return email; }

    // ────────────────────────────────
    //  toString  (same as original)
    // ────────────────────────────────
    @Override
    public String toString() {
        return "A/C#" + accountNumber +
               " | Name: " + name +
               " | Email: " + email +
               " | Type: " + accountType +
               " | Balance: Rs." + balance +
               " | Status: " + (isLocked ? "🔒 Locked" : "✅ Active");
    }
}


// ─────────────────────────────────────────────
//  BankSystem Class  (main + extra features)
// ─────────────────────────────────────────────
public class BankSystem {

    // ── Global account list (DSA - ArrayList as database) ──
    static ArrayList<Account> bank = new ArrayList<>();

    // ─────────────────────────────────
    //  Search account by name (DSA - Linear Search)
    // ─────────────────────────────────
    static Account searchByName(String name) {
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getName().equalsIgnoreCase(name)) {
                return bank.get(i);
            }
        }
        return null;  // Not found
    }

    // ─────────────────────────────────
    //  Search account by A/C number (DSA - Linear Search)
    // ─────────────────────────────────
    static Account searchByAccountNo(int accNo) {
        for (Account acc : bank) {
            if (acc.getAccountNo() == accNo) {
                return acc;
            }
        }
        return null;
    }

    // ─────────────────────────────────
    //  Find richest account (DSA - Max search)
    // ─────────────────────────────────
    static Account findRichest() {
        if (bank.isEmpty()) return null;
        Account richest = bank.get(0);
        for (int i = 1; i < bank.size(); i++) {
            if (bank.get(i).getBalance() > richest.getBalance()) {
                richest = bank.get(i);
            }
        }
        return richest;
    }

    // ─────────────────────────────────
    //  Sort accounts by balance (DSA - Bubble Sort)
    // ─────────────────────────────────
    static void sortByBalance() {
        int n = bank.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bank.get(j).getBalance() > bank.get(j + 1).getBalance()) {
                    // Swap
                    Account temp = bank.get(j);
                    bank.set(j, bank.get(j + 1));
                    bank.set(j + 1, temp);
                }
            }
        }
        System.out.println("✅ Accounts sorted by balance (Low → High).");
    }

    // ─────────────────────────────────
    //  Total bank balance
    // ─────────────────────────────────
    static double totalBankBalance() {
        double total = 0;
        for (Account acc : bank) {
            total += acc.getBalance();
        }
        return total;
    }

    // ─────────────────────────────────
    //  Print all accounts
    // ─────────────────────────────────
    static void printAllAccounts() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("          ALL ACCOUNTS IN BANK                  ");
        System.out.println("╚══════════════════════════════════════════════╝");
        for (int i = 0; i < bank.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + bank.get(i));
        }
        System.out.println("──────────────────────────────────────────────");
        System.out.println("  Total Bank Balance: Rs." + totalBankBalance());
        System.out.println("──────────────────────────────────────────────\n");
    }

    // ─────────────────────────────────
    //  MAIN METHOD
    // ─────────────────────────────────
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════╗");
        System.out.println("      JAVA BANK SYSTEM          ");
        System.out.println("╚══════════════════════════════╝\n");

        // ─── Step 1: Create accounts (same as original) ───
        Account acc1 = new Account("Abdullah", "abdullah@gmail.com", 1000);
        Account acc2 = new Account("Aman",     "aman@gmail.com",     500);
        Account acc3 = new Account("Priya",    "priya@gmail.com",    2000);  // NEW
        Account acc4 = new Account("Rahul",    "rahul@gmail.com",    750);   // NEW

        // Add to bank (DSA - ArrayList)
        bank.add(acc1);
        bank.add(acc2);
        bank.add(acc3);
        bank.add(acc4);

        // ─── Step 2: Set passwords (same as original) ───
        System.out.println("── Setting Passwords ──");
        acc1.setPassword("abcd");
        acc2.setPassword("1234");
        acc3.setPassword("xyz");   // Fail — too short
        acc3.setPassword("priya123");
        acc4.setPassword("rahul99");

        // ─── Step 3: Basic operations (same as original) ───
        System.out.println("\n── ACC1: Abdullah ──");
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.showBalance();

        System.out.println("\n── ACC2: Aman ──");
        acc2.deposit(200);
        acc2.withdraw(800);  // Fail — insufficient
        acc2.showBalance();

        // ─── Step 4: NEW — Transfer feature ───
        System.out.println("\n── Transfer: Abdullah → Aman (Rs.400) ──");
        acc1.transfer(acc2, 400);
        acc1.showBalance();
        acc2.showBalance();

        // ─── Step 5: NEW — Account type ───
        System.out.println("\n── Setting Account Types ──");
        acc3.setAccountType("Current");
        acc4.setAccountType("Savings");

        // ─── Step 6: NEW — Password verify & lock ───
        System.out.println("\n── Password Verification Test ──");
        System.out.println("Correct password: " + acc1.verifyPassword("abcd"));
        System.out.println("Wrong attempt 1: " + acc4.verifyPassword("wrong"));
        System.out.println("Wrong attempt 2: " + acc4.verifyPassword("wrong"));
        System.out.println("Wrong attempt 3: " + acc4.verifyPassword("wrong")); // Locks
        acc4.withdraw(100); // Blocked — locked

        // Unlock with admin code
        System.out.println("\n── Admin Unlock ──");
        acc4.unlockAccount("ADMIN123");
        acc4.withdraw(100);  // Works now
        acc4.showBalance();

        // ─── Step 7: NEW — Transaction history ───
        System.out.println();
        acc1.showHistory();
        acc2.showHistory();

        // ─── Step 8: NEW — Search features (DSA - Linear Search) ───
        System.out.println("\n── Search by Name: 'Priya' ──");
        Account found = searchByName("Priya");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Account not found!");
        }

        System.out.println("\n── Search by A/C Number: 1002 ──");
        Account foundByNo = searchByAccountNo(1002);
        if (foundByNo != null) {
            System.out.println("Found: " + foundByNo);
        } else {
            System.out.println("Account not found!");
        }

        // ─── Step 9: NEW — Richest account (DSA - Max Search) ───
        System.out.println("\n── Richest Account ──");
        Account richest = findRichest();
        if (richest != null) {
            System.out.println("👑 " + richest.getName() +
                               " | Balance: Rs." + richest.getBalance());
        }

        // ─── Step 10: NEW — Sort by balance (DSA - Bubble Sort) ───
        System.out.println("\n── Sort Accounts by Balance ──");
        sortByBalance();

        // ─── Step 11: Print all accounts (same array concept as original) ───
        printAllAccounts();

        System.out.println("✅ Program ended successfully.");
    }
}