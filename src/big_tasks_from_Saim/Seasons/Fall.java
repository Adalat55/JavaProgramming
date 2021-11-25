package big_tasks_from_Saim.Seasons;

public class Fall extends Season {
    /*Create a class Fall

 child class of Season

 constructor: set values to variables

 methods:
  activity(): Read A Book


     */
 public Fall(String name, int highestAveTemp, int lowestAveTemp){
     super(name, highestAveTemp, lowestAveTemp);
 }
 public void activity(){
     System.out.println("Read a Book");
 }
}
