package big_tasks_from_Saim.Device;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    public void useDevice(){
        System.out.println("Using TV");
    }

}
