package office_hours.practice_11_10_2021;

public abstract class Phone {

    String brand,model;
    double price;
    int size;
    public abstract void calling();
    public abstract void texting();

    public Phone(String brand, String model, double price, int size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
