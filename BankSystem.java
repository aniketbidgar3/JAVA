
import java.util.Scanner;

class BankAccount {

    private int balance;
    private int pin;

    public BankAccount() {
        balance = 0;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void checkBalance() {
        System.out.println("Your Current Balance is: Rs. " + balance);
    }

    public void withdraw(Scanner sc) {
        System.out.print("Enter Amount to Withdraw: ");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("You Withdrawn Rs. " + amount);
        }
    }

    public void deposit(Scanner sc) {
        System.out.print("Enter Amount to Deposit: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("You Deposited Rs. " + amount);
    }
}

public class BankSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        int pin, cpin;

        // Set PIN
        do {
            System.out.println("Set Your PIN First");
            System.out.print("Enter Your PIN: ");
            pin = sc.nextInt();
            System.out.print("Confirm PIN: ");
            cpin = sc.nextInt();

            if (pin != cpin) {
                System.out.println("PIN Did Not Match!");
            }
        } while (pin != cpin);

        b.setPin(pin);

        // Enter PIN
        System.out.print("\nEnter PIN (Cover Keypad While Entering PIN): ");
        pin = sc.nextInt();

        if (pin == b.getPin()) {
            int choice;
            do {
                System.out.println("\nChoose an Option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter Option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        b.deposit(sc);
                        break;
                    case 2:
                        b.withdraw(sc);
                        break;
                    case 3:
                        b.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using our service!");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } while (choice != 4);
        } else {
            System.out.println("Wrong PIN!");
        }

        sc.close();
    }
}
