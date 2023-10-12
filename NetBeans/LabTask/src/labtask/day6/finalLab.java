/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day6;


class Bank {
    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    public int getBalance() {
        return 10000;
    }
}

class BankB extends Bank {
    public int getBalance() {
        return 15000;
    }
}

class BankC extends Bank {
    public int getBalance() {
        return 2000;
    }
}

public class finalLab {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in Bank A: Rs " + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs " + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs " + bankC.getBalance());
    }
}
