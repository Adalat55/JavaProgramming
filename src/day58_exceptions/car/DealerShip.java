package day58_exceptions.car;

import java.util.ArrayList;

public class DealerShip {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new BMW());
        cars.add(new Ford());
        cars.add(new Model3());
        cars.add(new Tesla());


        BMW car5= new BMW();
        cars.add(car5);

        lease(new Model3());

    }

    public static void lease(Car car){

        System.out.println("Leasing car");


    }

    public static Car getCar( int option){

        if(option==1){
            return new BMW();

        }else if (option==2){
            return new Tesla();
        }else if(option==3){
            return new Ford();
        }else {
            new Model3();

        }
     return null;
}
}
