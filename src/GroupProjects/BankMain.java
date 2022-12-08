package GroupProjects;

public class BankMain {
    public static void main(String[] args) {

        BankAccount ali = new BankAccount("Ali");
        ali.deposit(500.00);
        BankAccount maria = new BankAccount("Maria");
        maria.deposit(200.00);
        ali.transfer(100.00, maria);
        ali.withdraw(50.00);
        ali.withdraw(300.00);
        System.out.println(ali.getBalance());
        ali.withdraw(100.00);
        ali.payCreditCardBill(100);
    }
}

