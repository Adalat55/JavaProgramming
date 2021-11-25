package ExtraPractices;

public class UseWaterBottle {

    public static void main(String[] args) {

        WaterBottle bottle = new WaterBottle("Water", 3);

        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());

        bottle.setBrand("Fanta");
        bottle.setOunces(6);

        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());
    }
}
