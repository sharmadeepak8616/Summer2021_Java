package Class9;

public class VariableScope_Example {

    double balance = 10000.11;

    public void deposit() {
        balance = balance + 5000;
    }


    public void withdraw() {
        balance = balance - 2000;
    }


    public void showBalance() {
        System.out.println(balance);
    }

    public void homeLoan() {
        double mortgageRate = 1.1;
    }


}
