package assignments.java.Week1.BankApp;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccount = 0;
    private static double totalAmountOfMoney = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
    }

    public BankAccount() {
        numberOfAccount++;
    }

    public static void printTotalAmount() {
        System.out.println("You have $" + totalAmountOfMoney + " in your account");
    }

    public static void createdAccounts() {
        System.out.println("Total number of accounts: " + numberOfAccount);
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setSavingBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingBalance() {
        return savingsBalance;
    }

    public double getTotalAmountOfMoney(String accountType) {
        if (accountType.equals("checking")) {
            totalAmountOfMoney = this.checkingBalance;
            return totalAmountOfMoney;
        } else if (accountType.equals("saving")) {
            totalAmountOfMoney = this.savingsBalance;
            return totalAmountOfMoney;
        } else {
            return -1;
        }
    }

    public double depositFunds(double dollarAmount, String accountType) {

        if (accountType.equals("checking")) {
            this.checkingBalance += dollarAmount;
            return checkingBalance;
        } else if (accountType.equals("saving")) {
            this.savingsBalance += dollarAmount;
            return savingsBalance;
        } else {
            return -1;
        }
    }

    public double withdrawFunds(double dollarAmount, String accountType) {
        if (accountType.equals("checking") && this.checkingBalance > dollarAmount) {
            this.checkingBalance -= dollarAmount;
            return checkingBalance;
        } else if (accountType.equals("saving") && this.savingsBalance > dollarAmount) {
            this.savingsBalance -= dollarAmount;
            return dollarAmount;
        } else {
            return -1;
        }
    }
}
