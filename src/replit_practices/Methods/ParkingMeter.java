package replit_practices.Methods;

import java.util.Scanner;

public class ParkingMeter {
    /*
    The ParkingMeter class has the following:

Two instance variables named timeLeft and maxTime of type int. The value of timeLeft should be initialized to 0.

A constructor accepting a single integer parameter whose value is used to initialize the maxTime instance variable.

A method named add() that accepts an integer parameter.

If the value of the parameter is equal to 25, the value of timeLeft is increased by 30; otherwise no increase is performed. Furthermore, the increase occurs only if the value of timeLeft will not exceed the value of maxTime. add returns a boolean value: true if timeLeft was increase, false otherwise.
A method named tick() that accepts no parameters and returns no value. tick() decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.

A method named isExpired() that accepts no parameters. isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
     */
    int timeLeft=0;
    int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }
    public boolean add(int coins){
        if(coins==25&&timeLeft+30<=maxTime){
            timeLeft+=30;
            return true;
        }
        return false;
    }
    public void tick(){
        if(timeLeft>0){
            timeLeft--;
        }
    }
    public boolean isExpired(){
        if(timeLeft==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingMeter pm = new ParkingMeter(in.nextInt());
        pm.add(in.nextInt());
        pm.tick();
        System.out.println(pm.timeLeft);
        System.out.println(pm.isExpired());

    }
}
