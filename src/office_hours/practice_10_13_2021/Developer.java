package office_hours.practice_10_13_2021;

public class Developer {
    /*
    create a class called Developer
                    Attributes:
                        instance: name, employee id, job title, salary
                        static: can code (boolean)

                    Constructor:
                        - accepts and sets all instance variables
                        - overload to also create an object with only the name and employee id

                    Actions:
                        coding(),  fixingBug(), toString()

     */

    String name;
    int employeeId;
    String jobTitle;
    double salary;

    static boolean canCode;

    static {
        canCode=true;
    }

    public Developer(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this(name, employeeId);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void coding(){
        System.out.println(name + " is coding");
    }

    @Override
    public String toString() {
        return "Developer: " +
                "name=: " + name +
                ", employeeId: " + employeeId +
                ", jobTitle: " + jobTitle  +
                ", salary: " + salary;
    }

    public static void main(String[] args) {

        Developer devOne= new Developer("James", 1234, "SDET", 120000);

        devOne.coding();
        System.out.println(devOne);



    }
}
