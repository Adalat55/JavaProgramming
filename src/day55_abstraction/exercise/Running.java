package day55_abstraction.exercise;

public class Running extends Exercise {

   @Override
    public void perform(){
       System.out.println("Running ...");
   }
   @Override
    public void getCaloriesBurned(int minutes){

       System.out.println("calories burned: "+minutes*0.4);
   }


}
