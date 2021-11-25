package day54_abstraction.workplace;

import day54_abstraction.workplace.Employee;

public class Chef extends Employee {
    public Chef(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Sleeping after long day for "+minutes+ " minutes");

    }

    @Override
    public void work() {

        System.out.println(jobTitle+" -Working dayshift today");

    }
}
