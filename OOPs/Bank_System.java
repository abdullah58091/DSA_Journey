package com.company.OOPs;

class BankAccount {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public  int getBalance (){
        return balance;
    }
    // Deposit method

        public void deposit( int amount) {
            balance = balance + amount;
            System.out.println("deposit " + amount);
        }

        //  withdraw method
        public void withdraw(int amount) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        }

    public void bankDetails() {
        System.out.println("Final Balance: " + balance);

        }
    }


    public class Bank_System {
        public static void main(String[] args) {


            BankAccount bank = new BankAccount();
            bank.setBalance(500);
            bank.deposit(200);
            bank.withdraw(700);
            bank.bankDetails();

        }
    }

