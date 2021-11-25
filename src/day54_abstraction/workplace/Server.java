package day54_abstraction.workplace;

import day54_abstraction.workplace.Employee;

public class Server extends Employee {

    public Server(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public void sleep(int minutes) {

        System.out.println("Sleeping for "+minutes+" minutes after finishing his job");

    }

    @Override
    public void work() {
        System.out.println(jobTitle+" -Working at nearby restaurant");

    }
}
