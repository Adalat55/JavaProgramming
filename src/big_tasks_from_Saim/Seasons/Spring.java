package big_tasks_from_Saim.Seasons;

public class Spring extends Season {
    /*
    Create a class Spring

 child class of Season

 constructor: set values to variables

 methods:
  activity(): Go Outside
     */

    public Spring(String name, int highestAveTemp, int lowestAveTemp) {
        super(name, highestAveTemp, lowestAveTemp);
    }
    public  void activity(){
        System.out.println("Go outside");
    }

}
