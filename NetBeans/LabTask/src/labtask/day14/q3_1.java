/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day14;

import java.util.Scanner;

/**
 *
 * this
 */
public class q3_1 {
    
    private double balance;

    public q3_1(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientFundException("Insufficient funds in the account.");
            }
            balance -= amount;
            System.out.println("Withdrawal of " + amount );
        } catch (InsufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        q3_1 account = new q3_1(1000.0); 

        System.out.println("Current Balance: " + account.getBalance());
        System.out.print("Enter the amount to withdraw: ");
        double withdrawalAmount = 1200.0; 
        account.withdraw(withdrawalAmount);

        System.out.println("Current Balance: $" + account.getBalance());
    }
}