package day54_abstraction.workplace;

import day54_abstraction.workplace.Employee;

public class Developer extends Employee {
    public Developer(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public void sleep(int minutes) {

        System.out.println("Sleeping for "+minutes+" minutes after passing code to the tester");


    }
    @Override
    public void work() {

        System.out.println(jobTitle+" -Writes software code");

    }
}
