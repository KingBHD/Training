package assignments;

import java.util.Scanner;

public class Bank {

    protected String name;
    private int balance;
    private int atm;

    Bank(int starting_balance, String customer_name, int default_pin) {
        balance = starting_balance;
        name = customer_name;
        atm = default_pin;
    }

    void show_balance() {
        System.out.println("[i] Balance of " + this.name + ": $" + this.balance);
    }

    boolean balance_check(int amount) {
        if (amount > this.balance) {
            System.out.println("[x] Insufficient Balance!!");
            return false;
        }
        return true;
    }

    static void debit(Bank customer, int amount) {
        System.out.println("[-] Debited $" + amount + " from " + customer.name + "'s A/C");
        customer.balance = customer.balance - amount;
    }

    static void credit(Bank customer, int amount) {
        System.out.println("[+] Credited $" + amount + " to " + customer.name + "'s A/C");
        customer.balance = customer.balance + amount;
    }

    static void transfer(Bank sender, Bank receiver, int amount) {
        if (sender.balance_check(amount)) {
            Bank.debit(sender, amount);
            Bank.credit(receiver, amount);
        }
    }

    static int get_int_input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int get_amount_from_user() {
        System.out.print("[?] Enter the amount: ");
        return Bank.get_int_input();
    }

    void generate_new_atm() {
        System.out.print("[?] Enter 4 digit ATM pin: ");
        this.atm = Bank.get_int_input();
        System.out.println("[i] ATM pin generated!");
    }

    static void withdraw_from_atm(Bank customer) {
        // Check if ATM exits
        if (customer.atm == 0)
            customer.generate_new_atm();

        // Ask ATM PIN
        System.out.print("[?] Enter your ATM pin: ");
        int pin = Bank.get_int_input();

        // Check customer's ATM PIN
        if (pin != customer.atm)
            System.out.println("[!] You have entered wrong pin!");
        else {

            // Ask amount
            int amount = Bank.get_amount_from_user();

            // Withdraw entered amount
            if (customer.balance_check(amount)) {
                Bank.debit(customer, amount);
            }
        }
    }
}

class Banker {
    public static void main(String[] args) {
        Bank cus1 = new Bank(10000, "Akki", 1234);
        Bank cus2 = new Bank(20000, "Anub", 0);

        cus1.show_balance();
//        cus2.show_balance();
        System.out.println();


//        Bank.transfer(cus1, cus2, 5200);
        Bank.withdraw_from_atm(cus1);

        System.out.println();
        cus1.show_balance();
//        cus2.show_balance();
    }
}
