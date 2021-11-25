package day54_abstraction.workplace;

import day54_abstraction.workplace.Employee;

public class Tester extends Employee {

    public Tester(String jobTitle) {
        super(jobTitle);
    }

    @Override
  public void sleep(int minutes){
      System.out.println("sleeping "+minutes+" minutes  while tests run automatically");
  }
  @Override
  public void work(){
      System.out.println(jobTitle+" - runs Test cases");
  }





}
