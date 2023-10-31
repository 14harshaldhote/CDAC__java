/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day21;

/**
 *
 * @author harshalsMac
 */
public class q5 {

    private double balance;

    public q5(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal: " + amount);
        }
    }

    public synchronized double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        q5 account = new q5(1000.0);

        Thread depositThread1 = new Thread(() -> {
            account.deposit(200.0);
        });

        Thread withdrawThread1 = new Thread(() -> {
            account.withdraw(150.0);
        });

        depositThread1.start();
        withdrawThread1.start();

        try {
            depositThread1.join();
            withdrawThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
