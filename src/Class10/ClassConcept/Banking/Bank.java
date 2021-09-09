package Class10.ClassConcept.Banking;

public class Bank {

    public static void main(String[] args) {


//        Accounts a1 = new Accounts();
//        /*
//
//         */
//
//        Accounts a2 = new Accounts();
//
//        a1.makeDeposit(1000);
//
//        a2.makeDeposit(500);
//
//        a1.showBalance();   // 1000
//
//        a1.makeWithdraw(200);
//
//        a1.showBalance();   // 800
//
//        a2.showBalance();   // 500

        // updateProfile("name", "John");
        // updateProfile("address", "DC");
        // updateProfile("ssn", "1234");
        // updateProfile("names", "1234");

        Customer c1 = new Customer();
        // c1 -> name = "", address = "", ssn = ""

        c1.createProfile("JOhn", "NY", "1234");
        // c1 -> name = "JOhn", address = "NY", ssn = "1234"

        Customer c2 = new Customer();
        // c1 -> name = "", address = "", ssn = ""

        c2.showProfile();
        /*
            Profile
            Name :
            SSN :
            Address :
         */

        c1.showProfile();
        /*
            Profile
            Name : JOhn
            SSN : 1234
            Address : NY
         */







    }

}
