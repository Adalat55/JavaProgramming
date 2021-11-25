package big_tasks_from_Saim.Device;

public class Device {
    /*
    create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()
     */
    String  brand, model;
    double price;
    boolean isWireless;

    public Device(String brand, String model, double price, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
    public void useDevice(){
    }
}
