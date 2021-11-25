package day48_Static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy stroeOne= new BestBuy("Main St");

        BestBuy storeTwo = new BestBuy("Oak Drive");

        System.out.println(stroeOne.location);
        System.out.println(storeTwo.location);

        System.out.println(BestBuy.day);
        System.out.println(stroeOne.day);

   //     BestBuy.day= "sunday";
          stroeOne.day="sunday";

        System.out.println(BestBuy.day);
        System.out.println(stroeOne.day);
        System.out.println(storeTwo.day);


    }
}
