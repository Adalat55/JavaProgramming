package day49_encupsulation;

public class UseWaterBottle {
    public static void main(String[] args) {

        WaterBottle bottle1= new WaterBottle("Sparklet", 3);



        System.out.println(bottle1.getBrand());
        System.out.println(bottle1.getOunces());

        bottle1.setBrand("Fanta ");
        bottle1.setOunces(-5);

        System.out.println(bottle1.getBrand());
        System.out.println(bottle1.getOunces());


    }
}
