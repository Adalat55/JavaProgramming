package day52_inheritance.person;

import java.util.ArrayList;

public class Person {
    /*
    Task:

    Person
        name, age, birthYear, hobbies

        walk()

    child of Person:

        Student
            schoolName

            study()

        Employee
            jobTitle, isFullTime

            work()

        child of Employee:

            Tester

            Developer
     */

    String name;
    int age;
    int birthYear;
    ArrayList<String> hobbies;




    public Person(String name, int age, int birthYear){
        this.name=name;
        this.age= age;
        this.birthYear=birthYear;
        hobbies = new ArrayList<>();
    }
    public Person(){

    }


    public void walk(){
        System.out.println(name+ " is walking");
    }

}
