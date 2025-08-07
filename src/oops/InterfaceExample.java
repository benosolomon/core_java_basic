package oops;

interface IABank {
    void openAccount();
    void closeAccount();
}

interface  IBankAccount {
     default void message() {
        System.out.println("Message");
    }
    void deposit();
    void withdraw();
    void balance();
}

class Saving implements IBankAccount,IABank {

    @Override
    public void openAccount() {
        System.out.println("open Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("close Account");
    }

    @Override
    public void withdraw() {
     System.out.println("Withdraw in Saving Account");
    }

    @Override
    public void balance() {
        System.out.println("Balance in Saving Account");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit in Saving Account");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
    Saving saving = new Saving();
    saving.balance();
    saving.deposit();
    saving.withdraw();
    saving.message();
    saving.openAccount();
    saving.closeAccount();
    }
}
