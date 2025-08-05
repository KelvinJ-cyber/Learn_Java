import java.util.Scanner;

public final class BankAccount {


    private Long accountNumber;
    private int balance;

    public void setAccountNumber (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        this.accountNumber = sc.nextLong();
    }
    public void createBalance(int initialBalance){
        this.balance = initialBalance;
        System.out.println("Account created with initial balance: " + balance + " Account No. " + accountNumber);
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Money deposited: " + amount + " | New balance: " + balance);
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("Money withdrawn: " + amount + " | New balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber();
        acc.createBalance(1000);
        acc.deposit(500);
        acc.withdraw(200);

    }
}