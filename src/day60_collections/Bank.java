package day60_collections;

public class Bank {

    double balance;

    public void withdraw(double money){
        if(balance<=0){
            throw new NotEnoughMoneyException();
        }else if(money<0){
            throw new NegativeInputException();
        }
        System.out.println("Withdrawing $"+money);
        balance-=money;
        System.out.println("Your balance is: $"+balance);
    }


}
