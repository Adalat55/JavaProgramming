package day60_collections;

import java.util.Collections;

public class UseBank {
    public static void main(String[] args) {

        Bank bank= new Bank();
        bank.balance= 500;
        bank.withdraw(350);
      //  bank.withdraw(1000);
        bank.withdraw(-50);


    }
}
