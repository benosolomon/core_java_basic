package oops;

abstract class ABCBank{
    public static void message() {
        System.out.println("Welcomne to ABC Bank");
    }
    abstract void openAccount();
    abstract void closeAccount();
}

abstract  class BankAccount extends  ABCBank {

    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

class SavingAccount extends BankAccount {

    @Override
    void openAccount() {
        System.out.println("Open balance");
    }
    @Override
    void closeAccount() {
        System.out.println("Close balance");
    }
    @Override
    void balance() {
        System.out.println("Cheking balance");
    }

    @Override
    void deposit() {
        System.out.println("Account Deposit");
    }

    @Override
    void withdraw() {
        System.out.println("Account Withdraw");
    }
}

class CurrentAccount  extends BankAccount {
    @Override
    void openAccount() {
        System.out.println("Open balance");
    }
    @Override
    void closeAccount() {
        System.out.println("Close balance");
    }
    @Override
    void balance() {
        System.out.println("Current Account Cheking balance");
    }

    @Override
    void deposit() {
        System.out.println(" Current Account  Deposit");
    }

    @Override
    void withdraw() {
        System.out.println("Current Account  Withdraw");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        ABCBank.message();
        SavingAccount savingAccount = new SavingAccount();
       savingAccount.message();

        savingAccount.deposit();
        savingAccount.balance();
        savingAccount.withdraw();
        savingAccount.closeAccount();

        System.out.println("*******************************");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.withdraw();
        currentAccount.deposit();
        currentAccount.deposit();
        currentAccount.openAccount();
    }
}
