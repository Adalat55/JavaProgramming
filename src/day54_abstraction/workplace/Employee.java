package day54_abstraction.workplace;


import day54_abstraction.workplace.Person;

public  abstract class Employee extends Person {
        String jobTitle;
        double salary;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public abstract void work();
    }


