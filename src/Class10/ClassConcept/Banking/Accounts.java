package Class10.ClassConcept.Banking;

public class Accounts {

    // Field variable
    double myBalance;
    static String bankName = "ABCD Bank";
    static String routingNumber = "12345678";

    // Methods

    /*
        Deposit                 (non-static method)
        Withdraw                (non-static method)
        CheckBalance            (non-static method)

        showTermsConditions     (static method)
     */

    /**
     * myBalance = 100000000;
     * value of myBalance is going to change by deposit/withdraw
     */


    public void makeDeposit(double amount) {
        // myBalance = myBalance + amount;
        myBalance+=amount;
    }

    public void makeWithdraw(double amount) {
        // myBalance = myBalance - amount;
        myBalance-=amount;
    }

    public void showBalance() {
        System.out.println("Balance : " + myBalance);
    }





}
