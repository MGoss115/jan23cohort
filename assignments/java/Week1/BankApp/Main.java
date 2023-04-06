package assignments.java.Week1.BankApp;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        System.out.println(account1.depositFunds(150, "checking"));
        System.out.println(account1.depositFunds(250, "checking"));
        System.out.println(account1.depositFunds(250, "saving"));
        System.out.println(account1.depositFunds(250, "saving"));
        System.out.println(account1.withdrawFunds(200, "checking"));
        System.out.println(account1.getTotalAmountOfMoney("checking"));

        BankAccount.printTotalAmount();

    }

}
