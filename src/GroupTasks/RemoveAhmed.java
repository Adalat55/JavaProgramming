package GroupTasks;

import java.util.ArrayList;

public class RemoveAhmed {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed

     */

    public static ArrayList<String> removeAhmed(ArrayList<String> peopleNames, String name){

        peopleNames.removeIf(n->n.equals(name));  //for(String eachElement: peoplesNames)

        return peopleNames;
    }

    public static void main(String[] args) {

        ArrayList<String> peopleNames= new ArrayList<>();
        peopleNames.add("Ahmed");
        peopleNames.add("John");
        peopleNames.add("Eric");
        peopleNames.add("Ahmed");
        System.out.println(peopleNames);
        System.out.println(removeAhmed(peopleNames,"Ahmed"));
    }
}
