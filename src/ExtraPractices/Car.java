package ExtraPractices;

public class Car {

    String brand, model, color;
    double price;
    int year;


    public Car(String brand) {
        this.brand = brand;

    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }
    public Car(String brand, String model, String color){
        this(brand, model);
        this.color=color;
    }

    public Car(String brand, String model,String color,int year) {
        this(brand, model, color);
        this.year = year;
    }

    public Car(String brand, String model,String color, int year, double price) {
        this(brand, model,color, year);
        this.price = price;

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {

         Car carOne= new Car("kia", "optima", "black", 2020, 30000);


        System.out.println(carOne);
    }
}
