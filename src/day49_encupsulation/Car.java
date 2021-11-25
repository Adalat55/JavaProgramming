package day49_encupsulation;

public class Car {
    Driver driver;

    public Car(String name, String licenseNumber, int age){
        driver= new Driver(name,licenseNumber,age);
    }

//    String driver; //name, licNum, age
//    String engine;// cylender, horsepowery

}
class Driver{

    String name;
    String licenseNumber;
    int age;


    public Driver(String name, String licenseNumber, int age) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", age=" + age +
                '}';
    }
}

