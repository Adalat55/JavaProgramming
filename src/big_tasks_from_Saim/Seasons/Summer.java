package big_tasks_from_Saim.Seasons;

public class Summer extends Season {

    /*
    Create a class Summer

 child class of Season

 constructor: set values to variables

 methods:
  activity(): Drink Lemonade

     */

    public Summer(String name, int highestAveTemp, int lowestAveTemp){
        super(name, highestAveTemp, lowestAveTemp);
    }
    public void activity(){
        System.out.println("Drink Lemonade");
    }
}
