package day60_collections;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        System.out.println("Your balance is either negative or zero");
    }

}
