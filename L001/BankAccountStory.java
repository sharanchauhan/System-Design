package L001;

import java.io.*;

class Main {

    static class BankAccount {
        int anum;
        int money;
        static int roi;

        void announce() {
            // System.out.println(this.anum + ", " + this.money + ", " + this.roi);
            System.out.println(this.anum + ", " + this.money + ", " + roi);
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BankAccount a1 = new BankAccount();
        a1.anum = 10;
        a1.money = 100;
        // The below shown way of setting roi is a bad practice as it will first check
        // the object of a1 to
        // initialize it and then it will set the value of roi at the BankAccount object
        // a1.roi = 4;


        // The Below shown way of setting roi is a good practice as it will directly set the value of roi at
        // BankAccount object and it much faster and efficient
        BankAccount.roi=4;


        a1.announce();

        BankAccount a2 = new BankAccount();
        a2.anum = 11;
        a2.money = 110;
        // a2.roi = 5;

        a2.announce();
        a1.announce();
    }

}