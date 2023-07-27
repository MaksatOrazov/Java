import javax.accessibility.AccessibleComponent;

public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Balance = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Balance = " + manager.getBalance());
        manager.withdraw(90);
        System.out.println("Balance = " + manager.getBalance());
        manager.withdraw(20);
        System.out.println("Balance = " + manager.getBalance());
    }
}