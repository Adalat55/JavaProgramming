package GroupTasks;

public class WaterBottle {
    /*
    Create a class called WaterBottle
- instance variables: brand, ounces

- Create a constructor to initialize the two fields

- Encapsulate the variables

- Bonus: pervent negative ounces to be assigned and null or empty space to be assigned to brand
     */

     private String brand;
     private int ounces;

    public WaterBottle(String brand, int ounces) {
        setBrand(brand);
       setOunces(ounces);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand!=null&&!brand.contains(" ")){
        this.brand = brand;
        }
    }

    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        if(ounces>=0) {
            this.ounces = ounces;
        }
    }
}